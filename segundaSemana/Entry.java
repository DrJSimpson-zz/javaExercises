public class Entry {
	static int num = 20;
	static String hola = "Gola";

	public static void main(String[] args) {
		System.out.println("Hola " + args[0] + " " + args[1]);
		main(num, num + 2);
	}

	public static void main(int a, int b) {
		System.out.println(a + b);
	}
}
