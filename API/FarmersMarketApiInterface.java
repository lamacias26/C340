package API;

/**
 * This API interface defines the method(s) that need to be implemented for any
 * valid API connector translator class.
 * Last Updated 4/7/2021
 * @author Leslie Macias Magana
 */

import Models.MarketID;
import Models.ZipCode;

import java.util.ArrayList;

public interface FarmersMarketApiInterface {

    public ArrayList<MarketID> loadMarketByZip(String _zipcode);
    public MarketID loadMarketByID(String _id);
}
