// =================================================================================
// Attached: HW_7a, 7b
// =================================================================================
// File: HW_7a - DieCount
// =================================================================================
// Programmer: Cameron Perry
// Class: CIS 18A
// =================================================================================
public class DieCount {
	public static void main(String[] args) {
		final int FACES = 6;
		int[] rollCount = new int[FACES];
		Die die = new Die();
		
		for (int i = 0; i < 500; i++) {
			int roll = die.roll();
			
			if (roll == 1)
				rollCount[0]++;
			else if (roll == 2)
				rollCount[1]++;
			else if (roll == 3)
				rollCount[2]++;
			else if (roll == 4)
				rollCount[3]++;
			else if (roll == 5)
				rollCount[4]++;
			else
				rollCount[5]++;
		}
		System.out.println("Roll\tCount");
		for (int i = 0; i < FACES; i++)
			System.out.println((i + 1) + "\t" + rollCount[i]);
	}
}

/* ==== OUTPUT =====================================================================
Roll	Count
1		88
2		81
3		80
4		84
5		85
6		82
==================================================================================*/