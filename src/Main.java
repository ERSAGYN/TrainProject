import locomotive.SteamLocomotive;
import locomotive.Train;
import van.RestaurantVan;
import van.Van;

public class Main {
    public static void main(String[] args) {
        Train tr = new SteamLocomotive(1000);
        tr.move(15);
        System.out.println(tr.getFuel());


    }
}