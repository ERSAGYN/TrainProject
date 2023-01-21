package van;

public class RestaurantVan extends PassengerVan{

    public RestaurantVan(){
        mass = 30;
        place = 0;
    }

    public int getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return"\tРесторан: " +  "Масса: " + mass + " тонн." + ".\nМесто: " + getPlace() + " мест.";
    }
}
