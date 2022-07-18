package com.coderhouse.cantonnet.facturacion.repository;

import com.coderhouse.cantonnet.facturacion.model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion,Integer> {
}
