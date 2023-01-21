package locomotive;

import rails.Rails;
import van.Van;

public class ElectricLocomotive extends Locomotive{
    private Rails rails;

    public ElectricLocomotive(Rails rails) {
        this.rails = rails;
        mass = 200; // тонны
    }

    @Override
    public void move(int km, double mass) {
        if(!rails.getElectricity()) {
            System.out.println("На данных рельсах нет электричества! Электрический поезд не сможет поехать!");
            return;
        }
        System.out.println("Электрический поезд проехал " + km + " километров.");
    }

    @Override
    public String toString() {
        return "ElectricLocomotive";
    }
}
