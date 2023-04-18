/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tablas;

import models.Municipio;

/**
 *
 * @author Gerardo Herrera
 */
public class Main {
    public static void main(String[] args) {
        Municipio calkini = new Municipio(1,"Calkini");
        System.out.println(calkini.toString());
        
        Municipio campeche = new Municipio();
        campeche.setId(2);
        campeche.setNombre("Campeche");
        System.out.println(campeche.toString());
       
    }
}
