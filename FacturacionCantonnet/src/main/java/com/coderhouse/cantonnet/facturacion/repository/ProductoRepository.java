package com.coderhouse.cantonnet.facturacion.repository;

import com.coderhouse.cantonnet.facturacion.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
