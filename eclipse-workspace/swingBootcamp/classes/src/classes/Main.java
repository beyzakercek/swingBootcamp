package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int num1 = 10;
		int num2 = 20;
		num1 = 30;
		System.out.println(num2);
		
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
		}

}

