package locomotive;

public class DieselLocomotive extends Locomotive{
    double dieselVolume;

    public DieselLocomotive(double dieselVolume) {
        this.dieselVolume = dieselVolume;
        mass = 120; // тонны
    }

    public double getFuel() {
        return dieselVolume;
    }

    public void addDiesel(double dieselVolume) {
        this.dieselVolume += dieselVolume;
    }

    @Override
    public void move(int km) {
        double dieselConsumption = 1.6 * km;
        if(dieselConsumption > dieselVolume) {
            System.out.println("Не хватает топлива!");
        } else {
            dieselVolume -= dieselConsumption;
            System.out.println("Данный тепловоз проехал " + km + " километров.");
        }
    }
}
