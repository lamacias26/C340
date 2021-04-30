package Models;

/**
 * Last Updated: 4/27/2021
 * The ZipCode class handles all functionality related to finding markets by zipcode.
 * @author Leslie Macias Magana
 */
import Events.APIEvent;
import Events.APIMessage;

import java.util.ArrayList;

public class ZipCode extends APIBase {
    protected String zipcode;

    public  ZipCode(){
        System.out.println("ZipCode model loaded.");
    }

    public static ArrayList<MarketID> getMarketByZip(String _zipcode){
        ZipCode zipcode = new ZipCode();
        zipcode.setZipcode(_zipcode);
        return APIBase.myMarketAPI.loadMarketByZip( _zipcode);
    }

    //========= GETTERS ============
    public String getZipcode(){
        return zipcode;
    }

    //======== SETTERS =============
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }

    public void zipCodeHasBeenSearched() {
        // An item has been added to the ticket. Fire an event and let everyone know.
        System.out.println("ZipCode has been searched.");
    }


    @Override
    public void messageReceived(APIEvent event) {
        switch (event.getMessage().getCode()) {
            case APIMessage.ZIPCODE_SEARCH:
                this.zipCodeHasBeenSearched();
                break;
            default:
                System.out.println("Ignoring Message Event. Irrelevant to Inventory: " + event.getMessage().getCode());
                break;
        }
    }

}
