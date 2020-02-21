package personas;

public class Carles extends Persona {
	public Carles(String nombre) {
		super("Carles");
	}

	public String llamame(String frase) {
		return frase.replace('a', 'e');
	}
}
