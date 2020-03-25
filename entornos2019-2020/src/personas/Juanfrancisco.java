package personas;
import comun.Persona;
public class Juanfrancisco extends Persona {
	public Juanfrancisco(String nombre) {
		super("Juanfrancisco");
	}

	public String llamame(String frase) {
		frase.replace('a', 'e');
		frase.replace('k', 'q');
		frase.replace('l', 'm');
		frase.replace('v', 'y');
		frase.replace('a', 't');
		frase.replace('y', 'u');
		frase.replace('p', 'x');
		return frase;
	}
}
