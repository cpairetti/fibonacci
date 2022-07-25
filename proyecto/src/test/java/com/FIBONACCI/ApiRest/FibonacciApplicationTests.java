package com.FIBONACCI.ApiRest;

import org.junit.jupiter.api.Test;
import org.hamcrest.CoreMatchers;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.FIBONACCI.ApiRest.DAO.EstadisticaDAO;
import com.FIBONACCI.ApiRest.DAO.FuncionDAO;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest(classes = FibonacciApplicationTests.class)
@AutoConfigureMockMvc
class FibonacciApplicationTests {

	/*@Autowired
	private  EstadisticaDAO estadistica;
	
	@Autowired
	private  FuncionDAO funcion;*/

	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	void test() throws Exception{
		

		ResultActions response = mockMvc.perform(MockMvcRequestBuilders.get("/tamanio/2"));

		response.andExpect(MockMvcResultMatchers.status().isOk());
		response.andExpect(MockMvcResultMatchers.content().string("1"));
		
	}

}
