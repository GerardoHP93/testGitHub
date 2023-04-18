/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tablas;

import java.util.ArrayList;
import models.Municipio;

/**
 *
 * @author Gerardo Herrera
 */
public class Main {
    
    static ArrayList<Municipio> municipios = new ArrayList<>();
    
    public static void llenarMunicipios(){
        municipios.add(new Municipio(1,"Calkini"));
        municipios.add(new Municipio(2,"Campeche"));
        municipios.add(new Municipio(3,"Carmen"));

        System.out.println(municipios);
        
        
    }
    
    
    public static void main(String[] args) {
       llenarMunicipios();
       
    }
}
