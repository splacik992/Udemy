package section9.abstractclasses.challenge;//import section9.abstractclasses.challenge.ListItem;
//

import section9.abstractclasses.challenge.ListItem;
import section9.abstractclasses.challenge.NodeList;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (this.root == null) {
            //root is empty so new item becomes the head of the list;
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {

                if (currentItem.next() != null) {//newItem is greater , move right if possible
                    currentItem = currentItem.next();
                } else {
                    //there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);

                } else {
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                //equal
                System.out.println(newItem.getValue() + " already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item !=null){
            System.out.println("Deleting item .. " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison == 0){
                // found the item to delete
                if(currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());

                    }
                }
                return true;
            }else if(comparison < 0){
                currentItem = currentItem.next();
            }else { //comparison > 0
                // we are at an item greater than one to be deleted
                // so the item is not on the list

                return false;
            }
        }
        //reached end of the list
        //without finding the item to delete
        return false;
    }

    @Override
    public void tranverse(ListItem item) {

        if(root == null){
            System.out.println("The list is empty");
        }

        while (root != null){
            System.out.println(root.getValue());
            root = root.next();
        }










    }


//
//    private ListItem headItem;
//    private ListItem currentItem;
//
//    void addItem(String value) {
//        MyLinkedList newItem = new MyLinkedList();
//        newItem.setValue(value);
//
//        if (headItem == null) {
//            headItem = newItem;
//            currentItem = newItem;
//        } else if (currentItem.compareTo(value) == 0) {
//            System.out.println("Duplicate values are not allowed for value: " + value);
//        } else {
//            boolean isNewItemGreater = currentItem.compareTo(value) < 0;
//
//            while (true) {
//                ListItem itemToCheck = isNewItemGreater ? currentItem.getNextItem() : currentItem.getPreviousItem();
//
//                if (itemToCheck == null) { // end or top newItem of list
//                    if (isNewItemGreater) {
//                        currentItem.setNextItem(newItem);
//                        newItem.setPreviousItem(currentItem);
//                    } else {
//                        currentItem.setPreviousItem(newItem);
//                        newItem.setNextItem(currentItem);
//
//                        headItem = newItem;
//                    }
//
//                    currentItem = newItem;
//                    break;
//                } else {
//                    boolean isItemSmaller = itemToCheck.compareTo(value) > 0;
//
//                    if (itemToCheck.compareTo(newItem.getValue()) == 0) {
//                        System.out.println("Duplicate values are not allowed for value: " + newItem.getValue());
//                        break;
//                    }
//
//                    if (isNewItemGreater) {
//                        if (!isItemSmaller) {
//                            currentItem = itemToCheck;
//                        } else {
//                            newItem.setNextItem(itemToCheck);
//                            newItem.setPreviousItem(currentItem);
//
//                            itemToCheck.setPreviousItem(newItem);
//                            currentItem.setNextItem(newItem);
//
//                            currentItem = newItem;
//                            break;
//                        }
//                    } else {
//                        if (isItemSmaller) {
//                            currentItem = itemToCheck;
//                        } else {
//                            newItem.setNextItem(currentItem);
//                            newItem.setPreviousItem(itemToCheck);
//
//                            itemToCheck.setNextItem(newItem);
//                            currentItem.setPreviousItem(newItem);
//
//                            currentItem = newItem;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    void removeItem(String value) {
//        ListItem item = binarySearch(value);
//
//        if (item == null) return;
//
//        ListItem previous = item.getPreviousItem();
//        ListItem next = item.getNextItem();
//        if (previous != null) {
//            previous.setNextItem(next);
//        }
//        if (next != null) {
//            next.setPreviousItem(previous);
//        }
//
//        currentItem = next != null ? next : previous;
//        headItem = previous == null ? currentItem : headItem;
//    }
//
//    ListItem binarySearch(String value) {
//        MyLinkedList item = new MyLinkedList();
//        item.setValue(value);
//
//        if (currentItem.compareTo(item.getValue()) == 0) {
//            System.out.println("Item exists");
//            return currentItem;
//        } else {
//            boolean isNewItemGreater = currentItem.compareTo(item.getValue()) < 0;
//
//            while (true) {
//                ListItem itemToCheck = isNewItemGreater ? currentItem.getNextItem() : currentItem.getPreviousItem();
//
//                if (itemToCheck == null) {
//                    System.out.println("No item found with value: " + value);
//                    return null;
//                } else if (itemToCheck.compareTo(item.getValue()) == 0) {
//                    System.out.println("Item exists");
//                    currentItem = itemToCheck;
//                    return itemToCheck;
//                } else {
//                    currentItem = itemToCheck;
//                }
//            }
//        }
//    }
//
//    @Override
//    ListItem moveToNext() {
//        ListItem nextItem = currentItem.getNextItem();
//        if (nextItem == null) {
//            System.out.println("End of list");
//            return null;
//        }
//
//        System.out.println("next item is: " + currentItem.getValue());
//        return currentItem = nextItem;
//    }
//
//    @Override
//    ListItem moveToPrevious() {
//        ListItem previousItem = currentItem.getPreviousItem();
//        if (previousItem == null) {
//            System.out.println("Reached first item");
//            return null;
//        }
//
//        System.out.println("previous item is: " + previousItem.getValue());
//        return currentItem = previousItem;
//    }
//
//    void printAllItems() {
//        if (headItem == null)
//            System.out.print("List is Empty");
//
//        ListItem itemToPrint = headItem;
//        do {
//            System.out.print(itemToPrint.getValue() + ", ");
//
//            itemToPrint = itemToPrint.getNextItem();
//        } while (itemToPrint != null);
//
//        System.out.println();
//    }
}