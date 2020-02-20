package personas;

import comun.Persona;

public class Fernando extends Persona {

	public Fernando(String nombre) {
		super("Fernando");
	}

	public String llamame(String frase) {
		return frase.replace('a', 'e');
	}
}
