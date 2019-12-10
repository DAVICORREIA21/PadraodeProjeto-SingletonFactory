import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {

	private static AviaoSingleton INSTANCE;
	private Set<String> assentosDisponiveis;

	private AviaoSingleton() {
		this.assentosDisponiveis = new HashSet<>();
		assentosDisponiveis.add("1A");
		assentosDisponiveis.add("1B");
	}

	public boolean bookAssento(String assento) {
		return assentosDisponiveis.remove(assento);
	}

	public static AviaoSingleton getINSTANCE() {
		if (INSTANCE == null) {
			INSTANCE = new AviaoSingleton();
		}
		return INSTANCE;
	}

	public static void setINSTANCE(AviaoSingleton iNSTANCE) {
		INSTANCE = iNSTANCE;
	}

}
