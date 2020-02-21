package personas;

import comun.Persona;

public class Miguel extends Persona {

	public Miguel(String nombre) {
		super("Miguel");
	}

	public String llamame(String frase) {
		return frase.replace('a', 'e');
	}
}
