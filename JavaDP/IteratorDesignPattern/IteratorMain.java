package JavaDP.IteratorDesignPattern;

public class IteratorMain {
    
    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList(5);

        shoppingList.addItem("Eggs", 12);
        shoppingList.addItem("Apples", 4);
        shoppingList.addItem("Potatoes", 16);
        shoppingList.addItem("Milk", 1);
        shoppingList.addItem("Avocados", 3);
        shoppingList.addItem("Bags of Tea", 32);

        shoppingList.iterate();
    }
}
