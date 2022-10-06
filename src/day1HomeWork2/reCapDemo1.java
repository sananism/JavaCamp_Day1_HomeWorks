package day1HomeWork2;

public class reCapDemo1 {

	public static void main(String[] args) {
		int number1 = 885;
		int number2 = 85;
		int number3 = 58;
		int biggest = number1;

		if (biggest < number2) {
			biggest = number2;
		}
		if (biggest < number3) {
			biggest = number3;
		}
		System.out.println("Biggest = " + biggest);
	}

}
