# Proyecto catalogo de Estados y Municipios utilizando POO y JTable


## Se crea el modelo Estado.

Se le añaden: Sus atributos ID, nombre del estado y minicipio. Tambien su constructor, sus getters y setters, to String y 
un ArrayList para contener objetos Estado.


```
public class Estado {
    private int id;
    private String nombre;
    private String municipio;
    public static ArrayList<Estado> estados = new ArrayList<>();


    public Estado() {
    }

    public Estado(int id, String nombre, String municipio) {
        this.id = id;
        this.nombre = nombre;
        this.municipio = municipio;
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

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    @Override
    public String toString() {

        return "Estado{" + "id=" + id + ", nombre=" + nombre +" municipio= "+ municipio + '}';
    }


}

```

## Se crea sus métodos modificar el ArrayList de los Estados tales como: llenar los Estados (Estados que apareceran por defecto), para recorrer los Estados, eliminar,
añadir y actualizar, todo estos métodos seran llamados luego al hacer click en los botones de la interfaz.




![]texto(ruta)
