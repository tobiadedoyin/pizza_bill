public class Main {
    public static void main(String[] args) {
        Pizza price = new Pizza(true, true);
        Deluxe dPrice = new Deluxe(true, true);

        System.out.println("Thanks for patronizing us, Enjoy your pizza");
         int priceToppings = price.getPizzaPriceWithToppings();
         int printAll = price.getPizzaPriceWithToppingsAndCheese();

        System.out.println("cheese with toppings " + priceToppings);
        System.out.println("cheese with all " + printAll);

        System.out.println("---------------------------------");


        System.out.println("Thanks for patronizing us, Enjoy your Delux pizza");
        int deluxTopping = dPrice.getPizzaPriceWithToppings();
        int deluxAll = dPrice.getPizzaPriceWithToppingsAndCheese();

        System.out.println("Delux with toppings " + deluxTopping);
        System.out.println("Delux with all " + deluxAll);

    }
}