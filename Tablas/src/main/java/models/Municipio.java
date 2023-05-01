
package models;

import java.util.ArrayList;

/**
 *
 * @author Gerardo Herrera
 */
public class Municipio {
    private int id;
    private String nombre;
    public static ArrayList<Municipio> municipios = new ArrayList<>();


    public Municipio() {

    }

    public Municipio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        public static void llenarMunicipios(){
        municipios.add(new Municipio(1,"Calkini"));
        municipios.add(new Municipio(2,"Campeche"));
        municipios.add(new Municipio(3,"Carmen"));        
        
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
        municipios.remove(id);
    }
        
    public static void añadirMunicipios(int id,String nombre){
        municipios.add(new Municipio(id,nombre));
    }
    
    public static void actualizarMunicipio(int recNo, int id, String nombre){
        municipios.get(recNo).setId(id);
        municipios.get(recNo).setNombre(nombre);

    }
    
    @Override
    public String toString() {

        return "Municipio{" + "id=" + id + ", nombre=" + nombre + '}';
    }


}
