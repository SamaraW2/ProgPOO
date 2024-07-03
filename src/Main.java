import entidades.Producto;

public class Main {
    public static void main(String[] args) {

         // crear un objeto de la clase producto(intancia de la clase producto)
         // use new Producto() crear producto vacio
         Producto p;
         p= new Producto();
        Producto producto1= new Producto();

 /*          producto1.id=1;
           producto1.nombProducto="Honda...";
           producto1.precio=150000;
           producto1.stockActual(1000);
  /*
        producto1.mostrarProducto();*/

           Producto producto2= new Producto();
           producto2.setNomProducto("Motomel zzz");
           producto2.setId(2);
           producto2.mostrarProdutos();

        System.out.println(producto2.getNomProducto());

           producto1.actualizarStock();
           producto1.actualizarStock(5);
           producto1.mostrarProdutos();

           Producto producto3=new Producto();
           producto3.mostrarProdutos();

           Producto producto4= new Producto(4,"Zanella... zzz");
           producto4.mostrarProdutos();
           Producto producto5=new Producto(5, "Yamaha YY", 250000, 5 );
           producto5.mostrarProdutos();
    }



}