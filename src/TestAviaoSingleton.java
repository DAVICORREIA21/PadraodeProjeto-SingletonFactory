
public class TestAviaoSingleton {

	public static void main(String[] args) {

		agendarAssento("1A");
		agendarAssento("1B");
	}

	private static void agendarAssento(String assento) {

		AviaoSingleton a = AviaoSingleton.getINSTANCE();
		System.out.println(a.bookAssento(assento));

	}
}