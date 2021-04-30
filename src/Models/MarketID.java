package Models;
/**
 * Last Updated: 4/27/2021
 * The MarketID class handles all functionality related to market details..
 * @author Leslie Macias Magana
 */

import Events.APIEvent;
import Events.APIMessage;

public class MarketID extends APIBase {

    public static String id;
    protected String name;

    public MarketID(){
        System.out.println("MarketID Model Loaded");
    }

    public MarketID(String id, String name){
        this.id = id;
        this.name = name;
    }

    public static MarketID getMarketInfoByID(String _id){
        MarketID id = new MarketID();
        id.setId(_id);
        return APIBase.myMarketAPI.loadMarketByID(_id);
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

    public void marketIDHasBeenSearched() {
        // An item has been added to the ticket. Fire an event and let everyone know.
        System.out.println("MarketID has been searched.");
    }


    @Override
    public void messageReceived(APIEvent event) {
        switch (event.getMessage().getCode()) {
            case APIMessage.MARKET_ID_SEARCH:
                this.marketIDHasBeenSearched();
                break;
            default:
                System.out.println("Ignoring Message Event. Irrelevant to Inventory: " + event.getMessage().getCode());
                break;
        }
    }

}
