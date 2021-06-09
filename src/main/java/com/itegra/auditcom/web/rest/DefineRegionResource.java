package com.itegra.auditcom.web.rest;

import com.itegra.auditcom.domain.AlimentoAcordanteEntrada;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import com.itegra.auditcom.service.KieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/define-region")
public class DefineRegionResource {

    @Autowired
    private KieService kieService;

    @RequestMapping(value = "/resultado", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ResultadoAlimentoAcordanteEntrada getRegiao(@RequestBody AlimentoAcordanteEntrada alimentoAcordanteEntrada) {
        ResultadoAlimentoAcordanteEntrada resultadoAlimentoAcordanteEntrada = new ResultadoAlimentoAcordanteEntrada();
        return kieService.resultado(alimentoAcordanteEntrada, resultadoAlimentoAcordanteEntrada);
    }
}
