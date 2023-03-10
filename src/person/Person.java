package person;

public class Person {
    private String name;
    private int age;
    private boolean disability;
    private int id;

    public Person(String name, int age, boolean disability, int id){
        this.age = age;
        this.disability = disability;
        this.id = id;
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getDisability(){
        return disability;
    }
}
