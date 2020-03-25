package personas;
import comun.Persona;

public class Norberto extends Persona {
	public Norberto(String nombre) {
        super("Norberto");
	}
	
	public String llamame(String frase) {
		frase =  frase.replace(/[eiou]/gi, 'a');
		
		return frase;
	}

}
