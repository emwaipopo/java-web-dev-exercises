import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor>{
    @Override
    public int compare(Flavor f1, Flavor f2) {
        return(f2.getAllergens().size() - f1.getAllergens().size());
    }
}
