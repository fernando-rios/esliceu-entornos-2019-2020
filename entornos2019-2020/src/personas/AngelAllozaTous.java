package personas;

import comun.Persona;

public class AngelAllozaTous extends Persona {

	public AngelAllozaTous(String nombre) {
		super("AngelAllozaTous");
	}

	public String llamame(String frase) {
		return frase.replace('a', 'e');
	}
}
