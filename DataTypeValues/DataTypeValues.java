// =====================================================================================
// Attached: HW_2a, 2b
// =====================================================================================
// File: HW_2a - DataTypeValues.java
// =====================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =====================================================================================
public class DataTypeValues {
	public static void main(String[] args) {
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		
		System.out.println("The minimum byte value is " + minByte);
		System.out.println("The maximum byte value is " + maxByte);
		System.out.println("The minimum short value is " + minShort);
		System.out.println("The maximum short value is " + maxShort);
		System.out.println("The minimum int value is " + minInt);
		System.out.println("The maximum int value is " + maxInt);
		System.out.println("The minimum long value is " + minLong);
		System.out.println("The maximum long value is " + maxLong);
		System.out.println("The minimum float value is " + minFloat);
		System.out.println("The maximum float value is " + maxFloat);
		System.out.println("The minimum double value is " + minDouble);
		System.out.println("The maximum double value is " + maxDouble);
	}
}

/* ==== OUTPUT =========================================================================
The minimum byte value is -128
The maximum byte value is 127
The minimum short value is -32768
The maximum short value is 32767
The minimum int value is -2147483648
The maximum int value is 2147483647
The minimum long value is -9223372036854775808
The maximum long value is 9223372036854775807
The minimum float value is 1.4E-45
The maximum float value is 3.4028235E38
The minimum double value is 4.9E-324
The maximum double value is 1.7976931348623157E308
======================================================================================*/