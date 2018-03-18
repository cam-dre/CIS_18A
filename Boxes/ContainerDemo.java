// =================================================================================
// Attached: HW_10a, 10b
// =================================================================================
// File: HW_10a - Containers
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
public class ContainerDemo {
    public static void main(String[] args) {
        // Two GiftBox objects are created and initialized with values
        GiftBox giftBox_1 = new GiftBox("ABC Co.", "100", "White", "Paper");
        GiftBox giftBox_2 = new GiftBox("CBA Co.", "101", "Black", "Cardboard");

        // Two ShippingBox objects are created and initialized with values
        ShippingBox shipBox_1 = new ShippingBox("DEF Co.", "102", "2 inches", false);
        ShippingBox shipBox_2 = new ShippingBox("FED Co.", "103", "5 inches", true);

        // All boxes are displayed
        System.out.println(giftBox_1 + giftBox_2 + shipBox_1 + shipBox_2);
    }
}
