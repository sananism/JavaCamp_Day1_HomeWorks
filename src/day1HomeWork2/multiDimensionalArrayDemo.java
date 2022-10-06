package day1HomeWork2;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
        String[][] cities = new String[3][3];
        
        cities[0][0] = "28 May";
        cities[0][1] = "20 Yanvar";
        cities[0][2] = "Genclik";
        
        cities[1][0] = "Mastaga";
        cities[1][1] = "Nardaran";
        cities[1][2] = "Buzovna";
        
        cities[2][0] = "Baki";
        cities[2][1] = "Gence";
        cities[2][2] = "Sumqayit";
        
        for(int i=0; i<=2; i++) {
        	for(int j=0; j<=2; j++)
        	System.out.println(cities[i] [j]);
        }
 
	}

}
