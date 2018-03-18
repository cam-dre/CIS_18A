public class Reptile extends Animal {
    public Reptile(String genus, String species, boolean extinct) {
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
