package locomotive;

import van.Van;

public class ElectricLocomotive extends Locomotive{

    public ElectricLocomotive() {
        mass = 200; // тонны
    }

    @Override
    public double getFuel() {
        return 0;
    }

    @Override
    public void move(int km) {
        if(!getRails().getElectricity()) {
            System.out.println("На данных рельсах нет электричества! Электрический поезд не сможет поехать!");
            return;
        }
        System.out.println("Электрический поезд проехал " + km + " километров.");
    }
}
