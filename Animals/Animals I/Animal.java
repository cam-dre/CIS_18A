// =================================================================================
// File: Extra_Credit_10a - Animals
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
        // Dog, Cat, and Turtle objects created and initialized with values
    	Dog dog = new Dog("Canis", "lupus", false, true);
        Cow cow = new Cow("Bos", "taurus", false, true);
        Turtle turtle = new Turtle("Caretta", "carretta", false, 100);

        // Dog object displayed
        System.out.println("Dog object:");
        System.out.println(dog.getDesc());
        dog.speak();

        // Cow object displayed
        System.out.println("Cow object:");
        System.out.println(cow.getDesc());
        cow.speak();

        // Turtle object displayed
        System.out.println("Turtle object:");
        System.out.println(turtle.getDesc());
    }
}

/* ==== OUTPUT =====================================================================
Dog object:
Genus: Canis
Species: lupus
Extinct: Not extinct
Companion animal: This is a companion animal
Wuff! Wuff!

Cow object:
Genus: Bos
Species: taurus
Extinct: Not extinct
Milk producer: This animal produces milk
Moooo!

Turtle object:
Genus: Caretta
Species: carretta
Extinct: Not extinct
Average # eggs/clutch: 100
==================================================================================*/
