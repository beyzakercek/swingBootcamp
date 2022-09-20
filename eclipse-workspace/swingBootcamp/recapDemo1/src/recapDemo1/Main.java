package recapDemo1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20, num2 = 25, num3 = 2;
		int max = num1;
		
		if(num2 > max) {
			max = num2;
		}else if(num3 > max) {
			max = num3;
		}
		
		System.out.println(max);
	}

}
