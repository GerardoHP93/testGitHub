package com.mycompany.tablas;

import Views.Principal;
import java.util.ArrayList;
import models.Estado;
import static models.Estado.*;

/**
 *
 * @author Gerardo Herrera
 */
public class Main {

    public static Principal principal = new Principal();

    
    public static void main(String[] args) {
        
        
        /*llenarMunicipios();
        listaMunicipiosForE();
        System.out.println("");
        listaMunicipiosForI();  
        eliminarMunicipios(3);
        listaMunicipiosForI();
        */
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);

    }
}
