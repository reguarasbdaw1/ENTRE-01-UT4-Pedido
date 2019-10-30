
/**
 *  Describe una línea de un pedido
 *  En una línea de pedido se incluye un producto
 *  y el nº de unidades compradas de ese producto
 *   
 */
public class LineaPedido
{
    private Producto producto;
    private int cantidad;
     

    /**
     * Constructor  
     */
    public LineaPedido(Producto producto,int cantidad)
    {
     this.producto = producto;
     this.cantidad = cantidad;
        
    }

     /**
     * accesor para el producto
     */
    public Producto getProducto() 
    {
      return producto;   
    }

    /**
     * accesor para la cantidad de producto
     */
    public int getCantidad() {
        return cantidad;
    }
    
    /**
     * obtiene una nueva línea de pedido copia idéntica de la actual
     */
    public LineaPedido obtenerCopia() 
    {
         return new LineaPedido(producto,cantidad);
    }
     /**
     * Representación textual de la línea de pedido
     * (ver enunciado)
     */
    public String toString() 
    {
        String str = String.format("");
        return str;
    }
}
