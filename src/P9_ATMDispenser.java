
/*
	ISYS 320
	Name(s): Dave Rapp
	Date: 3-26-18
*/

import java.util.*;

public class P9_ATMDispenser {
	public static Scanner kbd = new Scanner(System.in);

	public static void main(String[] args) {

		double orgAmount;
		int tens, ones;

		orgAmount = 105.00;
		System.out.printf("Amount you entered in Dollars: $%,.2f\n", orgAmount);

		tens = (int) orgAmount / 10;
		orgAmount = orgAmount % 10;
		System.out.println("Number of $10 bills: " + tens);

		ones = (int) orgAmount / 1;
		orgAmount = orgAmount % 1;
		System.out.println("Number of $1 bills: " + ones);

	}

}
