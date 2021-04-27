package Models;
/**
 * The MarketID class handles all functionality related to market details..
 * Last Updated: 4/27/2021
 * @author Leslie Macias Magana
 */

public class MarketID extends FarmersMarketAPIBaseClass{
    public static String id;

    public void MarketID(){}

    public static MarketID getMarketInfoByID(String _id){
        MarketID id = new MarketID();
        id.setId(_id);
        return FarmersMarketAPIBaseClass.myMarketAPI.loadMarketByID(_id);
    }

    // ================ GETTERS =================
    public String getId(){
        return id;
    }

    // ================ SETTERS =================
    public void setId(String id) {
        this.id = id;
    }
}
