package personas;

import comun.Persona;

public class Mikel extends Persona {

	public Mikel(String nombre) {
		super("Mikel");
	}

	public String llamame(String frase) {
		return frase.concat(frase,", mi moto alpina derapante");
	}
}
