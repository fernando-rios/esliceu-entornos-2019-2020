package personas;

import comun.Persona;


public class DavidGomez extends Persona {
    public DavidGomez(String nombre) {
        super("DavidGomez");
    }

    public String llamame(String frase) {
        String FernadoMejorProfesor = "¯\\_(ツ)_/¯";

        StringBuilder suspendido = new StringBuilder(frase);
        suspendido.append(FernadoMejorProfesor+"vaia vaia vaia");


        return suspendido.toString();
    }
}
