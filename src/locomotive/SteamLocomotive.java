package locomotive;

public class SteamLocomotive extends Locomotive{
    double coalWeight;
    public SteamLocomotive(double coalWeight) {
        this.coalWeight = coalWeight;
        mass = 85; // тонны
    }

    public double getFuel() {
        return coalWeight;
    }

    public void addCoalWeight(double coalWeight) {
        this.coalWeight += coalWeight;
    }

    @Override
    public void move(int km) {
        double coalConsumption = 60 * km;
        if(coalConsumption > coalWeight) {
            System.out.println("Не хватает угля!. Расход топлива: 60 кг угля на 1 километр");
        } else {
            coalWeight -= coalConsumption;
            System.out.println("Данный паровоз проехал " + km + " километров.");
        }
    }
}
