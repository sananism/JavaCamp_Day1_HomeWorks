package day1HomeWork2;

public class arraysDemo {

	public static void main(String[] args) {
		
		String[] students = new String[4];
        students[0] = "Senan";
        students[1] = "Sabitson";
        students[2] = "Ismayilli";
        students[3] = "Sanan";
        // students[4] = "olmaz";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("---------------");

        for (String student : students) {
            System.out.println(student);
        }
	}

}
