package personas;
import comun.Persona;

public class JDRodriguez extends Personas {
	    public JDRodriguez(String nombre) {
		        super("JDRodriguez");
		    }

		    public String llamame(String frase) {
		        frase = frase.replace("a", "Ella");
		        frase = frase.replace("e", "No");
		        frase = frase.replace("i", "Te");
		        frase = frase.replace("o", "Ama");
		        frase = frase.replace("u", "F");
		        return frase;
		    }
}
