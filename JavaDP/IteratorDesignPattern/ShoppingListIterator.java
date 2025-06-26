package JavaDP.IteratorDesignPattern;

import java.util.Iterator;

public class ShoppingListIterator implements Iterator {
    
    private String[] items;
    private int position = 0;

    public ShoppingListIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(this.position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return null;
    }
}
