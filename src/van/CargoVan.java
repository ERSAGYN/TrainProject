package van;

public class CargoVan extends Van {
    public CargoVan(double loadMass) {
        mass = 20 + loadMass;
    }

    @Override
    public String toString() {
        return "Масса: " + mass + ".";
    }
}
