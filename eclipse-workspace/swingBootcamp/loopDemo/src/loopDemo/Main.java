package loopDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Finished");
		
		int i =2;
		while(i < 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("Finished x2");
		
		int j = 10;
		do {
			System.out.println(j);
			j+=2;
		}while(j < 10);
	}

}
