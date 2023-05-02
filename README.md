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

## Configurar el JTable para mostrar los datos

1- Instanciamos un modelo de tabla (DefaultTableModel), nos servira para modificar nuestro Jtable. Ahora agregamos el método para agregar la cabezera al Jtable.
A través de un arreglo con los nombre que queramos que tengan nuestras columnas. 

```
    public void setModelo(){
        String[] tlbCabecera = {"No ","ID","Estado","Municipio"};
        dataEstados.setColumnIdentifiers(tlbCabecera);
        tlbEstados.setModel(dataEstados);
    }
```

2- Se agrega el método setDatos(), para añadir los datos a la tabla. Se crea primero un arreglo de tipo Object que servira para guardar los datos de cada objeto
Estado cuando se vayan interando por cada vuelta con el forEach en el orden de las columnas, y se vayan guardando en la filas del Jtable.

```
    public void setDatos(){
        Object[] datos = new Object[dataEstados.getColumnCount()];
        int i =0;
        dataEstados.setRowCount(0);
        for (Estado municipio : estados) {
            datos[0] = i;
            datos[1] = municipio.getId();
            datos[2] = municipio.getNombre();
            datos[3] = municipio.getMunicipio();

            i++;
            dataEstados.addRow(datos);
        }
        tlbEstados.setModel(dataEstados);
        
    }
```
## Le damos funcionalidad a los botones, creando las instrucciones necesarias dependiendo del botón

1- Método camposVacios(). Yo lo coloque para virificar si los campos de textField tienen el texto predeterminado que les coloque, si es asi es porque no se ha ingresado nada y no deja agregar o actualizar los Estados.

```
    public boolean camposVacios(){
        if(txtNombre.getText().equals("Nombre del estado") 
            || txtId.getText().equals("Ingrese el ID")
            || txtMunicipio.getText().equals("Un municipio del estado")){
            return false;
        }else{
            return true;
        }
        
    }
    
```

1. Método limpiarCampos(). Se reseetea los campos de texto de los textField. 
```
    public void limpiarCampos(){
        this.txtRecNo.setText("-1");
        this.txtId.setText("Ingrese el ID");
        this.txtId.setForeground(GRAY);
        this.txtNombre.setText("Nombre del estado");
        this.txtNombre.setForeground(GRAY);

        this.txtMunicipio.setText("Un municipio del estado");
        this.txtMunicipio.setForeground(GRAY);

    }
```
2- Botón "Aceptar" MouseClicked. Si los campos de textEdit no se ha ingresado nada, sale un mensaje de error. Si si, se colocan los datos ingresados en los textField en variables dependiendo el dato. Y se hace un if para verificar si el estado existe o decir su Registro, para eso se usa la variables RecNo. Si no existe se añade un nuevo estado a travez del metodo añadirEstado(). Si ya existe es porque esta
actualizando y por eso que aparece compo que ya existe el registro. Entonces se llama al método actualizar. Al final de setean los datos de nuevo a la tabla.

```
    private void btnCAceptarMouseClicked(java.awt.event.MouseEvent evt) {                                         
            
        if (camposVacios()) {
        
            int recNo = Integer.parseInt(this.txtRecNo.getText().trim());
            String id = this.txtId.getText();
            String nombre = this.txtNombre.getText(); 
            String municipio = this.txtMunicipio.getText();      
        
            if (recNo == -1) {
                Estado.añadirEstados(id, nombre, municipio);
            }else{
                System.out.println("Actualizando datos");
                Estado.actualizarEstado(recNo, id, nombre, municipio);
                this.btnActualizar.setSelected(false);
                System.out.println(estados);
            }

            setDatos();
            limpiarCampos();                  
        
        }else{
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
        }   
               
    }
```

3. Boton limpiar. Se llama al método limpiar. 

```
    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        limpiarCampos();
    } 
```

4- Botón eliminar. A través de una variable se verifica que fila esta seleccionada por el usuario, y con el método eliminar de la clase Estado se borra la fila. 
Si no esta seleccionada ninguna fila aparece un mensaje.

```
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {                                         
        
        int filaActual = tlbEstados.getSelectedRow();

        if (filaActual != -1) {
            System.out.println(filaActual);
            Estado.eliminarEstados(filaActual);
            setDatos();
            System.out.println(estados);
        } else{
            JOptionPane.showMessageDialog( null, "No hay filas existentes para eliminar");
        }       
        
    }                                        
```
5- Botón actualizar. El botón es un toggleBotton porque usaremos su estado determinar si se puede actualizar o no. Primero se guarda la fila seleccionada, si el boton actualizar esta seleccionado aparecen en los textField los datos de esa fila seleccionada, para ser modificados y después darle al botón actualizar para finalizar.
Si no esta seleccionada ninguna fila aparece un mensaje.

```
    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {                                           
        int filaActual = tlbEstados.getSelectedRow();
        System.out.println(filaActual);
        System.out.println(this.btnActualizar.isSelected());
        if (this.btnActualizar.isSelected()) {
            if (filaActual != -1) {
                System.out.println(dataEstados.getValueAt(filaActual, 0));
                System.out.println(dataEstados.getValueAt(filaActual, 1));
                System.out.println(dataEstados.getValueAt(filaActual, 2));
                System.out.println(dataEstados.getValueAt(filaActual, 3));
                
                this.txtRecNo.setText(""+dataEstados.getValueAt(filaActual, 0));
                this.txtId.setText(""+dataEstados.getValueAt(filaActual, 1));
                this.txtNombre.setText(""+dataEstados.getValueAt(filaActual, 2));
                this.txtMunicipio.setText(""+dataEstados.getValueAt(filaActual, 3));
   
            }else{
                JOptionPane.showMessageDialog( null, "Debe seleccionar un registro");
                this.btnActualizar.setSelected(false);
            } 
        }else{
            limpiarCampos();
        }

    }
```


