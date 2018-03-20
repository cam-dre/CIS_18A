public class Turtle extends Reptile {
    private int avgEggs;

    public Turtle(String genus, String species, boolean extinct, int avgEggs) {
        super(genus, species, extinct);
        this.avgEggs = avgEggs;
    }
    public String getDesc() {
        String strExtinct;

        if (extinct)
            strExtinct = "Extinct";
        else
            strExtinct = "Not extinct";

        return "Genus: " + genus + "\nSpecies: " + species + "\nExtinct: "
                + strExtinct + "\nAverage # eggs/clutch: " + avgEggs;
    }
}
