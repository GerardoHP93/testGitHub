
package models;

import java.util.ArrayList;

/**
 *
 * @author Gerardo Herrera
 */
public class Estado {
    private String id;
    private String nombre;
    private String municipio;
    public static ArrayList<Estado> estados = new ArrayList<>();


    public Estado() {
    }

    public Estado(String id, String nombre, String municipio) {
        this.id = id;
        this.nombre = nombre;
        this.municipio = municipio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
    public static void llenarEstados(){
        estados.add(new Estado("1","Campeche","Calkini"));
        estados.add(new Estado("2","Campeche","Seybaplaya"));
        estados.add(new Estado("3","Yucatan","Progreso"));        
        estados.add(new Estado("4","Yucatan","Mérida"));   
        estados.add(new Estado("5","Tabasco","VillaHermosa"));  
    }
    
    
    public static void listaEstadosForE(){
        System.out.println("For each");
        for (Estado estado : estados) {
            System.out.println(estado);
        }
    }
    
    public static void listaEstadosForI(){
        System.out.println("forI");
        for (int i = 0; i < estados.size(); i++) {
            System.out.println(estados.get(i).toString());
        }
    }
    
    public static void eliminarEstados(int id){
        estados.remove(id);
    }
        
    public static void añadirEstados(String id,String nombre, String municipio){
        estados.add(new Estado(id,nombre,municipio));
    }
    
    public static void actualizarEstado(int recNo, String id, String nombre, String municipio){
        estados.get(recNo).setId(id);
        estados.get(recNo).setNombre(nombre);
        estados.get(recNo).setMunicipio(municipio);

    }
    
    @Override
    public String toString() {

        return "Estado{" + "id=" + id + ", nombre=" + nombre +" municipio= "+ municipio + '}';
    }


}
