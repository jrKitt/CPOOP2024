import java.util.ArrayList;
public class Cart {
    private ArrayList<Item> items;

    public Cart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void displayItem(){
        System.out.println("item in the cart:");

        for(Item item : items){

        }
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for(Item item : items){

        }
        return totalPrice;
    }
}
