package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int num = 6;
		int sum = 0;
		for(int i = 1; i < num ; i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		if(sum == num) {
			System.out.println("mük");
		}else {
			System.out.println("not mük");
		}
	}

}
