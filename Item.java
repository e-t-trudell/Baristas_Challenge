public class Item {
    private String name;
    private Double price;
    Item(){};
    // constructor with signature
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    // getters
    public String getName(){
        return name;
    };
    public double getPrice(){
        return price;
    };
    // setters
    // void because no return required, data type set in parameters
    public void setName(String name){
        this.name = name;
    };
    public void setPrice(double price){
        this.price = price;
    };
}

