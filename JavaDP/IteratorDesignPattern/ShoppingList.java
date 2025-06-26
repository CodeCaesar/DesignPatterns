package JavaDP.IteratorDesignPattern;

import java.util.Iterator;

public class ShoppingList {
    
    private String[] shoppingList;
    private int pointer;

    public ShoppingList(int size) {
        shoppingList = new String[size];
        pointer = 0;
    }

    public void addItem(String item, int quantity) {
        if(this.pointer >= shoppingList.length) {
            System.err.println("Shopping List is full.");
        } else {
            shoppingList[pointer] = quantity + "x " + item;
        }

        this.pointer += 1;
    }

    public Iterator createIterator() {
        return new ShoppingListIterator(this.shoppingList);
    }

    public void iterate() {
        Iterator iterator = createIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void temporaryGetShoppingList() {
        for(String item : shoppingList) {
            System.out.println(item);
        }
    }
}
