package personas;
import comun.Persona;
public class PiñanMolinaJuanfrancisco extends Persona {
	public PiñanMolinaJuanfrancisco(String nombre) {
		super("PiñanMolinaJuanfrancisco");
	}

	public String llamame(String frase) {
		return frase.replace('a', 'e');
		return frase.replace('b', 'c');
		return frase.replace('k', 'q');
		return frase.replace('l', 'm');
		return frase.replace('v', 'y');
		return frase.replace('a', 't');
		return frase.replace('y', 'u');
		return frase.replace('p', 'x');
	}
	
}
