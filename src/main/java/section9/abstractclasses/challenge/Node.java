package section9.abstractclasses.challenge;

public class Node extends ListItem {


    public Node(Object value) {
        super(value);
    }

    @Override
    protected ListItem next() {
        return this.right;
    }

    @Override
    protected ListItem previous() {
        return this.left;
    }

    @Override
    protected ListItem setNext(ListItem item) {
        this.right = item;
        return this.setNext(item);
    }

    @Override
    protected ListItem setPrevious(ListItem item) {
        this.left = item;
        return this.setPrevious(item);
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return ((String)super.getValue()).compareTo((String) item.getValue());
        }else {
            return -1;
        }
    }


}
