package com.itegra.auditcom.web.rest;

import com.itegra.auditcom.domain.AlimentoAcordanteEntrada;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import com.itegra.auditcom.service.TipoProdutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * TipoProdutoResource controller
 */
@RestController
@RequestMapping("/api/tipo-produto")
public class TipoProdutoResource {

    private final Logger log = LoggerFactory.getLogger(TipoProdutoResource.class);

    private TipoProdutoService tipoProdutoService;

    @Autowired
    public TipoProdutoResource(TipoProdutoService tipoProdutoService) {
        this.tipoProdutoService = tipoProdutoService;
    }

    /**
     * GET resultado
     */
    @GetMapping(value = "/resultado", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<ResultadoAlimentoAcordanteEntrada> resultado(@Valid AlimentoAcordanteEntrada entrada) {
        log.info(">>> get resultado");
        ResultadoAlimentoAcordanteEntrada resultado = new ResultadoAlimentoAcordanteEntrada();
        return new ResponseEntity<>(tipoProdutoService.resultado(entrada, resultado), HttpStatus.OK);
    }
}
