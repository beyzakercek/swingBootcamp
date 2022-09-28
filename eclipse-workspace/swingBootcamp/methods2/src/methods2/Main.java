package methods2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Have a nice day";
		String newMessage = city();
		System.out.println(newMessage);
		int num = sum(2,3);
		System.out.println(num);

		int sum = sum2(2,3,4,5,6,7);
		System.out.println(sum);

	}
	public static void add() {
		System.out.println("Added");
	}
	public static void delete() {
		System.out.println("Deted");
	}
	public static void update() {
		System.out.println("Updated");
	}
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	public static String city() {
		return "İzmir";
	}
	public static int sum2(int... numbers) {
		int sum = 0;
		for(int num: numbers) {
			sum += num;
		}
		return sum;
	}
}
