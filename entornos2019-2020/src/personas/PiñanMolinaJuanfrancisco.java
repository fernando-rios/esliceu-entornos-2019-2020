package personas;

public class PiñanMolinaJuanfrancisco extends Persona {
	public PiñanMolinaJuanfrancisco(String nombre) {
		super("PiñanMolinaJuanfrancisco");
	}

	public String llamame(String frase) {
		return frase.replace('a', 'e');
	}
}
