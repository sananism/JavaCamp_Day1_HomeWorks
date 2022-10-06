package day1HomeWork2;

import java.util.Scanner;

public class sesliHarfler {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir herf yazin : ");
		String letter = scan.nextLine();
		
        switch (letter) {
        case  "A" :
        case "I":
        case "O":
        case "U":
            System.out.println("Kalın sesli harf");
            break;
        default:
            System.out.println("İnce sesli harf");
    }


	}

}
