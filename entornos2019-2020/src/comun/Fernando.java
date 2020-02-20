package comun;

public class Fernando extends Persona {

	public Fernando(String nombre) {
		super("Fernando");
		// TODO Auto-generated constructor stub
	}

	public String llamame(String frase) {
		return frase.replace('a', 'e');
	}
}
