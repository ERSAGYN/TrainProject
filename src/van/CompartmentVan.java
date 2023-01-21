package van;

public class CompartmentVan extends PassengerVan{
    public CompartmentVan() {
        mass = 20;
        place = 30;
    }

    @Override
    public String toString() {
        return "Масса: " + mass + ".\nМесто: " + place + " мест.";
    }
}
