public class GroceriesObject extends ProductForSale{

    public GroceriesObject(String type, double price, String description) {
        super(type,price,description);
    }

    @Override
    public void showDetails() {
        System.out.println(type );
        System.out.printf("The price of the Item is %6.2f %n",price);
        System.out.println(description);

    }
}
