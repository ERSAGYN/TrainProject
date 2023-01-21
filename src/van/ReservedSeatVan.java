package van;

public class ReservedSeatVan extends PassengerVan{
    public ReservedSeatVan() {
        mass = 20;
        place = 54;
    }

    @Override
    public String toString() {
        return "\tПлацкарт: " + "Масса: " + mass + " тонн." + ".Место: " + place + " мест.\n";
    }
}
