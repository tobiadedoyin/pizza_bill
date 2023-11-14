public class Pizza {
     private int price;

    public Pizza(boolean veg, boolean takeAway){
         int takeAwayPrice = 50;
         int bagPackPrice = 20;
         if(veg && takeAway){
             this.price = 300 + bagPackPrice + takeAwayPrice;
         }else{
             this.price = 300;
         }

         if(!veg && takeAway){
             this.price = 400 + bagPackPrice + takeAwayPrice;
         } else if(!veg){
             this.price = 400;
         }
    }

    public int getPizzaPriceWithToppings(){
        int extraToppingPrice = 150;
        price += extraToppingPrice;
        return price;
    }

    public int getPizzaPriceWithToppingsAndCheese(){
        int extraCheesePrice = 100;
        price = price + extraCheesePrice;
        return price;
    }
}
