package arraysDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] students = new String[4];
		students[0] = "Beyza";
		students[1] = "Kerçek";
		students[2] = "Deniz";
		students[3] = "Güneş";
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		for(String student:students) {
			System.out.println(student);

		}
	}
}
