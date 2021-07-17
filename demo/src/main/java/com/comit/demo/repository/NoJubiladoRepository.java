package com.comit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comit.demo.modelo.NoJubilado;

@Repository
public interface NoJubiladoRepository extends JpaRepository<NoJubilado, Long> {

}
