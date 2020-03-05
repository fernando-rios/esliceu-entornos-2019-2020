package comun;

public abstract class Persona {

	private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }
   
    public String getNombre(){return nombre;}
   
    public abstract String llamame(String frase);
<<<<<<< HEAD
    public void pauConflict(String input){
        System.out.println("Potatoes are quite good for ya buddy boy.");
    }
=======
    
    public void crearConflicto(){
    	// Este metodo lo creamos para crear un conflicto
    }

>>>>>>> c223667ce9c05ed857067f4599d3ac3d7c86af0f
}
