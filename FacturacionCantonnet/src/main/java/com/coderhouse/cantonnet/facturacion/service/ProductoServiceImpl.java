package com.coderhouse.cantonnet.facturacion.service;

import com.coderhouse.cantonnet.facturacion.model.Producto;
import com.coderhouse.cantonnet.facturacion.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    Producto producto;
    @Override
    public List<Producto> buscarTodosLosProductos() {return productoRepository.findAll();}

    @Override
    public Producto bproductoporID(int IDproducto) {
        producto = productoRepository.findById(IDproducto).orElse(null);
        if (producto != null) {
            Producto muestroproducto = new Producto(producto.getIDproducto(), producto.getCodigo(), producto.getNombre(), producto.getDescripcion(), producto.getCantidad(), producto.getPrecio());
            return muestroproducto;
        }
        return null;
    }

}
