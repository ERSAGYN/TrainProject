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
        trains.add(tr);
        trains.add(tr1);
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