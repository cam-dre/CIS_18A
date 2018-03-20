public class Mammal extends Animal {
    public Mammal(String genus, String species, boolean extinct) {
        super(genus, species, extinct);
    }
    public String getDesc() {
        String strExtinct;

        if (extinct)
            strExtinct = "Extinct";
        else
            strExtinct = "Not extinct";

        return "Genus: " + genus + "\nSpecies: " + species + "\nExtinct: "
               + strExtinct;
    }
}
