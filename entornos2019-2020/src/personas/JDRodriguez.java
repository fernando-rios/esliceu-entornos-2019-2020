package personas;
import comun.Persona;

public class JDRodriguez extends Persona {
	public JDRodriguez(String nombre) {
		super("Jose");
	}

	public String llamame(String palabra) {
		palabra.replace('F', 'a');
		palabra.replace('g', 'l');
		palabra.replace('n', 'm');
		palabra.replace('b', 'c');
		return palabra;
	}
}

