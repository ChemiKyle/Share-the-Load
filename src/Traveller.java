import java.util.ArrayList;

/**
 * Created by kyle on 3/30/17.
 */
public class Traveller {
    private String name;
    private ArrayList<Item> pack;

    public Traveller(String name) {
        this.name = name;
        this.pack = new ArrayList();
    }

    // Need to switch this to a hashMap so that transferring items will work
    public void addItem(String itemName, double itemWeight) {
        this.pack.add(new Item(itemName, itemWeight));
    }

    public void removeItem(Item item) {
        this.pack.remove(item);
    }

    public void printPackItems() {
        for (Object item : this.pack) {
            System.out.println(item);
        }
    }

    public double packWeight() {
        double sum = 0;
        for (Item item : this.pack) {
            sum += item.getWeight();
        }
        return sum;
    }

    public String getName() {
        return this.name;
    }

    public void transferItem(Traveller travellerTo, String itemName) {
        for (Item item : this.pack) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                travellerTo.pack.add(item);
                this.pack.remove(item);
            }
        }
    }
}
