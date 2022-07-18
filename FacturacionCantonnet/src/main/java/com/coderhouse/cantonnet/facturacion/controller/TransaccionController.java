package com.coderhouse.cantonnet.facturacion.controller;
import com.coderhouse.cantonnet.facturacion.model.Transaccion;
import com.coderhouse.cantonnet.facturacion.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Transacciones")
public class TransaccionController {

    @Autowired
    private TransaccionService transaccionService;

    @GetMapping("")
    public List<Transaccion> buscarTodasLasTransacciones(){return transaccionService.buscarTodasLasTransacciones();}
}
