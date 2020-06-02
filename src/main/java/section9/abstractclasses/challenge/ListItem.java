package section9.abstractclasses.challenge;

import java.util.Objects;

public abstract class ListItem {

    protected ListItem right = null;
    protected ListItem left = null;
    protected Object value;

    public ListItem(Object value) {
    }

    protected abstract ListItem next();
    protected abstract ListItem previous();
    protected abstract ListItem setNext(ListItem item);
    protected abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

}
