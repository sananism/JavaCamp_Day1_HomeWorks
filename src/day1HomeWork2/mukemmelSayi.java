package day1HomeWork2;

import java.util.Scanner;

public class mukemmelSayi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir reqem yazin : ");
		int number = scan.nextInt();
		int total=0;
		
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				total = total + i;
			}
		}
		if(total == number) {
			System.out.println("Mukemmel Sayi");
		}else {
			System.out.println("Mukemmel Sayi degildir");
		}

	}

}
