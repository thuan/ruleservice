package com.itegra.auditcom.web.rest;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itegra.auditcom.domain.AlimentoAcordanteEntrada;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import com.itegra.auditcom.service.KieService;

@RestController
@RequestMapping("define-region")
public class DefineRegionResource {

	@Autowired
	private KieService kieService;

	@RequestMapping(value = "/resultado", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ResultadoAlimentoAcordanteEntrada getRegiao(@RequestParam(required = false) String ufEmitente,
			@RequestParam(required = false) String ufDestinatario,
			@RequestParam("percentualICMS") BigDecimal percentualICMS, @RequestParam(required = false) BigDecimal crt,
			@RequestParam(required = false) BigDecimal valorItem, @RequestParam BigDecimal valorIPI,
			@RequestParam(required = false) BigDecimal valorFrete,
			@RequestParam(required = false) BigDecimal valorSeguro, @RequestParam BigDecimal valorOutros,
			@RequestParam(required = false) BigDecimal cfop, @RequestParam(required = false) BigDecimal cnpjEmitente,
			@RequestParam BigDecimal cnpjDestinatario, @RequestParam BigDecimal categoria,
			@RequestParam BigDecimal normaExecucao, @RequestParam BigDecimal cst) throws IOException {
		AlimentoAcordanteEntrada alimentoAcordanteEntrada = new AlimentoAcordanteEntrada(ufEmitente, ufDestinatario);
		ResultadoAlimentoAcordanteEntrada resultadoAlimentoAcordanteEntrada = new ResultadoAlimentoAcordanteEntrada();
		return kieService.resultado(alimentoAcordanteEntrada, resultadoAlimentoAcordanteEntrada);
	}
}
