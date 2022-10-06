package day1HomeWork2;

public class reCapDemo2 {

	public static void main(String[] args) {
		
		double [] myList = {2.5,3.5,8.5,4.5};
		double total = 0;
		double max = myList[0];
			
		for(double number:myList) {
			if(max<number) {
				max=number;
			}
			total=total+number;
			System.out.println(number);
		}
		
		System.out.println("En boyuk : " + max);
		System.out.println("Total : " + total);

	}

}
