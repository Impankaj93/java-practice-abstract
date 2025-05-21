import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){}

public class Store {
   private static ArrayList<ProductForSale> storeProducts=new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new GroceriesObject("Oil",170,"Mustered oil"));
        storeProducts.add(new GroceriesObject("Suger",60,"Fortune suger"));
        storeProducts.add(new GroceriesObject("Atta",30,"Sudh chakki Atta"));
        storeProducts.add(new GroceriesObject("Besan",100,"Fortune Besan"));

        listProducts();

        System.out.println("\nOrder 1");
       var order1=new ArrayList<OrderItem>();
        addItemToOrder(order1,0,5);
        addItemToOrder(order1,1,4);
        addItemToOrder(order1,2,2);
        addItemToOrder(order1,3,2);
        printOrder(order1);

    }
    public static void listProducts(){

        for (var product:storeProducts){
            System.out.printf("-".repeat(30)+"%n");
            product.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order,int orderIndex,int qty){

        order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order){

        double salesTotal=0;
        for (var item : order){
            //item.product().printPriceItem(item.qty());
            item.product().printPriceItem(item.qty());
            salesTotal +=item.product().getSalesPrice(item.qty());
        }
        System.out.printf("sales total = %6.2f %n",salesTotal);
    }
}