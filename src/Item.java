/**
 * Created by kyle on 3/31/17.
 */
public class Item {
    private String name;
    private double weight;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Item: " + this.name + "; weight: " + this.weight;
    }
}
