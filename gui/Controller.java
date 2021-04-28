package gui;

import Models.MarketID;
import Models.Recipe;
import Models.ZipCode;
import gui.RTIUI;
import gui.Main;

public class Controller {

    private MarketID model;

    private ZipCode secondModel;

    private Recipe thirdModel;

    private RTIUI recipeView;
/**
    public SampleViewController(MarketID model, ZipCode secondModel, Recipe thirdModel, RTIUI recipeView) {
        this.model = model;
        this.secondModel = secondModel;
        this.thirdModel = thirdModel;
        this.recipeView = recipeView;
    }

**/

    /**
     * Received help
     * Gets the marketid from RTIUI
     * @param _zipCode
     */

    public void ingestZipCode(String _zipCode) {
        gui.RTIUI.sendMarketId();
    }

    /**
     * Received help
     * Gets the market id from RTIUI
     * @param _marketId
     */
    public void ingestMarketId(String _marketId) {
        gui.RTIUI.sendMarketId();
    }

    public void ingestIngredients(String _ingredients) {
        gui.RTIUI.sendRecipe();
    }
    public void setUsersZipcode(String zipcode) {
        secondModel.setZipcode(zipcode);
    }

    public String getUsersZipcode() {
        return secondModel.getZipcode();
    }

    public void setUsersMarketID(String id) {
        model.setId(id);
    }

    public String getUsersMarketID() {
        return model.getId();
    }

    public void setUsersIngredient(String _ingredient) {
        thirdModel.setIngredient(_ingredient);
    }

    public String getUsersIngredient() {
        return thirdModel.getIngredient();
    }

/**
    public void updateView() {
        recipeView.recipesToInfinityGui(model.getId(), secondModel.getZipcode(), thirdModel.getIngredient());
    }
**/

}
