public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraCheese();
        basePizza.addExtraGarniture();
        basePizza.takeAway();
        basePizza.getFacture();
    }
}