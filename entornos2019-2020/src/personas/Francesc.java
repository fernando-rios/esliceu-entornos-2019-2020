package personas;

import comun.Persona;

public class Francesc extends Persona {

	public Francesc(String nombre) {
		super("Francesc");
	}

	public String llamame(String frase) {
		return frase.replace('a', 'e');
	}
}
