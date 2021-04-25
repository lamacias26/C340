package db;

public class Main {

    public static void main(String[] args) {
        recipeInstance produce = new recipeInstance();
        produce.setName("pineapple");
        produce.setMonth("January");

        // produce.setJanuaryFruit("apple");

        produce.save();
    }
}
