package trendYolOdevi;

import java.util.Iterator;
import java.util.Scanner;

public class trendYol_DongulerVeSartliBloklar {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String login ="Giris yap";
		boolean isClickLogin = false;
		String clickyes;
		
		String [] brands = {"Puma","Nike","Mavi","Rahat Supermarket","Bravo","Embawood","Philips","Samsung","apple","Rolex"};
		String [] category = {"Erkek","Kadin","Cocuk","Mobilya","Elektronik","Supermarket","Saat&Aksesuar"};

		System.out.println("Sisteme giriş yapmak istiyorsanız 'y' basınız : ");
		clickyes = scan.nextLine();
		if("y".equals(clickyes)) {
			isClickLogin = true;
			if(isClickLogin==true) {
				login="";
			System.out.println("Giriş yapıldı ve Login silindi ... " + login );
			}
		}else {
			System.out.println("Yanlis birsey yazdiniz ...");
		return;
		}
		
		
		System.out.println("\n\n\n~~~~~~~~~KATEGORILER~~~~~~~~~~");
		for (int j = 0; j < category.length; j++) {
			
			System.out.println( (j+1)+ " . " + category[j]);
		}
		
		System.out.println("Bir kategori seçiniz : ");
		int number = scan.nextInt();
		
		if(number == 1 || number==2 || number==3) {
			System.out.println(" " + brands[0] + "\n " + brands[1]+ "\n " + brands[2]+ "\n " + brands[9]);
		} 
		else if(number == 4) {
			System.out.println (brands[5] + "\n" + brands[6]);
		}else if (number==5) {
			System.out.println(brands[6] + "\n" + brands[7]+ "\n" + brands[8]);
		}else if(number==6) {
			System.out.println(brands[3] + "\n" + brands[4]);
		}else if(number==7) {
			System.out.println(brands[9]);

		}else {
			System.out.println("Yanlis harfe bastiniz !! ");
		}
		
    }
}
 