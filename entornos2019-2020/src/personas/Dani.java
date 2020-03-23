package personas;

import comun.Persona;

public class Dani extends Persona {

	public Dani(String name) {
		super("Daniel Carrillo Cardús");
	}

	public String llamame(String s) {
    		return s.toUpperCase();
	}
}
