public class Slice_o_Heaven_another {
    private String storeName;
    private String storeAddress;
    private int storePhone;
    private String storeEmail;
    private String storeMenu;
    private String pizzaIngredients;
    private double pizzaPrice;
    private String Sides;
    private String drinks;
    private String orderID;
    private double orderTotal;
    private final String DEF_ORDER_ID = "DEF-SOH-099";
    private final String DEF_PIZZA_INGREDIENTS = "Mozzarella cheese";
    private final double DEF_ORDER_TOTAL = 15.00;

    public Slice_o_Heaven_another() {
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
    }

    public Slice_o_Heaven_another(String storeName, String storeAddress, int storePhone, String storeEmail,
            String storeMenu,
            String pizzaIngredients, double pizzaPrice, String Sides, String drinks, String orderID,
            double orderTotal) {
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

    public Slice_o_Heaven_another(String orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }

    public void setstoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setstoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public void setstorePhone(int storePhone) {
        this.storePhone = storePhone;
    }

    public void setstoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }

    public void setstoreMenu(String storeMenu) {
        this.storeMenu = storeMenu;
    }

    public void setpizzaIngredients(String pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }

    public void setpizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public void setSides(String Sides) {
        this.Sides = Sides;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setOrderTotal(double orderTotal) {
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

    public String getOrderID() {
        return orderID;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public String getDEF_ORDER_ID() {
        return DEF_ORDER_ID;
    }

    public String getDEF_PIZZA_INGREDIENTS() {
        return DEF_PIZZA_INGREDIENTS;
    }

    public double getDEF_ORDER_TOTAL() {
        return DEF_ORDER_TOTAL;
    }

    public void takeOrder(String storeMenu, String pizzaIngredients, double pizzaPrice, String Sides, String drinks) {
        System.out.println("Order taken:" + storeMenu + " " + pizzaIngredients + " " + pizzaPrice + " " + Sides + " "
                + drinks);
        printReceipt(storePhone, pizzaPrice, pizzaIngredients, Sides, storePhone, drinks);
    }

    public void makePizza(String pizzaIngredients) {
        System.out.println("Pizza made:" + pizzaIngredients);
    }

    private void printReceipt(int orderID, double orderTotal, String storeName, String storeAddress, int storePhone,
            String storeEmail) {
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Total: " + orderTotal);
    }

}
