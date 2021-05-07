package com.itegra.auditcom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import com.itegra.auditcom.repository.ResultadoAlimentoAcordanteEntradaRepository;

@Service
public class ResultadoAlimentoAcordanteEntradaService {

	@Autowired
	private ResultadoAlimentoAcordanteEntradaRepository resultadoAlimentoAcordanteEntradaRepository;

	public ResultadoAlimentoAcordanteEntrada adicionar(ResultadoAlimentoAcordanteEntrada resultadoAlimentoAcordanteEntrada) {
		resultadoAlimentoAcordanteEntradaRepository.save(resultadoAlimentoAcordanteEntrada);
		return resultadoAlimentoAcordanteEntrada;
	}

	public List<ResultadoAlimentoAcordanteEntrada> listarTodos() {
		return resultadoAlimentoAcordanteEntradaRepository.findAll();
	}

}
