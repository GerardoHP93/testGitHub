/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tablas;

import java.util.ArrayList;
import models.Municipio;
import static models.Municipio.*;

/**
 *
 * @author Gerardo Herrera
 */
public class Main {
    

    public static void main(String[] args) {
       llenarMunicipios();
       listaMunicipiosForE();
       System.out.println("");
       listaMunicipiosForI();

       eliminarMunicipios(3);
       listaMunicipiosForI();
      
    }
}
