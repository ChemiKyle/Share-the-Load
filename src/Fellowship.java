import java.util.ArrayList;

/**
 * Created by kyle on 3/30/17.
 */
public class Fellowship {
    private ArrayList<Traveller> fellowship;
    private String name;

    public Fellowship() {
        this.name = "";
        this.fellowship = new ArrayList<Traveller>();
    }

    public void addMember(Traveller traveller) {
        this.fellowship.add(traveller);
    }

    public void removeMember(Traveller traveller) {
        this.fellowship.remove(traveller);
    }

    public void printLoad() {
        for (Traveller traveller : this.fellowship) {
            System.out.println(traveller.getName());
            traveller.printPackItems();
        }
    }
}
