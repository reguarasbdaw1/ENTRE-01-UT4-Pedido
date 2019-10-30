

/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;

    /**
     * Constructor  
     */
    public Pedido(Fecha fecha,Cliente cliente,LineaPedido linea1,LineaPedido linea2)  
    {
      this.fecha = fecha;
      this.cliente = cliente;
      this.linea1 = linea1;
      this.linea2 = linea2;
    }

    /**
     * accesor para la fecha del pedido
     */
    public Fecha getFecha() 
    {
         return fecha;
    }

    /**
     * accesor para el cliente
     */
    public Cliente getCliente()
    {
         return cliente;
    }
    
    
    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public double getImporteAntesIva() 
    {
        Producto producto = linea1.getProducto();
        Producto producto2 = linea2.getProducto();
        double precio = producto.getPrecio();
        double precio2 = producto2.getPrecio();
        double total = precio + precio2;
        return total;
            
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double getIva()
    {
          double elIVA = getImporteAntesIva()* IVA;
          return elIVA;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double getImporteTotal() 
    {
         return getIva() + getImporteAntesIva();
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString()
    {
        String str  = String.format("DATOS DEL CLIENTE", cliente.toString());
        return str;
    }
    
    
    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public boolean masAntiguoQue(Pedido otro) 
    {
          return fecha.antesQue(fecha);
    }
    
     /**
     * devuelve una referencia al pedido actual
     */
    public  Pedido getPedidoActual() 
    {
        
    }

}
