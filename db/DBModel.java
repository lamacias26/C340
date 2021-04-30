package db;

import java.util.*;

public class DBModel {


    public static ArrayList<FruitsVegetables> JanuaryFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_january;
        fruit_january = new HashMap<>();
        fruit_january.put("month", "January");
        fruit_january.put("type", "fruit");
        ArrayList<FruitsVegetables> january_fruit = newSql.loadFruitsVeggies(fruit_january, "fruits_veggies");
        for (FruitsVegetables thisFruit : january_fruit) {
            System.out.println(thisFruit.getName());
        }
        return january_fruit;
    }

    public static ArrayList<FruitsVegetables> FebruaryFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_february;
        fruit_february = new HashMap<>();
        fruit_february.put("month", "February");
        fruit_february.put("type", "fruit");

        ArrayList<FruitsVegetables> february_fruit = newSql.loadFruitsVeggies(fruit_february, "fruits_veggies");
        for (FruitsVegetables thisFruit : february_fruit) {
            System.out.println(thisFruit.getName());
        }
        return february_fruit;
    }

    public static ArrayList<FruitsVegetables> MarchFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_march;
        fruit_march = new HashMap<>();
        fruit_march.put("month","March");
        fruit_march.put("type", "fruit");

        ArrayList<FruitsVegetables> march_fruit = newSql.loadFruitsVeggies(fruit_march, "fruits_veggies");
        for(FruitsVegetables thisFruit : march_fruit){
            System.out.println(thisFruit.getName());
        }
        return march_fruit;
    }

    public static ArrayList<FruitsVegetables> AprilFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_april;
        fruit_april = new HashMap<>();
        fruit_april.put("month","April");
        fruit_april.put("type", "fruit");

        ArrayList<FruitsVegetables> april_fruit = newSql.loadFruitsVeggies(fruit_april, "fruits_veggies");
        for(FruitsVegetables thisFruit : april_fruit){
            System.out.println(thisFruit.getName());
        }
           return april_fruit;
    }
    public static ArrayList<FruitsVegetables> MayFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_may;
        fruit_may = new HashMap<>();
        fruit_may.put("month","May");
        fruit_may.put("type", "fruit");

        ArrayList<FruitsVegetables> may_fruit = newSql.loadFruitsVeggies(fruit_may, "fruits_veggies");
        for(FruitsVegetables thisFruit : may_fruit){
            System.out.println(thisFruit.getName());
        }
        return may_fruit;
    }
    public static ArrayList<FruitsVegetables> JuneFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_june;
        fruit_june = new HashMap<>();
        fruit_june.put("month","June");
        fruit_june.put("type", "fruit");

        ArrayList<FruitsVegetables> june_fruit = newSql.loadFruitsVeggies(fruit_june, "fruits_veggies");
        for(FruitsVegetables thisFruit : june_fruit){
            System.out.println(thisFruit.getName());
        }
        return june_fruit;
    }
    public static ArrayList<FruitsVegetables> JulyFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_july;
        fruit_july = new HashMap<>();
        fruit_july.put("month","July");
        fruit_july.put("type", "fruit");

        ArrayList<FruitsVegetables> july_fruit = newSql.loadFruitsVeggies(fruit_july, "fruits_veggies");
        for(FruitsVegetables thisFruit : july_fruit){
            System.out.println(thisFruit.getName());
        }
        return july_fruit;
    }
    public static ArrayList<FruitsVegetables> AugustFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_august;
        fruit_august = new HashMap<>();
        fruit_august.put("month","August");
        fruit_august.put("type", "fruit");

        ArrayList<FruitsVegetables> august_fruit = newSql.loadFruitsVeggies(fruit_august, "fruits_veggies");
        for(FruitsVegetables thisFruit : august_fruit){
            System.out.println(thisFruit.getName());
        }
        return august_fruit;
    }

    public static ArrayList<FruitsVegetables> SeptemberFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_september;
        fruit_september = new HashMap<>();
        fruit_september.put("month","September");
        fruit_september.put("type", "fruit");

        ArrayList<FruitsVegetables> september_fruit = newSql.loadFruitsVeggies(fruit_september, "fruits_veggies");
        for(FruitsVegetables thisFruit : september_fruit){
            System.out.println(thisFruit.getName());
        }
        return september_fruit;
    }

    public static ArrayList<FruitsVegetables> OctoberFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_october;
        fruit_october = new HashMap<>();
        fruit_october.put("month","October");
        fruit_october.put("type", "fruit");

        ArrayList<FruitsVegetables> october_fruit = newSql.loadFruitsVeggies(fruit_october, "fruits_veggies");
        for(FruitsVegetables thisFruit : october_fruit){
            System.out.println(thisFruit.getName());
        }
        return october_fruit;
    }

    public static ArrayList<FruitsVegetables> NovemberFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_november;
        fruit_november = new HashMap<>();
        fruit_november.put("month","November");
        fruit_november.put("type", "fruit");

        ArrayList<FruitsVegetables> november_fruit = newSql.loadFruitsVeggies(fruit_november, "fruits_veggies");
        for(FruitsVegetables thisFruit : november_fruit){
            System.out.println(thisFruit.getName());
        }
        return november_fruit;
    }

    public static ArrayList<FruitsVegetables> DecemberFruitMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> fruit_december;
        fruit_december = new HashMap<>();
        fruit_december.put("month","December");
        fruit_december.put("type", "fruit");

        ArrayList<FruitsVegetables> december_fruit = newSql.loadFruitsVeggies(fruit_december, "fruits_veggies");
        for(FruitsVegetables thisFruit : december_fruit){
            System.out.println(thisFruit.getName());
        }
        return december_fruit;
    }

    public static ArrayList<FruitsVegetables> JanuaryVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_january;
        vegetable_january = new HashMap<>();
        vegetable_january.put("month","January");
        vegetable_january.put("type", "vegetable");

        ArrayList<FruitsVegetables> january_vegetable = newSql.loadFruitsVeggies(vegetable_january, "fruits_veggies");
        for(FruitsVegetables thisFruit : january_vegetable){
            System.out.println(thisFruit.getName());
        }
        return january_vegetable;
    }

    public static ArrayList<FruitsVegetables> FebruaryVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_february;
        vegetable_february = new HashMap<>();
        vegetable_february.put("month","February");
        vegetable_february.put("type", "vegetable");

        ArrayList<FruitsVegetables> february_vegetable = newSql.loadFruitsVeggies(vegetable_february, "fruits_veggies");
        for(FruitsVegetables thisFruit : february_vegetable){
            System.out.println(thisFruit.getName());
        }
        return february_vegetable;
    }

    public static ArrayList<FruitsVegetables> MarchVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_march;
        vegetable_march = new HashMap<>();
        vegetable_march.put("month","March");
        vegetable_march.put("type", "vegetable");

        ArrayList<FruitsVegetables> march_vegetable = newSql.loadFruitsVeggies(vegetable_march, "fruits_veggies");
        for(FruitsVegetables thisFruit : march_vegetable){
            System.out.println(thisFruit.getName());
        }
        return march_vegetable;
    }

    public static ArrayList<FruitsVegetables> AprilVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_april;
        vegetable_april = new HashMap<>();
        vegetable_april.put("month","April");
        vegetable_april.put("type", "vegetable");

        ArrayList<FruitsVegetables> april_vegetable = newSql.loadFruitsVeggies(vegetable_april, "fruits_veggies");
        for(FruitsVegetables thisFruit : april_vegetable){
            System.out.println(thisFruit.getName());
        }
        return april_vegetable;
    }

    public static ArrayList<FruitsVegetables> MayVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_may;
        vegetable_may = new HashMap<>();
        vegetable_may.put("month","May");
        vegetable_may.put("type", "vegetable");

        ArrayList<FruitsVegetables> may_vegetable = newSql.loadFruitsVeggies(vegetable_may, "fruits_veggies");
        for(FruitsVegetables thisFruit : may_vegetable){
            System.out.println(thisFruit.getName());
        }
        return may_vegetable;
    }

    public static ArrayList<FruitsVegetables> JuneVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_june;
        vegetable_june = new HashMap<>();
        vegetable_june.put("month","June");
        vegetable_june.put("type", "vegetable");

        ArrayList<FruitsVegetables> june_vegetable = newSql.loadFruitsVeggies(vegetable_june, "fruits_veggies");
        for(FruitsVegetables thisFruit : june_vegetable){
            System.out.println(thisFruit.getName());
        }
        return june_vegetable;
    }

    public static ArrayList<FruitsVegetables> JulyVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_july;
        vegetable_july = new HashMap<>();
        vegetable_july.put("month","July");
        vegetable_july.put("type", "vegetable");

        ArrayList<FruitsVegetables> july_vegetable = newSql.loadFruitsVeggies(vegetable_july, "fruits_veggies");
        for(FruitsVegetables thisFruit : july_vegetable){
            System.out.println(thisFruit.getName());
        }
        return july_vegetable;
    }

    public static ArrayList<FruitsVegetables> AugustVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_august;
        vegetable_august = new HashMap<>();
        vegetable_august.put("month","August");
        vegetable_august.put("type", "vegetable");

        ArrayList<FruitsVegetables> august_vegetable = newSql.loadFruitsVeggies(vegetable_august, "fruits_veggies");
        for(FruitsVegetables thisFruit : august_vegetable){
            System.out.println(thisFruit.getName());
        }
        return august_vegetable;
    }

    public static ArrayList<FruitsVegetables> SeptemberVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_september;
        vegetable_september = new HashMap<>();
        vegetable_september.put("month","September");
        vegetable_september.put("type", "vegetable");

        ArrayList<FruitsVegetables> september_vegetable = newSql.loadFruitsVeggies(vegetable_september, "fruits_veggies");
        for(FruitsVegetables thisFruit : september_vegetable){
            System.out.println(thisFruit.getName());
        }
        return september_vegetable;
    }

    public static ArrayList<FruitsVegetables> OctoberVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_october;
        vegetable_october = new HashMap<>();
        vegetable_october.put("month","October");
        vegetable_october.put("type", "vegetable");

        ArrayList<FruitsVegetables> october_vegetable = newSql.loadFruitsVeggies(vegetable_october, "fruits_veggies");
        for(FruitsVegetables thisFruit : october_vegetable){
            System.out.println(thisFruit.getName());
        }
        return october_vegetable;
    }

    public static ArrayList<FruitsVegetables> NovemberVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_november;
        vegetable_november = new HashMap<>();
        vegetable_november.put("month","November");
        vegetable_november.put("type", "vegetable");

        ArrayList<FruitsVegetables> november_vegetable = newSql.loadFruitsVeggies(vegetable_november, "fruits_veggies");
        for(FruitsVegetables thisFruit : november_vegetable){
            System.out.println(thisFruit.getName());
        }
        return november_vegetable;
    }

    public static ArrayList<FruitsVegetables> DecemberVegetableMethod() {
        MySQLTranslator newSql = new MySQLTranslator();
        Map<String, String> vegetable_december;
        vegetable_december = new HashMap<>();
        vegetable_december.put("month","December");
        vegetable_december.put("type", "vegetable");

        ArrayList<FruitsVegetables> december_vegetable = newSql.loadFruitsVeggies(vegetable_december, "fruits_veggies");
        for(FruitsVegetables thisFruit : december_vegetable){
            System.out.println(thisFruit.getName());
        }
        return december_vegetable;
    }
}
