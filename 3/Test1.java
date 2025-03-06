import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        /* 新修改的地方 */
        /* 接收cardnumber，用来判断是不是符合下列条件 */
        System.out.println("Please enter your card number: ");
        slice.setCardNumber(sc.nextLine());

        int cardLength = slice.getCardNumber().length();
        if (cardLength == 14) {
            System.out.println("Card accepted");
        } else {
            System.out.println("Invalid card");
        }
        char firstNumber = slice.getCardNumber().charAt(0);
        String firstCardstr = String.valueOf(firstNumber);
        int firstCardDigit = Integer.parseInt(firstCardstr);

        if (slice.getCardNumber().equals(slice.getBlacklistedNumber())) {
            System.out.println("Card is blacklisted,please use another card");
        } else {
            System.out.println("Card not blacklisted");
        }
        int lastFourDigits = Integer.parseInt(slice.getCardNumber().substring(10, 13));
        String cardNumberToDisplay = firstCardDigit
                + slice.getCardNumber().replace(slice.getCardNumber().substring(1, 10),
                        "**********")
                + lastFourDigits;
        System.out.println("Card number to display: " + cardNumberToDisplay);

        sc.close();
    }

}
