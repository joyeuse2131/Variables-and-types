public class Slice_o_Heaven {
    private String stooreName;
    private String storeAddress;
    private int storePhone;
    private String storeEmail;
    private String storeMenu;
    private String pizzaIngredients;
    private double pizzaPrice;
    private String Sides;
    private String drinks;
    private int orderID;
    private double orderTotal;

    public Slice_o_Heaven(String storeName, String storeAddress, int storePhone, String storeEmail, String storeMenu,
            String pizzaIngredients, double pizzaPrice, String Sides, String drinks, int orderID, double orderTotal) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storePhone = storePhone;
        this.storeEmail = storeEmail;
        this.storeMenu = storeMenu;
        this.pizzaIngredients = pizzaIngredients;
        this.pizzaPrice = pizzaPrice;
        this.Sides = Sides;
        this.drinks = drinks;
        this.orderID = orderID;
        this.orderTotal = orderTotal;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public int getStorePhone() {
        return storePhone;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public String getStoreMenu() {
        return storeMenu;
    }

    public String getPizzaIngredients() {
        return pizzaIngredients;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public String getSides() {
        return Sides;
    }

    public String getDrinks() {
        return drinks;
    }

    public int getOrderID() {
        return orderID;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void takeOrder(String storeMenu, String pizzaIngredients, double pizzaPrice, String Sides, String drinks) {
        System.out.println("Order taken:" + storeMenu + " " + pizzaIngredients + " " + pizzaPrice + " " + Sides + " "
                + drinks);
    }

    public void makePizza(String pizzaIngredients) {
        System.out.println("Pizza made:" + pizzaIngredients);
    }

    public void printReceipt(int orderID, double orderTotal, String storeName, String storeAddress, int storePhone,
            String storeEmail) {
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Total: " + orderTotal);
    }
}


