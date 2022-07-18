package com.coderhouse.cantonnet.facturacion.controller;
import com.coderhouse.cantonnet.facturacion.model.Producto;
import com.coderhouse.cantonnet.facturacion.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public List<Producto> buscarTodosLosProductos(){return productoService.buscarTodosLosProductos();}
    @GetMapping("{IDproducto}")
    public Producto bproductoporID(@PathVariable int IDproducto){return productoService.bproductoporID(IDproducto);}

}
