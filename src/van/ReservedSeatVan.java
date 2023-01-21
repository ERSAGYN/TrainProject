package van;

public class ReservedSeatVan extends PassengerVan{
    public ReservedSeatVan() {
        mass = 20;
        place = 54;
    }

    @Override
    public String toString() {
        return "Масса: " + mass + ".\nМесто: " + place + " мест.";
    }
}
