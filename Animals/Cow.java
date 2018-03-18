public class Cow extends Mammal {
    private boolean milkProducer;

    public Cow(String genus, String species, boolean extinct, boolean milkProducer) {
        super(genus, species, extinct);
        this.milkProducer = milkProducer;
    }
    public void speak() {
        System.out.println("Moooo!\n");
    }
    public String getDesc() {
        String strMilk;
        String strExtinct;

        if (extinct)
            strExtinct = "Extinct";
        else
            strExtinct = "Not extinct";

        if (milkProducer)
            strMilk = "This animal produces milk";
        else
            strMilk = "This animal does not produce milk";

        return "Genus: " + genus + "\nSpecies: " + species + "\nExtinct: "
               + strExtinct + "\nMilk producer: " + strMilk;
    }
}