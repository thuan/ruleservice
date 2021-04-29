package com.itegra.auditcom.web.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.itegra.auditcom.IntegrationTest;
import com.itegra.auditcom.service.ResultadoAlimentoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Test class for the ResultadoAlimentoResource REST controller.
 *
 * @see ResultadoAlimentoResource
 */
@IntegrationTest
class ResultadoAlimentoResourceIT {

    private MockMvc restMockMvc;

    @Autowired
    private ResultadoAlimentoService resultadoAlimentoService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        ResultadoAlimentoResource resultadoAlimentoResource = new ResultadoAlimentoResource(resultadoAlimentoService);
        restMockMvc = MockMvcBuilders.standaloneSetup(resultadoAlimentoResource).build();
    }

    /**
     * Test getResultByAlimento
     */
    @Test
    void testGetResultByAlimento() throws Exception {
        restMockMvc.perform(get("/api/resultado-alimento/get-result-by-alimento")).andExpect(status().isOk());
    }
}
