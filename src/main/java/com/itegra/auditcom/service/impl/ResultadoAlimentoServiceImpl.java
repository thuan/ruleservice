package com.itegra.auditcom.service.impl;

import com.itegra.auditcom.domain.AlimentoAcordanteEntrada;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import com.itegra.auditcom.service.ResultadoAlimentoService;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoAlimentoServiceImpl implements ResultadoAlimentoService {

    private final Logger log = LoggerFactory.getLogger(ResultadoAlimentoServiceImpl.class);

    private final KieContainer kieContainer;

    @Autowired
    public ResultadoAlimentoServiceImpl(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @Override
    public ResultadoAlimentoAcordanteEntrada result(AlimentoAcordanteEntrada ali, ResultadoAlimentoAcordanteEntrada res) {
        KieSession kieSession = kieContainer.newKieSession();
        log.info("init kieSession");
        kieSession.insert(ali);
        kieSession.insert(res);
        kieSession.fireAllRules();
        kieSession.dispose();
        return res;
    }
}
