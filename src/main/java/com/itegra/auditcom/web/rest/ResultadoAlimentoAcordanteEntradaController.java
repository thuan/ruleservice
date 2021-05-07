package com.itegra.auditcom.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import com.itegra.auditcom.service.ResultadoAlimentoAcordanteEntradaService;

@RestController
@RequestMapping("/api/alimento-acordante-entrada")
public class ResultadoAlimentoAcordanteEntradaController {

	@Autowired
	private ResultadoAlimentoAcordanteEntradaService resultadoAlimentoAcordanteEntradaService;

	@GetMapping(value = "/resultado")
	public ResponseEntity<List<ResultadoAlimentoAcordanteEntrada>> listarTodos() {
		return ResponseEntity.ok(resultadoAlimentoAcordanteEntradaService.listarTodos());
	}
}
