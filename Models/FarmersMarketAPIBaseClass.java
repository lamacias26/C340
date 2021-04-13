package Models;

/**
 * Parent class for any class that is going to make calls to the Farmers Market API
 * Last Updated: 4/7/21
 * @author Leslie Macias Magana
 */

import API.FarmersMarketAPITranslator;
import API.FarmersMarketApiInterface;

public class FarmersMarketAPIBaseClass {
    //Designates the translator that we want to use. In this case FarmersMarketAPITranslator.
    protected final static FarmersMarketApiInterface myMarketAPI = new FarmersMarketAPITranslator();
}
