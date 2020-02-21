package personas;

import comun.Persona;


public class DanielCarrillo extends Persona {
    public DanielCarrillo(String nombre) {
        super("DanielCarrilloPelirrojo");
    }

    public String llamame(String frase) {
        StringBuilder mejorStringDeLaHistoriaDelMundoMundial = new StringBuilder(frase);
        mejorStringDeLaHistoriaDelMundoMundial.append("
 ____                                         __                                                    __                                    
/\  _`\                                      /\ \                                                  /\ \                                   
\ \ \L\_\ __  _ __   ___      __      ___    \_\ \    ___          __    _____   _ __  __  __    __\ \ \____    __      ___ ___      __   
 \ \  _\/'__`/\`'__/' _ `\  /'__`\  /' _ `\  /'_` \  / __`\      /'__`\ /\ '__`\/\`'__/\ \/\ \ /'__`\ \ '__`\ /'__`\  /' __` __`\  /'__`\ 
  \ \ \/\  __\ \ \//\ \/\ \/\ \L\.\_/\ \/\ \/\ \L\ \/\ \L\ \    /\ \L\.\\ \ \L\ \ \ \/\ \ \_\ /\  __/\ \ \L\ /\ \L\.\_/\ \/\ \/\ \/\  __/ 
   \ \_\ \____\ \_\\ \_\ \_\ \__/.\_\ \_\ \_\ \___,_\ \____/    \ \__/.\_\ \ ,__/\ \_\ \ \____\ \____\\ \_,__\ \__/.\_\ \_\ \_\ \_\ \____\
    \/_/\/____/\/_/ \/_/\/_/\/__/\/_/\/_/\/_/\/__,_ /\/___/      \/__/\/_/\ \ \/  \/_/  \/___/ \/____/ \/___/ \/__/\/_/\/_/\/_/\/_/\/____/
                                                                           \ \_\                                                          
                                                                            \/_/                                                          
\n");

        return mejorStringDeLaHistoriaDelMundoMundial.toString();
    }
}
