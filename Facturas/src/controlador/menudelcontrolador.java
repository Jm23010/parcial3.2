package controlador;

import Presentacion.Facturacion;
import modelo.Cliente;
import modelo.Factura;
import modelo.ItemFactura;
import modelo.Producto;

public class menudelcontrolador {

    public String index() {
        return "index";
    }

    public String submit(String nombre,
                         String nrc) {
        // Crear una instancia de Cliente y setear sus atributos
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setNrc(nrc);

        // Crear una instancia de Factura y setear su cliente
        Factura factura = new Factura("Descripción de la factura", cliente);

        // Agregar algunos items de ejemplo
        Producto producto1 = new Producto();
        producto1.setNombre("Producto 1");
        producto1.setPrecio(10.0f);

        Producto producto2 = new Producto();
        producto2.setNombre("Producto 2");
        producto2.setPrecio(20.0f);

        ItemFactura item1 = new ItemFactura(2, producto1);
        ItemFactura item2 = new ItemFactura(3, producto2);

        factura.addItemFactura(item1);
        factura.addItemFactura(item2);

        // Añadir el objeto Cliente y Factura al modelo
        model.addAttribute("cliente", cliente);
        model.addAttribute("factura", factura);

        return "result"; // Retornar la vista "result"
    }
}
