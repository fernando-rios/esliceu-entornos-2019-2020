package personas;

import comun.Persona;

public class Adrian extends Persona {

	public Adrian(String nombre) {
		super("Adrian");
	}

	public String llamame(String frase) {
		return frase.replace('a', 'e');
	}
}
