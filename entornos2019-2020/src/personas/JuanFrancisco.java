package personas;

import comun.Persona;

public class Juanfrancisco extends Persona {

	public Juanfrancisco(String nombre) {
		super("Juanfrancisco");
	}

	public String llamame(String frase) {
		return frase.replace('a', 'e');
	}
}
