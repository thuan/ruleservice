package com.itegra.auditcom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;

@Repository
public interface ResultadoAlimentoAcordanteEntradaRepository
		extends JpaRepository<ResultadoAlimentoAcordanteEntrada, Long> {

}
