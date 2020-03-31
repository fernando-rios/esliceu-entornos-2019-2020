package personas;
import comun.Persona;

public class Jero extends Persona {
	
	public Jero(String nombre) {
		super(nombre);
	}
	
	public String llamame(String palabra) {
		return palabra.replace('a', 'o');
	}
}
