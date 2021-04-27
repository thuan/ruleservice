package com.itegra.auditcom.service;

import com.itegra.auditcom.domain.AlimentoAcordanteEntrada;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;

public interface TipoProdutoService {

    ResultadoAlimentoAcordanteEntrada resultado(AlimentoAcordanteEntrada ali, ResultadoAlimentoAcordanteEntrada res);
}
