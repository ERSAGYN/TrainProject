package van;

public class DisabledVan extends PassengerVan{
    public DisabledVan(){
        mass = 30;
        place = 50;
    }

    public int getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return"\tВагон для инвалидов: " + "Масса: " + mass + " тонн." + ".\nМесто: " + getPlace() + " мест.";
    }
}
