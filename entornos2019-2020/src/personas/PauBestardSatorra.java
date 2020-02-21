package personas;

import comun.Persona;


public class PauBestardSatorra extends Persona {
    public PauBestardSatorra(String nombre) {
        super("PauBestardSatorra");
    }

    public String llamame(String frase) {
        frase = "xXXx_" + frase + "_xXXx";
        frase = frase.replace("t", "']'");
        frase = frase.replace("T", "']'");
        frase = frase.replace("v", "\\/");
        frase = frase.replace("V", "\\/");
        frase = frase.replace("d", "[)");
        frase = frase.replace("D", "[)");
        frase = frase.replace("a", "4");
        frase = frase.replace("A", "4");
        frase = frase.replace("c", "(");
        frase = frase.replace("C", "(");




        return frase;
    }
}
