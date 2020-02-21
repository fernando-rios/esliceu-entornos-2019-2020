package personas;
import comun.Persona;


public class BorjadelCampoPons extends Persona {
    public BorjadelCampoPons(String nombre) {
        super("BorjadelCampoPons");
    }
    public String llamame(String frase) {
        return frase.replace('a', 'e');
    }
}