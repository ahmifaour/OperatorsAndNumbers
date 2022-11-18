package com.ahmi.opsandnumbers;

public class OperatorsAndNumbers {

	public static void main(String[] args) {
	
		decimalToBinary();
		binaryToDecimal();
		binaryShifterLeft();
		binaryShifterRight();
		threeIntVariable();
		postFixIncrement();
		threeIncrements();
		finalQuestion();
	}
	
		public static void decimalToBinary() {
		int decimal1 = 00000001;
		int decimal2 = 00001000;
		int decimal3 = 00011001;
		int decimal4 = 01001110;
		int decimal5 = 001100010011;
		float decimal6 = 010000100011000011f;
		
		System.out.println("Binary for decimal 1: " + decimal1);
		System.out.println("Binary for decimal 2: " + decimal2);
		System.out.println("Binary for decimal 3: " + decimal3);
		System.out.println("Binary for decimal 4: " + decimal4);
		System.out.println("Binary for decimal 5: " + decimal5);
		System.out.println("Binary for decimal 6: " + decimal6);
		
		}
		
		public static void binaryToDecimal() {
		
		int binary1 = 2;
		int binary2 = 17;
		int binary3 = 52;
		int binary4 = 114;
		int binary5 = 543;
		int binary6 = 11371;
		
		System.out.println("Decimal for binary 1: " + binary1);
		System.out.println("Decimal for binary 2: " + binary2);
		System.out.println("Decimal for binary 3: " + binary3);
		System.out.println("Decimal for binary 4: " + binary4);
		System.out.println("Decimal for binary 5: " + binary5);
		System.out.println("Decimal for binary 6: " + binary6);
		
		}
		
		
		public static void binaryShifterLeft() {
		
		int x = 2;
		Integer.toBinaryString(x);
		/*
		 * I think the value will be 4.
		 */
		x = x << 1;
		System.out.println("Value of x: " + x);
		
		int y = 9;
		Integer.toBinaryString(y);
		/*
		 * I think the value will be 17.
		 */
		y = y << 1;
		System.out.println("Value of y: " + y);
		
		int z = 17;
		Integer.toBinaryString(z);
		/*
		 * I think the value will be 38. 
		 */
		z = z << 1;
		System.out.println("Value of z: " + z);
		
		int q = 88;
		Integer.toBinaryString(q);
		/*
		 * I think the value will be 176.
		 */
		System.out.println("Value of q: " + q);
		
		}
		
		
		public static void binaryShifterRight() {
		
		int x = 150;
		Integer.toBinaryString(x);
		/*
		 * I think the value of the decimal will be 42, and the binary value will be 0100110.
		 */
		x = x >> 2;
		System.out.println("Value of x: " + x);
		
		int y = 225;
		Integer.toBinaryString(y);
		/*
		 * I think the value of the decimal will be 41, and the binary value will be 01001001.
		 */
		y = y >> 2;
		System.out.println("Value of y: " + y);
		
		int z = 1555;
		Integer.toBinaryString(z);
		/*
		 * I think the value decimal value will be 388, and the binary value will be 0110000100.
		 */
		z = z >> 2;
		System.out.println("Value of z: " + z);
		
		int q = 32456;
		Integer.toBinaryString(q);
		/*
		 * I think the decimal value will be 8114, and the binary value will be 01111110110010.
		 */
		q = q >> 2;
		System.out.println("Value of q: " + q);		
		}
		
		
		public static void threeIntVariable() {
			int x, y, z1, z2;
			x = 7;
			y = 17;
			
			z1 = x & y;
			z2 = x | y;
			
			System.out.println("Result 1: " + z1);
			System.out.println("Result 2: " + z2);
		}
		
		public static void postFixIncrement() {
		
			int x = 1;
			int x2;
			x2 = x++;
			
			System.out.println("Value of x: " + x);
			System.out.println("Value of x2: " + x2);
		}
		
		public static void threeIncrements() {
			
			int x = 1;
			int y;
			System.out.println("Value of x before: " + x);
			
			y = x++;

			System.out.println("Value of y after: " + y);
			
			int x2 = 1;
			
			System.out.println("Value of x2 before: " + x2);
			
			x2+=1;
			
			System.out.println("Value of x2 after: " + x2);
			
			int x3 = 1;
			int y2;
			System.out.println("Value of x3 before: " + x3);
			
			y2 = ++x3;
			System.out.println("Value of y2 after: " + y2);
		}
		
		public static void finalQuestion() {
			
			int x = 5;
			int y = 8;
			int z = ((++x) + y);
			
			System.out.println("Value of z: " + z);
			
			int x2 = 5;
			int y2 = 8;
			int z2 = ((x2++) + y2);
			System.out.println("Value of z2: " + z2);
		}
}
