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
    
    
    public static void listaMunicipiosForE(){
        System.out.println("For each");
        for (Municipio municipio : municipios) {
            System.out.println(municipio);
        }
    }
    
    public static void listaMunicipiosForI(){
        System.out.println("forI");
        for (int i = 0; i < municipios.size(); i++) {
            System.out.println(municipios.get(i).toString());
        }
    }
    
    public static void eliminarMunicipios(int id){
        municipios.remove(id-1);
    }
        
    public static void añadirMunicipios(int id,String nombre){
        municipios.add(new Municipio(id,nombre));
    }
    
    public static void main(String[] args) {
       llenarMunicipios();
       listaMunicipiosForE();
       System.out.println("");
       listaMunicipiosForI();

       eliminarMunicipios(3);
       listaMunicipiosForI();
      
    }
}
