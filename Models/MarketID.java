package Models;

/**
 * The MarketID class handles all functionality related to market details..
 * Last Updated: 4/7/2021
 * @author Leslie Macias Magana
 */
public class MarketID {
    protected String id;
    protected String name;

    public MarketID() {

    }

    public MarketID(String id, String name){
        this.id = id;
        this.name = name;
    }

    public static MarketID getMarketInfoByID(String _id){
        MarketID id = new MarketID();
        id.setId(_id);
        return FarmersMarketAPIBaseClass.myMarketAPI.loadMarketByID(_id);
    }

    // ================ GETTERS =================
    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    // ================ SETTERS =================
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String _name) {
        this.name = _name;
    }
}
