package com.coderhouse.cantonnet.facturacion.service;

import com.coderhouse.cantonnet.facturacion.model.Transaccion;

import java.util.List;

public interface TransaccionService {

    List<Transaccion> buscarTodasLasTransacciones();
}
