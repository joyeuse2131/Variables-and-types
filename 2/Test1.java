
public class Test1 {
    public static void main(String[] args) {
        Slice_o_Heaven_another slice = new Slice_o_Heaven_another("Slice_o_Heaven", "James_Street", 217240119,
                "heaven05@gamil",
                "pizzas",
                "cheese, tomato, pepperoni", 10.00, "fries, onion rings", "coke, sprite", "1", 10.00);
        System.out.println("Please take an order from the following menu: ");
        slice.takeOrder(slice.getStoreMenu(), slice.getPizzaIngredients(), slice.getPizzaPrice(),
                slice.getSides(),
                slice.getDrinks());
        System.out.println("We are making pizzas");
        slice.makePizza(slice.getPizzaIngredients());
        System.out.println("Printing receipt");

    }

}
