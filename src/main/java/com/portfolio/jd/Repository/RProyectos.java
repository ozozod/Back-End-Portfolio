/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.jd.Repository;


import com.portfolio.jd.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ozo
 */
@Repository
public interface RProyectos extends JpaRepository<Proyectos, Integer> {
    public Optional<Proyectos> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
