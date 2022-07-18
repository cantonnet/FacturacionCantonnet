package com.coderhouse.cantonnet.facturacion.service;
import com.coderhouse.cantonnet.facturacion.model.Transaccion;
import com.coderhouse.cantonnet.facturacion.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionServiceImpl implements TransaccionService {
    @Autowired
    private TransaccionRepository transaccionRepository;

    @Override
    public List<Transaccion> buscarTodasLasTransacciones() {return transaccionRepository.findAll();}
}
