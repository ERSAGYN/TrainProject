package van;

public class SeatedVan extends PassengerVan{
    public SeatedVan(){
        mass = 20;
        place = 50;
    }

    public int getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return"\tОбщий: " + "Масса: " + mass + " тонн." + ".\nМесто: " + getPlace() + " мест.";
    }
}
