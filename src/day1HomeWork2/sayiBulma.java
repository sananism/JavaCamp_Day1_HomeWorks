package day1HomeWork2;

public class sayiBulma {

	public static void main(String[] args) {
		
		int [] sayilar = new int []{1,2,5,7,9,0};
		int aranacak = 2;
		boolean tapildi = false;
		for(int finder:sayilar) {
			if(finder == aranacak) {
				tapildi = true;
				break;
			}
		}
		if(tapildi) {
			System.out.println("sayiniz bulundu");
		}else {
			System.out.println("bulunamadi");
		}

	}

}
