package van;

public class CompartmentVan extends PassengerVan{
    public CompartmentVan() {
        mass = 20;
        place = 30;
    }

    @Override
    public String toString() {
        return "\tКупе: " +  "Масса: " + mass + " тонн." + ".\nМесто: " + place + " мест.\n";
    }
}
