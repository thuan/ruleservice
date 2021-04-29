package com.itegra.auditcom.service;

import com.itegra.auditcom.domain.AlimentoAcordanteEntrada;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;

public interface ResultadoAlimentoService {
    ResultadoAlimentoAcordanteEntrada result(AlimentoAcordanteEntrada ali, ResultadoAlimentoAcordanteEntrada res);
}
