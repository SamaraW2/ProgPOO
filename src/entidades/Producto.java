package entidades;

public class Producto {
    // atributos de la clase o variables de instancia
    private int id;
    private String nombProducto;
    private double precio;
    private int stockActual;

    // metodo constructor

    public Producto(){

         this.id=1;
         this.nombProducto="No especificado";
         this.precio=0;
         this.stockActual=1;
    }

    public  Producto(int id, String nombProducto){
        this.id=id;
        this.nombProducto=nombProducto;
    }

    public Producto(int id, String nombProducto, double precio, int stockActual){
        this.id=id;
ls
    }
    // metodos de la clase
    public void mostrarProdutos() {
        System.out.println(id + "" + nombProducto + "Precio:$" + precio + "stock" + stockActual);
    }

    public void setId(int id) {
        this.id = id;
    }

    // this es el puntero hacia la propia clase (atributos y metodos)
    // sobre carga de nombre
    public int getId() {
        return this.id;
    }

    public void setNomProducto(String nomProducto) {
        this.nombProducto = nomProducto;
    }

    public String getNomProducto() {
        return this.nombProducto;
    }

    public void setPrecio(double Precio) {
        this.precio = precio;
    }

    public void setStockActual(int stockActual) {
        this.stockActual=stockActual;
    }

    public int getStockActual(){
        return this.stockActual;
    }

    public void actualizarStock(){
       this.stockActual=stockActual+10;
    }
    public void actualizarStock(int cantidad){
        this.stockActual=this.stockActual+cantidad;
    }

}