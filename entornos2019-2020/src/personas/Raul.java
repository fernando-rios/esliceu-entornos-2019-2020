package personas;

import comun.Persona;

public class Raul extends Persona {

    public Raul(String nombre) {
        super("Raul");
    }

    @Override
    public String llamame(String frase) {
        return "Me cago en mi puta vida";
    }
}
