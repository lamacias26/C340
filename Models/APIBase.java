package Models;

/**
 * Last Updated: 3/24/21
 * Parent class for any class that is going to make calls to the Recipe API
 * @author Leslie Macias Magana
 */

import java.util.ArrayList;
import java.util.List;

import API.FarmersMarketAPITranslator;
import API.FarmersMarketApiInterface;
import API.RecipeAPITranslator;
import API.RecipeApiInterface;
import Events.APIEvent;
import Events.ListenerInterface;

public class APIBase implements ListenerInterface{

    private final List listeners = new ArrayList();

    /**
     * Register a listener to be called upon when an event is fired.
     * @param listener the object that is called upon.
     */
    public synchronized void addListener(ListenerInterface listener) {
        listeners.add(listener);
    }

    /**
     * Unregister an event from being called upon.
     * @param listener the object to unregister.
     */
    public synchronized void removeListener(ListenerInterface listener) {
        listeners.remove(listener);
    }


    protected final static RecipeApiInterface myRecipeAPI = new RecipeAPITranslator();
    protected final static FarmersMarketApiInterface myMarketAPI = new FarmersMarketAPITranslator();




    /**
     * When an event is fired, this method iterates through the events and fires off
     * their messageReceived method. We translate the listener array to an object array
     * while iterating in order to avoid Concurrent Access errors.
     * @param event - the event that caused this to be fired.
     */
    protected synchronized void fireEvent(APIEvent event) {
        // Clone the active listeners.
        Object[] temp_list = this.listeners.toArray();
        for (Object temp_list1 : temp_list) {
            ListenerInterface temp_obj = (ListenerInterface) temp_list1;
            temp_obj.messageReceived(event);
        }
    }

    @Override
    public void messageReceived(APIEvent event) {
        System.out.println("Message Received has not been implemented for this class");
    }

}
