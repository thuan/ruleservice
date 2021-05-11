package com.itegra.auditcom.web.rest;

import com.itegra.auditcom.domain.AlimentoAcordanteEntrada;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import com.itegra.auditcom.service.ResultadoAlimentoService;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ResultadoAlimentoResource controller
 */
@RestController
@RequestMapping("/api/resultado-alimento")
public class ResultadoAlimentoResource {

    private final Logger log = LoggerFactory.getLogger(ResultadoAlimentoResource.class);

    private final ResultadoAlimentoService resultadoAlimentoService;

    @Autowired
    public ResultadoAlimentoResource(ResultadoAlimentoService resultadoAlimentoService) {
        this.resultadoAlimentoService = resultadoAlimentoService;
    }

    /**
     * GET getResultByAlimento
     */
    @GetMapping(value = "/get-result-by-alimento", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultadoAlimentoAcordanteEntrada> getResultByAlimento(@Valid AlimentoAcordanteEntrada entrada) {
        log.info("getResultByAlimento");
        ResultadoAlimentoAcordanteEntrada resultado = new ResultadoAlimentoAcordanteEntrada();
        return new ResponseEntity<>(resultadoAlimentoService.result(entrada, resultado), HttpStatus.OK);
    }
}
