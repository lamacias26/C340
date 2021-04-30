package db;

public class FruitsVegetables extends DataObject {

    protected final String dataTable = "fruits_veggies";

        protected String month = "";
        protected String type = "";



    public String getMonth(){ return month;}
    public void setMonth(String _month){ this.month = _month;}

    public String getType(){ return type;}
    public void setType(String _type){ this.type = _type;}



}

