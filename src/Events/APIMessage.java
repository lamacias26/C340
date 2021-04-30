package Events;

public class APIMessage {

    public static final int EXIT_PANEL = 7;
    public static final int RECIPE_SEARCH_PANEL = 9;
    public static final int REMOVE_SEARCH = 10;
    public static final int ADD_SEARCH = 11;
    public static final int ZIPCODE_SEARCH = 12;
    public static final int MARKET_ID_SEARCH = 13;
    public static final int FARMERS_MARKET_PANEL = 14;
    public static final int JANUARY = 15;
    public static final int MONTHS_PANEL = 16;
    public static final int FRUITS_BY_MONTH_RESULT = 17;
    public static final int VEGATABLES_BY_MONTH_RESULT = 19;

    private final int _thismessage;

    public APIMessage(int message) {
        this._thismessage = message;
    }

    public int getCode() {
        return this._thismessage;
    }

}
