package com.deofis.tiendaapirestdemo.productos.repositories;

import com.deofis.tiendaapirestdemo.productos.domain.Subcategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubcategoriaRepository extends JpaRepository<Subcategoria, Long> {

    List<Subcategoria> findAllByNombreContainingIgnoringCase(String nombre);
}
