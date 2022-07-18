package com.coderhouse.cantonnet.facturacion.service;
import com.coderhouse.cantonnet.facturacion.model.Producto;
import java.util.List;

public interface ProductoService {

    List<Producto> buscarTodosLosProductos();

    Producto bproductoporID(int IDproducto);

}
