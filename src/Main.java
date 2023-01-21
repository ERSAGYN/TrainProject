import locomotive.DieselLocomotive;
import locomotive.ElectricLocomotive;
import locomotive.SteamLocomotive;
import locomotive.Train;
import rails.Rails;
import van.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Train> trains = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Train tr = new Train(new ElectricLocomotive(new Rails(true)), new CargoVan(20));
        Train tr1 = new Train(new SteamLocomotive(300), new CargoVan(20));
        Train tr2 = new Train(new DieselLocomotive(350), new LuxuryVan());
        Train tr3 = new Train(new ElectricLocomotive(new Rails(true)), new CargoVan(30));
        Train tr4 = new Train(new SteamLocomotive(250), new DisabledVan());
        Train tr5 = new Train(new DieselLocomotive(400), new ReservedSeatVan());
        Train tr6 = new Train(new ElectricLocomotive(new Rails(false)), new SeatedVan());
        Train tr7 = new Train(new SteamLocomotive(300), new CargoVan(20));
        Train tr8 = new Train(new DieselLocomotive(350), new RestaurantVan());
        Train tr9 = new Train(new ElectricLocomotive(new Rails(true)), new CompartmentVan());
        Train tr10 = new Train(new SteamLocomotive(450), new CargoVan(30));
        Train tr11 = new Train(new DieselLocomotive(250), new LuxuryVan());
        Train tr12 = new Train(new ElectricLocomotive(new Rails(false)), new SeatedVan());
        Train tr13 = new Train(new SteamLocomotive(350), new CargoVan(25));
        Train tr14 = new Train(new DieselLocomotive(350), new SeatedVan());
        Train tr15 = new Train(new ElectricLocomotive(new Rails(true)), new LuxuryVan());
        Train tr16 = new Train(new SteamLocomotive(300), new CargoVan(20));
        Train tr17 = new Train(new DieselLocomotive(350), new CompartmentVan());
        Train tr18 = new Train(new ElectricLocomotive(new Rails(true)), new CompartmentVan());
        Train tr19 = new Train(new SteamLocomotive(300), new SeatedVan ());
        Train tr20 = new Train(new DieselLocomotive(360), new SeatedVan());
        Train tr21 = new Train(new ElectricLocomotive(new Rails(false)), new SeatedVan());
        Train tr22 = new Train(new SteamLocomotive(370), new RestaurantVan());
        Train tr23 = new Train(new DieselLocomotive(380), new RestaurantVan());
        Train tr24 = new Train(new ElectricLocomotive(new Rails(false)), new RestaurantVan());
        Train tr25 = new Train(new SteamLocomotive(300), new ReservedSeatVan());
        Train tr26 = new Train(new DieselLocomotive(390), new ReservedSeatVan());
        Train tr27 = new Train(new ElectricLocomotive(new Rails(true)), new ReservedSeatVan());
        Train tr28 = new Train(new SteamLocomotive(400), new CargoVan(20));
        Train tr29 = new Train(new ElectricLocomotive(new Rails(false)), new CargoVan(15));
        Train tr30 = new Train(new SteamLocomotive(420), new CompartmentVan());
        Train tr31 = new Train(new DieselLocomotive(310), new CompartmentVan());
        Train tr32 = new Train(new ElectricLocomotive(new Rails(true)), new CompartmentVan());
        Train tr33 = new Train(new SteamLocomotive(430), new LuxuryVan());
        Train tr34 = new Train(new DieselLocomotive(320), new LuxuryVan());
        Train tr35 = new Train(new ElectricLocomotive(new Rails(false)), new LuxuryVan());
        Train tr36 = new Train(new SteamLocomotive(440), new SeatedVan());
        Train tr37 = new Train(new DieselLocomotive(330), new SeatedVan());
        Train tr38 = new Train(new ElectricLocomotive(new Rails(true)), new SeatedVan());
        Train tr39 = new Train(new SteamLocomotive(300), new CargoVan(20));
        trains.add(tr);
        trains.add(tr1);
        trains.add(tr2);
        trains.add(tr3);
        trains.add(tr4);
        trains.add(tr5);
        trains.add(tr6);
        trains.add(tr7);
        trains.add(tr8);
        trains.add(tr9);
        trains.add(tr10);
        trains.add(tr11);
        trains.add(tr12);
        trains.add(tr13);
        trains.add(tr14);
        trains.add(tr15);
        trains.add(tr16);
        trains.add(tr17);
        trains.add(tr18);
        trains.add(tr19);
        trains.add(tr20);
        trains.add(tr21);
        trains.add(tr22);
        trains.add(tr23);
        trains.add(tr24);
        trains.add(tr25);
        trains.add(tr26);
        trains.add(tr27);
        trains.add(tr28);
        trains.add(tr29);
        trains.add(tr30);
        trains.add(tr31);
        trains.add(tr32);
        trains.add(tr33);
        trains.add(tr34);
        trains.add(tr35);
        trains.add(tr36);
        trains.add(tr37);
        trains.add(tr38);
        trains.add(tr39);
        tr.move(15, 300);
        start();
        /*Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            *//*Statement statement = conn.createStatement(); //ADDING ROWS
            int rows = statement.executeUpdate("INSERT ersa(ersa, ers2, errr, sss) VALUES (2334, 76000, 123, 3)");
            System.out.printf("Added %d rows", rows);*//*
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ersa WHERE ersa = 2");

            while(resultSet.next()){
                int id = resultSet.getInt(1);
                //String name = resultSet.getString(2);
                int price = resultSet.getInt(2);
                System.out.printf("%d - %d \n", id, price);
            }

        }
        catch (Exception ex){
            System.out.println("fail");
            System.out.println(ex);
        }*/
    }

    public static void start() {
        System.out.println("Выберите действие:\n1. Вывести список поездов.\n2. Внести изменения в поезд.\n3. Добавить поезд.\n4. Удалить поезд.\n5. Выйти");
        switch (scan.nextInt()){
            case 1:
                printOutTrains();
                break;
            case 2:
                System.out.println("Введите номер поезда: ");
                editTrain(scan.nextInt());
                break;
            case 3:
                System.out.println("Введите локомотив поезда:\n1. Тепловоз (Дизельный)\n2. Паровоз\n3. Электровоз");
                switch (scan.nextInt()) {
                    case 1:
                        trains.add(new Train(new DieselLocomotive(100)));
                        break;
                    case 2:
                        trains.add(new Train(new SteamLocomotive(100)));
                        break;
                    case 3:
                        trains.add(new Train(new ElectricLocomotive(new Rails(true))));
                        break;
                }
                start();
                break;
            case 4:
                deleteTrain();
                break;
            case 5:
                break;
        }
    }

    public static void deleteTrain() {
        System.out.println("Введите номер поезда: ");
        int index = scan.nextInt();
        trains.remove(index);
        Train.deleteTrain(index);
        start();
    }

    public static void editTrain(int index) {
        try{
            trains.get(index).toString();
        } catch (Exception e) {
            System.out.println("Wrong train number!");
            return;
        }
        System.out.println("Выберите действие:\n1. Удалить вагон\n2.Добавить вагон\n");
        switch (scan.nextInt()){
            case 1:
                deleteVan(trains.get(index));
                start();
                break;
            case 2:
                addVan(trains.get(index));
                start();
                break;
        }
    }
    public static void printOutTrains() {
        int count = 0;
        for(Train t: trains) {
            System.out.println(count + " " + t.toString());
            count++;
        }
        start();
    }

    public static void deleteVan(Train t) {
        System.out.println("Введите номер вагона который хотите удалить:");
        t.removeVan(scan.nextInt());
    }

    public static void addVan(Train t) {
        System.out.println("Выберите вид вагона вагона:\n1.Грузовой вагон.\n2.Пассажирский");
        switch(scan.nextInt()) {
            case 1:
                System.out.println("Введите массу груза");
                t.addVan(new CargoVan(scan.nextDouble()));
                break;
            case 2:
                System.out.println("Введите вид пассажирского вагона:\n1. Купе\n2. Люкс\n3.Плацкарт\n4.Общий\n5.Для инвалидов\n6.Вагон ресторан");
                switch (scan.nextInt()){
                    case 1:
                        t.addVan(new CompartmentVan());
                        break;
                    case 2:
                        t.addVan(new LuxuryVan());
                        break;
                    case 3:
                        t.addVan(new ReservedSeatVan());
                        break;
                    case 4:
                        t.addVan(new SeatedVan());
                        break;
                    case 5:
                        t.addVan(new DisabledVan());
                        break;
                    case 6:
                        t.addVan(new RestaurantVan());
                        break;
                }
                break;
        }
    }
}