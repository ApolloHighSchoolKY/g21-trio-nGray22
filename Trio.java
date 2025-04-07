//Write your answer here
class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink
    private double price
    
    public Trio(Sandwich sandwich,Salad salad,Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;

    Public String getName(){
        return sandwich + "/" + salad + "/" + drink + " Trio";
        
    }

    Public double getPrice(){
        return price;
    }

   

    double sandpric = getPrice(sandwich);
    double salpric = getPrice(salad);
    double drinkpric = getPrice(drink);

    if (drinkpric < sandpric && drinkpric < salpric){
        price = sandpric + salpric;
    }
    else if (sandpric < drinkpric && sandpric < salpric){
        price = drinkpric + salpric;
    }
    else
     price = drinkpric + sandpric;
   }



}