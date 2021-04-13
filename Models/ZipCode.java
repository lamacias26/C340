package Models;

/**
 * The ZipCode class handles all functionality related to finding markets by zipcode.
 * Last Updated: 4/7/2021
 * @author Leslie Macias Magana
 */

public class ZipCode extends FarmersMarketAPIBaseClass{

    protected String zipcode;

    public void ZipCode(){}

    public static ZipCode getMarketByZip(String _zipcode){
        ZipCode zipcode = new ZipCode();
        zipcode.setZipcode(_zipcode);
        return FarmersMarketAPIBaseClass.myMarketAPI.loadMarketByZip( _zipcode);
    }

    //========= GETTERS ============
    private String getZipcode(){
        return zipcode;
    }

    //======== SETTERS =============
    private void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }


}
