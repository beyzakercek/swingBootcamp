package switchDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		
		switch(grade) {
			case 'A':
				System.out.println("passed");
				break;
			case 'B':
				System.out.println("passed");
				break;	
			case 'C':
				System.out.println("passed");
				break;	
			case 'D':
				System.out.println("passed");
				break;	
			case 'F':
				System.out.println("failed");
				break;	
			default:
				System.out.println("Invalid");
		}
	}

}
