
/**
 * Write a description of class Lab3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
    private String kind;
    private String type;
    private String name;
    private int age;
    private double weight;
    public Pet(String kind, String type, String name, int age, double weight) {
        this.kind = kind; 
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String toString() {
        return "Kind: " + kind + ", " + "Type: " + type + ", " + "Name: " + name + 
        ", " + "Age: " + age + ", "+ "Weight: " + weight;
    }
    public static void main (String[] args)
    { 
        Pet pet1 = new Pet("Dog", "Mutt", "Birdie", 4, 20.0);
        Pet pet2 = new Pet("Dog", "Irish Wolfhound", "Clancy", 6, 35.0);
        System.out.println(pet1);
        System.out.println(pet2);
        pet1.setName("John");
        pet1.setAge(7);
        pet1.setWeight(30.0);
        pet2.setName("Biscuit");
        pet2.setAge(6);
        pet2.setWeight(10.0);
        System.out.println(pet1);
        System.out.println(pet2);
    }
}
