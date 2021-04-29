package db;
/**
 * This implementation of the DBConnectorInterface interface is for MySQL databases.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MySQLTranslator implements DBTranslatorInterface {

    Connection connection = null;
    Statement statement = null;

    // Connection Settings. Change these to connect to your database.
    // db_location is either "localhost", an IP address, or a URL.
    private static final String db_location = "35.232.56.229";
    private static final int db_port = 3306;
    private static final String db_name = "recipesToInfinitydb";
    private static final String db_user = "root";
    //<editor-fold desc="private static final String db_password">
    private static final String db_password = "Recipestoinfinityspring2021";
    //</editor-fold>


    // Change this to true to just print out the queries and not execute them.
    private static final Boolean TEST_MODE = false;


    public MySQLTranslator() {
        // Initialize the connection at start-up.
        if (!MySQLTranslator.TEST_MODE) {
            this.connect();
        } else {
            System.out.println("==== TEST MODE ACTIVE: CHANGE TEST MODE PROPERTY TO EXECUTE ======");
        }
    }


    /**
     * Generates a MySQL specific string for saving objects to the database.
     * @param _keyValuePairs
     * @param _table
     * @return int
     */
    @Override
    public int createObject(Map<String, String> _keyValuePairs, String _table) {
        String query =  "INSERT INTO " + _table;
        String names = "(";
        String values = "VALUES (";
        for (Map.Entry<String, String> entry : _keyValuePairs.entrySet()){
            names+=  " `" + entry.getKey() + "`, ";
            values+= " '" + entry.getValue() + "', ";
        }
        // Trim off the last comma.
        names = names.substring(0, names.length() - 2);
        values = values.substring(0, values.length() - 2);
        names+= ") ";
        values+= ")";
        query+= names + values;
        // Execute the query.
        int newKey = this.executeInsert(query);
        if (newKey == -1) {
            System.out.println("Database Error: Could not create new record");
            return 0;
        }
        return newKey;
    }

    /**
     * This helper function runs the query given by the above method.
     * @TODO - See if we can consolidate this method with the other helper methods
     * below.
     * @param query
     * @return
     */
    private int executeInsert(String query){
        if (MySQLTranslator.TEST_MODE){
            System.out.println(query);
            return 3;
        }

        int key = -1;
        try {
            this.statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet result = statement.getGeneratedKeys();
            if (result.next()){
                key = result.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Query Error: " + ex.getMessage());
            Logger.getLogger(DataStoreAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return key;
    }


    /**
     * Generates a MySQL query for updating an object to the database.
     * @param _keyValuePairs
     * @param _uuid
     * @param _table
     * @return Boolean
     */
    @Override
    public Boolean updateObject(Map<String,String> _keyValuePairs, String _uuid, String _table) {
        String query =  "UPDATE " + _table + " SET ";
        //iterate over map
        String updates = "";
        for (Map.Entry<String, String> entry : _keyValuePairs.entrySet()){
            updates+= " `" + entry.getKey() + "` = \"" + entry.getValue() + "\",";
        }
        //shed off the last comma
        updates = updates.substring(0, updates.length()-1);
        query = query + updates + " WHERE `uuid` = '" + _uuid + "'";
        return this.executeUpdate(query);
    }


    /**
     * This helper method runs the query generated by the updateObject method.
     * @param query
     */
    private Boolean executeUpdate(String query){
        if (MySQLTranslator.TEST_MODE){
            System.out.println(query);
            return true;
        }

        int result = 0;
        try {
            result = statement.executeUpdate(query, Statement.NO_GENERATED_KEYS);
        } catch (SQLException ex) {
            System.out.println("Query Error: " + ex.getMessage());
            Logger.getLogger(DataStoreAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Result returns the number of rows affected. If no rows were affected,
        // the return false.
        return (result > 0);
    }


    /**
     * Reads an object from the database given a set of conditionals in name-value
     * pair format. This is an overloaded readObject method that, by default, doesn't load deleted objects.
     * @TODO - Implement this method.
     * @param _keyValuePairs
     * @return
     */
    @Override
    public HashMap<String, Object> readObject(Map<String,String> _keyValuePairs, String _table) {
        // By default we do not load deleted object.
        return this.readObject(_keyValuePairs, _table, false);
    }


    public ArrayList<FruitsVegetables> loadFruitsVeggies(Map<String,String> _keyValuePairs, String _table) {
        // By default we do not load deleted object.
        return this.readFruitsVeggies(_keyValuePairs, _table, false);
    }

    /**
     * Same as above except allows the option of reading deleted objects from the database.
     * @param _keyValuePairs
     * @param _table
     * @param _deleted whether to load deleted objects.
     * @return
     */
    public HashMap<String, Object> readObject(Map<String,String> _keyValuePairs, String _table, boolean _deleted) {
    return new HashMap<String,Object>();
    }


    public ArrayList<FruitsVegetables> readFruitsVeggies(Map<String,String> _keyValuePairs, String _table, boolean _deleted) {
        // Start the query.
        String query =  "SELECT * FROM " + _table + " WHERE ";
        // Initialize the condition string.
        String condition = "";


        // Iterate over map.
        for (Map.Entry<String, String> entry : _keyValuePairs.entrySet()){
            condition+= " `" + entry.getKey() + "` = \"" + entry.getValue() + "\" AND";
        }

        if (_deleted) {
            // Then we'll ignore the active=1 condition and just shed off the last AND
            condition = condition.substring(0, condition.length()-3);


        } else {
            // We'll add the condition that the object must be active.
            condition+= " `active` = 1";

        }
        // Combine the query with the condition.
        query = query + condition;



        ResultSet results = this.runQuery(query);
        System.out.println(query);
        // Create a flag for judging if the result set is empty.
        boolean isEmpty = true;
        // Initialize a object to store the results.
        ArrayList<FruitsVegetables> fruits_veggies = new ArrayList<>();

        try {
            while (results.next()) {
                FruitsVegetables myFruit = new FruitsVegetables();
                myFruit.setMonth(results.getString("month"));
                myFruit.setType(results.getString("type"));
                myFruit.setId(results.getInt("id"));
                myFruit.setUuid(results.getString("uuid"));
                myFruit.setName(results.getString("name"));
                myFruit.makeActive();
                fruits_veggies.add(myFruit);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLTranslator.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Close the statement connection.


        return fruits_veggies;
    }


    /**
     * This method deletes an object from the database.
     * @TODO - Implement this method. We want to just make an update to the database
     * to set an active flag to false instead of actually deleting records.
     * @param uuid
     * @return Boolean
     */
    @Override
    public Boolean deleteObject(String uuid) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    /**
     * Generic helper method for running queries.
     * @param query
     * @return ResultSet
     */
    protected ResultSet runQuery(String query){
        if (MySQLTranslator.TEST_MODE){
            System.out.println(query);
            return null;
        }
        else {
            ResultSet result = null;
            try {
                result = statement.executeQuery(query);
            } catch (SQLException ex) {
                System.out.println("Query Error: " + ex.getMessage());
            }
            return result;
        }
    }

    /**
     * This helper method establishes a connection to the database.
     */
    private void connect() {
        try {
            String host = "jdbc:mysql://" + MySQLTranslator.db_location + ":" + MySQLTranslator.db_port  + "/" + MySQLTranslator.db_name;

            this.connection = DriverManager.getConnection(host, MySQLTranslator.db_user, MySQLTranslator.db_password);
            this.statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println("No Connection to DB: " + ex.getMessage());
        }
    }

}
