package com.itegra.auditcom.web.rest;

import com.itegra.auditcom.domain.AlimentoAcordanteEntrada;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import com.itegra.auditcom.service.KieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ruleservices/simples")
public class SimplesNacionalResource {

    private final KieService kieService;

    @Autowired
    public SimplesNacionalResource(KieService kieService) {
        this.kieService = kieService;
    }

    @RequestMapping(value = "/resultado", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public ResultadoAlimentoAcordanteEntrada getSimplesNacional(
        @RequestParam(required = false) int crt,
        @RequestParam(required = false) double percentualICMS
    ) {
        AlimentoAcordanteEntrada alimentoAcordanteEntrada = new AlimentoAcordanteEntrada(crt, percentualICMS);
        ResultadoAlimentoAcordanteEntrada resultado = new ResultadoAlimentoAcordanteEntrada();
        return kieService.resultado(alimentoAcordanteEntrada, resultado);
    }
}
