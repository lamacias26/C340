package API;
/**
 * Last Updated: 4/7/21
 * This translator class is used to speak to the search.ams.usda.gov API.
 * @author Leslie Macias Magana
 */

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import Models.*;

public class FarmersMarketAPITranslator implements FarmersMarketApiInterface {

    // Create a HTTP Connection.
    private static final String farmersBaseUrl = "https://search.ams.usda.gov/farmersmarkets/v1/data.svc/";
    private static final String zipCallAction = "zipSearch?zip=";
    private static final String idCallAction = "mktDetail?id=";


    /**
     * Finds local farmers markets depending on zipcode.
     * @param _zipcode
     * @return
     */
    @Override
    public ArrayList<MarketID> loadMarketByZip(String _zipcode) {
        String urlString = zipCallAction + _zipcode;
        ArrayList<MarketID> markets = new ArrayList<>();
        try {
            // Make the connection.
            URL url = new URL(FarmersMarketAPITranslator.farmersBaseUrl + urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Examine the response code.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.println("Error: Could not load " + status);
            } else {
                //Parsing input stream into a text string
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                // Close the connections.
                in.close();
                con.disconnect();
                //Parse that object into a usable Java JSON object.
                JSONObject obj = new JSONObject(content.toString());
                // Loops to get a list of local farmers markets and their market id's.
                JSONArray resultsArray = obj.getJSONArray("results");
                for (int i = 0; i < resultsArray.length(); i++) {
                    JSONObject obj_ResultsList = resultsArray.getJSONObject(i);
                    System.out.println("Market Name: " + obj_ResultsList.getString("marketname"));
                    String marketName = obj_ResultsList.getString("marketname");
                    System.out.println("Market ID: " + obj_ResultsList.getString("id"));
                    String marketId = obj_ResultsList.getString("id");
                    MarketID market = new MarketID(marketId, marketName);
                    markets.add(market);
                }

            }
        } catch (Exception ex) {
            System.out.println("Error:" + ex);
        }
        return markets;
    }


    /**
     * Obtains more information on the local farmers markets.
     * @param _id
     * @return
     */
    @Override
    public MarketID loadMarketByID(String _id) {

        String urlString = idCallAction + _id;
        try {
            // Make the connection.
            URL url = new URL(FarmersMarketAPITranslator.farmersBaseUrl + urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Examine the response code.
            int status = con.getResponseCode();
            if (status != 200) {
                System.out.println("Error: Could not load " + status);
            } else {
                //Parsing input stream into a text string
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                // Close the connections.
                in.close();
                con.disconnect();
                //Parse that object into a usable Java JSON object.
                JSONObject obj = new JSONObject(content.toString());
                // Gets market address and the products they sell.
                JSONObject detailsObject = obj.getJSONObject("marketdetails");
                System.out.println("Market Address: " + detailsObject.getString("Address"));
                System.out.println("Products Sold: " + detailsObject.getString("Products"));


            }
        } catch (Exception ex) {
            System.out.println("Error:" + ex);
        }
        return null;
    }

}


