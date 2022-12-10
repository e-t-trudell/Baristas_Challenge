import java.util.ArrayList;
public class Order {
    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    public Order(String name, ArrayList<Item> items){
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    // getters
    public String getName(){
        return name;
    };
    public boolean getReady(){
        return ready;
    };
    public ArrayList<Item> getItems(){
        return items;
    };
    // Order Methods
    public ArrayList<Item> addItem(Item item){
        ArrayList<Item> newItem = new ArrayList<Item>();
        newItem.add(item);
        for (int i =0;i<newItem.size();i++){
            // this displays item object position not the name
            System.out.println(String.format("New item adding: " + newItem.get(i)));
        }
        // newItem.get(0);
        System.out.println("adding item: " + item.getName());
        // System.out.println("newItem: " + newItem.get(0));
        return newItem;
    }
    public String getStatusMessage(){
        String message = new String();
        if(ready){
            message = "Your order is ready!";
            return message;
        }else{
            message = "Thank you for waiting!";
            return message;
        }
    }
    public double getOrderTotal(double prices){
        double total = 0;
        for (int i = 0;i<this.items.size();i++){
            // Double cost = this.items.getItems(i);
            System.out.println(i);
            this.items.get(i);
            
            total += i;
            System.out.println(total);
        }
        return total;
    }
    public void displayOrder(String name, boolean ready, ArrayList<Item> items){
        ArrayList<String> display = new ArrayList<String>();
        // add to list
        display.add(this.name);
        
        // display.add(this.items.get(2));
        // display.add(this.ready);

        // retrieve from list
        // customer
        String zero = display.get(0);
        // ready
        String one = this.getStatusMessage();
        // items
        ArrayList<Item> two = this.getItems();
        
        // print out to terminal retrieved items
        System.out.println("Customer name: " + zero);
        // System.out.println(this.items.get(0));
        System.out.println("Items: " + two);
        // copy above for duplicate items ordered
        System.out.println("Ready: " + one);
        // System.out.println(menu);
    }

    
    // setters
    // void because no return required, data type set in parameters
    public void setName(String name){
        this.name = name;
    };
    public void setReady(boolean ready){
        this.ready = ready;
    };
    public void setItems(ArrayList<Item> items){
        this.items = items;
    };






}