package personas;
import comun.Persona;

public class Carles extends Persona {
	public Carles(String nombre) {
		super("Carles");
	}

	public String llamame(String frase) {
		frase.replace('a', 'i');
		frase.replace('s', 'd');
		frase.replace('c', 'y');
		frase.replace('e', 'o');
		return frase;
	}
}
