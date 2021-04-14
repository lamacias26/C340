package db;

public class Main {

    public static void main(String[] args) {
        recipeInstance produce = new recipeInstance();
        produce.setJanuaryFruit("Pear");
        produce.save();
    }

}
