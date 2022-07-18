package com.coderhouse.cantonnet.facturacion.controller;

import com.coderhouse.cantonnet.facturacion.CDatos.Datos;
import com.coderhouse.cantonnet.facturacion.model.Cliente;
import com.coderhouse.cantonnet.facturacion.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("")
    public List<Cliente> buscarTodosLosClientes(){return clienteService.buscarTodosLosClientes();}
    //@GetMapping("{dni}")
    //public Datos buscarPorDni(@PathVariable int dni) {return clienteService.buscarPorDni(dni);}
    @GetMapping("edad")
    public List<Datos>mostrarEdad(){return clienteService.ListarEdad();}
    @GetMapping("{IDcliente}")
    public Datos buscarPorID(@PathVariable int IDcliente) {return clienteService.buscarPorID(IDcliente);}

}
