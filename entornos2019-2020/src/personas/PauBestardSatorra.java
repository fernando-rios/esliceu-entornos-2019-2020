package personas;
import comun.Persona;


public class PauBestardSatorra extends Persona {
    public PauBestardSatorra(String nombre) {
        super("PauBestardSatorra");
    }
    public String llamame(String frase) {
        return frase.replace('a', 'e');
    }
}
