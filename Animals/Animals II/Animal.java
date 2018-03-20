// =================================================================================
// File: EC_10a - Animals
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
public abstract class Animal {
    protected String genus;
    protected String species;
    protected boolean extinct;

    public Animal(String genus, String species, boolean extinct) {
        this.genus = genus;
        this.species = species;
        this.extinct = extinct;
    }
    public abstract String getDesc();
    public static void main(String[] args) {
        Dog dog = new Dog("Canis", "lupus", false, true);
        Cow cow = new Cow("Bos", "taurus", false, true);
        Turtle turtle = new Turtle("Caretta", "carretta", false, 100);

        System.out.println("Dog object:");
        System.out.println(dog.getDesc());
        dog.speak();

        System.out.println("Cow object:");
        System.out.println(cow.getDesc());
        cow.speak();

        System.out.println("Turtle object:");
        System.out.println(turtle.getDesc());
    }
}
