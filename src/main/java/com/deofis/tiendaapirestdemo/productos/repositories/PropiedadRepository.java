package com.deofis.tiendaapirestdemo.productos.repositories;

import com.deofis.tiendaapirestdemo.productos.domain.PropiedadProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Deprecated
public interface PropiedadRepository extends JpaRepository<PropiedadProducto, Long> {

}
