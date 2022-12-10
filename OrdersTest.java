
public class OrdersTest {
    public static void main(String[] args){
        
        

        // Menu Items
        Item item1 = new Item("Mocha",1.5);
        Item item2 = new Item("Latte", 0.50);
        Item item3 = new Item("Drip Coffee", 2.00);
        Item item4 = new Item("Capuccino", 1.5);

        // Order tests
        // create two orders without specifying a name
        Order order1 = new Order();
        // System.out.println("Order 1 name: " + order1.getName());
        order1.addItem(item1);
        order1.addItem(item2);
        // System.out.println("Order 1 items: " + order1.getItems());
        System.out.println("Functional Disaply Order: ");
        order1.displayOrder(order1.getName(), order1.getReady(), order1.getItems());
        // Items are not added to order Array so total displays as 0.0 and the items displays as []
        System.out.println("Order total: " + order1.getOrderTotal(item1.getPrice() + item2.getPrice()));

        Order order2 = new Order();
        // System.out.println("Order 2 name: " + order2.getName());
        order2.addItem(item3);
        order2.addItem(item1);
        // System.out.println("Order 2 items: " + order2.getItems());
        System.out.println("Functional Disaply Order: ");
        order2.displayOrder(order2.getName(), order2.getReady(), order2.getItems());
        // create three orders using the overloaded constructor to give each a name
        Order order3 = new Order("Steve");
        // System.out.println("Order 3 name: " + order3.getName());
        order3.addItem(item4);
        order3.addItem(item4);
        // System.out.println("Order 3 items: " + order3.getItems());
        order3.displayOrder(order3.getName(), order3.getReady(), order3.getItems());

        Order order4 = new Order("Bobby");
        // System.out.println("Order 4 name: " + order4.getName());
        order4.addItem(item2);
        order4.addItem(item1);
        // System.out.println("Order 4 items: " + order4.getItems());
        order4.displayOrder(order4.getName(), order4.getReady(), order4.getItems());

        Order order5 = new Order("Odin");
        // System.out.println("Order 5 name: " + order5.getName());
        order5.addItem(item1);
        order5.addItem(item2);
        // System.out.println("Order 5 items: " + order5.getItems());
        order5.displayOrder(order5.getName(), order5.getReady(), order5.getItems());

    }
}
