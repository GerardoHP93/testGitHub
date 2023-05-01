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

## Se crea algunos métodos modificar el ArrayList.

Tales métodos necesarios tales como: llenar los Estados (Estados que apareceran por defecto), para recorrer los Estados, eliminar,
añadir y actualizar, todo estos métodos seran llamados luego al hacer click en los botones de la interfaz.

```
    public static void llenarEstados(){
        estados.add(new Estado(1,"Campeche","Calkini"));
        estados.add(new Estado(2,"Campeche","Seybaplaya"));
        estados.add(new Estado(3,"Yucatan","Progreso"));        
        estados.add(new Estado(4,"Yucatan","Mérida"));   
        estados.add(new Estado(3,"Tabasco","VillaHermosa"));  
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
    
    //Se elimina un objeto estado a través de su ID.
    public static void eliminarEstados(int id){
        estados.remove(id);
    }
        
    //Se añade un nuevo Estado llamando al método add y dentro al constructor creado anteriormente    
    public static void añadirEstados(int id,String nombre, String municipio){
        estados.add(new Estado(id,nombre,municipio));
    }
    
    //Se modifican los valores de un objeto Estado ya creado, utilizando el atributo recNo como identificador.
    public static void actualizarEstado(int recNo, int id, String nombre, String municipio){
        estados.get(recNo).setId(id);
        estados.get(recNo).setNombre(nombre);
        estados.get(recNo).setMunicipio(municipio);

    }
 

```
## Creamos la interfaz para mostrar los datos con una tabla

Se crea un JFrame, y creamos los textField para colocar los datos de nuestro estado que queramos ingresar o actualizar. 
De igual forma los botones aceptar, eliminar, limpiar y actualizar. Y tambien un JTable que sera donde se muestren los datos.
Yo lo puse todo en un jPanel solo para ponerle un color.

[![1.png](https://i.postimg.cc/ncC8k8Rc/1.png)](https://postimg.cc/YhKyrPBJ)


![]texto(ruta)
