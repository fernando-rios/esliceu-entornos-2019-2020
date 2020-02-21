package personas;

import comun.Persona;

public class Edu extends Persona {

	public Edu(String nombre) {
		super("Edu");
	}

	public String llamame(String frase) {
		return frase.replace('a', 'e');
	}
}
