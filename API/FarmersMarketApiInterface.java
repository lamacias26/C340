package API;

/**
 * Last Updated 4/7/2021
 * This API interface defines the method(s) that need to be implemented for any
 * valid API connector translator class.
 * @author Leslie Macias Magana
 */
import java.util.ArrayList;
import Models.*;


public interface FarmersMarketApiInterface {

    public ArrayList<MarketID> loadMarketByZip(String _zipcode);
    public MarketID loadMarketByID(String _id);
}
