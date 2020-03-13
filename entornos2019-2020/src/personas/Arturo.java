package personas;

import comun.Persona;

public class Arturo extends Persona {

    public Arturo(String nombre) {
        super("Antonio banderas es negro??");
    }

    public String llamame(String frase) {
        return frase.replace('o', 'u');
    }
}
