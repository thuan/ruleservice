package com.itegra.auditcom.web.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.itegra.auditcom.IntegrationTest;
import com.itegra.auditcom.service.TipoProdutoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Test class for the TipoProdutoResource REST controller.
 *
 * @see TipoProdutoResource
 */
@IntegrationTest
class TipoProdutoResourceIT {

    private MockMvc restMockMvc;

    private TipoProdutoService tipoProdutoService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        TipoProdutoResource tipoProdutoResource = new TipoProdutoResource(tipoProdutoService);
        restMockMvc = MockMvcBuilders.standaloneSetup(tipoProdutoResource).build();
    }

    /**
     * Test resultado
     */
    @Test
    void testResultado() throws Exception {
        restMockMvc.perform(get("/api/tipo-produto/resultado")).andExpect(status().isOk());
    }
}
