package com.itegra.auditcom.service;

import com.itegra.auditcom.domain.AlimentoAcordanteEntrada;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KieService {

    private final KieContainer kieContainer;

    @Autowired
    public KieService(KieContainer kieContainer) {
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
