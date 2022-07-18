package com.coderhouse.cantonnet.facturacion.service;

import com.coderhouse.cantonnet.facturacion.CDatos.Datos;
import com.coderhouse.cantonnet.facturacion.model.Cliente;

import java.util.List;

public interface ClienteService {

    //Datos buscarPorDni(int dni);
    Datos buscarPorID(int IDcliente);

    List<Cliente> buscarTodosLosClientes();

    List<Datos>ListarEdad();

}
