public class Dog extends Mammal {
    private boolean companionAnimal;

    public Dog(String genus, String species, boolean extinct, boolean companionAnimal) {
        super(genus, species, extinct);
        this.companionAnimal = companionAnimal;
    }
    public void speak() {
        System.out.println("Wuff! Wuff!\n");
    }
    public String getDesc() {
        String strCompanion;
        String strExtinct;

        if (extinct)
            strExtinct = "Extinct";
        else
            strExtinct = "Not extinct";

        if (companionAnimal)
            strCompanion = "This is a companion animal";
        else
            strCompanion = "Not a companion animal";

        return "Genus: " + genus + "\nSpecies: " + species + "\nExtinct: "
               + strExtinct + "\nCompanion animal: " + strCompanion;
    }
}
