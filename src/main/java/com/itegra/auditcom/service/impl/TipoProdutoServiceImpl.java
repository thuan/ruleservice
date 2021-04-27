package com.itegra.auditcom.service.impl;

import com.itegra.auditcom.domain.AlimentoAcordanteEntrada;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import com.itegra.auditcom.service.TipoProdutoService;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProdutoServiceImpl implements TipoProdutoService {

    private final Logger log = LoggerFactory.getLogger(TipoProdutoServiceImpl.class);

    private final KieContainer kieContainer;

    @Autowired
    public TipoProdutoServiceImpl(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    public ResultadoAlimentoAcordanteEntrada resultado(
        AlimentoAcordanteEntrada alimentoAcordanteEntrada,
        ResultadoAlimentoAcordanteEntrada resultadoAlimentoAcordanteEntrada
    ) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(alimentoAcordanteEntrada);
        kieSession.insert(resultadoAlimentoAcordanteEntrada);
        kieSession.fireAllRules();
        kieSession.dispose();
        return resultadoAlimentoAcordanteEntrada;
    }
}
