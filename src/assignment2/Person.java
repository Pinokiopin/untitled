package assignment2;

public class Person implements Pyable, Comparable<Person> {
    public int id;
    public static int Id_gen = 1;
    public String name, surname;
    public Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }
    public  Person(){
        this.id = Id_gen++;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String toString(){
        return id + ". " + name + " " + surname;
    }
    public String getPosition(){

        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

}
