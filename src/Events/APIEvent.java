package Events;
/**
 * This class handles API Events.
 */

import java.util.EventObject;
public class APIEvent extends EventObject{

    private final APIMessage message;

    public APIEvent(Object source, APIMessage _message) {
        super(source);
        this.message = _message;
    }

    public APIMessage getMessage() {
        return this.message;
    }
}
