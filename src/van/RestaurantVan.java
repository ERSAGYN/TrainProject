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
        return "Масса: " + mass + ".\nМесто: " + getPlace() + " мест.";
    }
}
