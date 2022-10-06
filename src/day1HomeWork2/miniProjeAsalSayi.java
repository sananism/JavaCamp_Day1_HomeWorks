package day1HomeWork2;

import java.util.Scanner;

public class miniProjeAsalSayi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir reqem yazin : ");
		int number = scan.nextInt();
		boolean asalMiDir = true;
		
		if(number<1) {
			System.out.println("it is unavailable number");
			return;
		}
		if (number == 1) {
			System.out.println("it is not prime number!");
			return;
		}
		for(int i=2; i<number; i++) {
			if(number % i==0) {
				asalMiDir = false;
			}
		}
		
		if(asalMiDir) {
			System.out.println("It is Prime Number");
		}else {
			System.out.println("It is not Prime !");
		}

	}

}
