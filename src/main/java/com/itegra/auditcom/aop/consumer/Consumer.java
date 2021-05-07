package com.itegra.auditcom.aop.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itegra.auditcom.config.MensagemConfig;
import com.itegra.auditcom.domain.ResultadoAlimentoAcordanteEntrada;
import com.itegra.auditcom.service.ResultadoAlimentoAcordanteEntradaService;

@Component
public class Consumer {

	@Autowired
	private ResultadoAlimentoAcordanteEntradaService alimentoAcordanteEntradaService;

	@RabbitListener(queues = MensagemConfig.QUEUE)
	public void add(ResultadoAlimentoAcordanteEntrada resultadoAlimentoAcordanteEntrada) {
		System.out.println(resultadoAlimentoAcordanteEntrada);
		alimentoAcordanteEntradaService.adicionar(resultadoAlimentoAcordanteEntrada);
	}
}
