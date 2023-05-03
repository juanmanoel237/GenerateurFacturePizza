public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraGarniturePrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraGarnitureAdded = false;
    private boolean isoptedForTakeAway = false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraGarniture(){
        isExtraGarnitureAdded = true;
        this.price += extraGarniturePrice;

    }

    public void takeAway(){
        isoptedForTakeAway = true;
        this.price += backPackPrice;

    }
    public void getFacture(){
        String facture = "";
        System.out.println("Pizza: "+ basePizzaPrice);
        if (isExtraCheeseAdded){
            facture += "Extra cheese ajouté: "+extraCheesePrice+ "\n";
        }
        if (isExtraGarnitureAdded){
            facture += "Extra garniture ajouté: "+extraGarniturePrice+ "\n";
        }
        if (isoptedForTakeAway){
            facture += "Take Away ajouté: "+backPackPrice+ "\n";
        }
        facture += "Facture: "+this.price + "\n";
        System.out.println(facture);
    }

}
