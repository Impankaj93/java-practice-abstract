public abstract class ProductForSale {


    private  String name ;
    protected String type;
    protected  double price;
    protected String description;

    public ProductForSale( String type, double price, String description) {
        this.description = description;
        this.type = type;
        this.price = price;
    }
    public double getSalesPrice(int quantity){

        return quantity*price;
    }
    public void printPriceItem(int quantity){
        System.out.printf("%2d quantity at RS.%8.2f each, Item: %-15s , Description: %-35s %n",quantity,price,type,description);

    }
     abstract void showDetails();
    //testing demo
}
