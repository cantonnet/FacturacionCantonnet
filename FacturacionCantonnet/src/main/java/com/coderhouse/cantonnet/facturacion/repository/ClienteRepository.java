package com.coderhouse.cantonnet.facturacion.repository;

import com.coderhouse.cantonnet.facturacion.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
