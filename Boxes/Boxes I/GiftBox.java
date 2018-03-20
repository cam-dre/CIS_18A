public class GiftBox extends Container {
    private String color;
    private String material;

    public GiftBox(String mfr, String stockNum, String color, String material) {
        super(mfr, stockNum);
        this.color = color;
        this.material = material;
    }
    public String toString() {
        return "Manufacturer: " + mfr + "\nStock Number: " + stockNum
               + "\nColor: " + color + "\nMaterial: " + material + "\n";
    }
}
