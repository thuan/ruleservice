package com.itegra.auditcom.web.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itegra.auditcom.domain.AlimentoAcordanteEntrada;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import com.itegra.auditcom.service.KieService;

@RestController
@RequestMapping("/api/ruleservices/regiao")
public class DefinirRegiaoResource {

	private final KieService kieService;

	@Autowired
	public DefinirRegiaoResource(KieService kieService) {
		this.kieService = kieService;
	}

	@RequestMapping(value = "/resultado", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ResultadoAlimentoAcordanteEntrada getRegiao(@RequestParam(required = false) String ufEmitente,
			@RequestParam(required = false) String ufDestinatario) throws IOException {
		AlimentoAcordanteEntrada alimentoAcordanteEntrada = new AlimentoAcordanteEntrada(ufEmitente, ufDestinatario);
		ResultadoAlimentoAcordanteEntrada resultadoAlimentoAcordanteEntrada = new ResultadoAlimentoAcordanteEntrada();
		return kieService.resultado(alimentoAcordanteEntrada, resultadoAlimentoAcordanteEntrada);
	}
}
