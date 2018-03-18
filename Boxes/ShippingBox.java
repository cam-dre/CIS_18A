public class ShippingBox extends Container {
    private String thickness;
    private boolean waterProof;

    public ShippingBox(String mfr, String stockNum, String thickness, boolean waterProof) {
        super(mfr, stockNum);
        this.thickness = thickness;
        this.waterProof = waterProof;
    }
    public String toString() {
        String strWater;

        if (waterProof)
            strWater = "Is waterproof";
        else
            strWater = "Is not waterproof";

        return "Manufacturer: " + mfr + "\nStock Number: " + stockNum
               + "\nThickness: " + thickness + "\nWaterProof: " + strWater + "\n";
    }
}
