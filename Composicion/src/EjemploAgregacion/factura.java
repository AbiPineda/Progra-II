/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploAgregacion;

/**
 *
 * @author Abigail
 */
public class factura 
{
    private cliente clientesito;
    private producto productos;
    private float total;

    public factura(cliente clientesito, producto productos, float total) {
        this.clientesito = clientesito;
        this.productos = productos;
        this.total = total;
    }

    public cliente getClientesito() {
        return clientesito;
    }

    public void setClientesito(cliente clientesito) {
        this.clientesito = clientesito;
    }

    public producto getProductos() {
        return productos;
    }

    public void setProductos(producto productos) {
        this.productos = productos;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    // metodo mostrar datos de factura:
     public void mostrar() {
       
        System.out.printf("Cliente: \n");
        System.out.printf("Codigo: %d Nombre: %s \n",
                clientesito.getCodigo(), clientesito.getNombre());
        System.out.printf("Productos: %d Descripción: %s Precio: %f \n", productos.getCodigo(), productos.getDescripcion(), productos.getPrecio());
     }
    
    
}
