package section9.abstractclasses.challenge;

public interface NodeList  {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void tranverse(ListItem item);

}
