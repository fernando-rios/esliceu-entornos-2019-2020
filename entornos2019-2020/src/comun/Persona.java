package comun;

public abstract class Persona {

	private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }
   
    public String getNombre(){return nombre;}
   
    public abstract String llamame(String frase);
    public void pauConflict(String input){
        System.out.println("Potatoes are quite good for ya buddy boy.");
    }
}
