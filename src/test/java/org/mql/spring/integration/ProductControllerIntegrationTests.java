package org.mql.spring.integration;


import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.mql.spring.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(classes = Application.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class ProductControllerIntegrationTests {
	
	  @LocalServerPort
	  private int port; 
	  
	  @Autowired
	  private TestRestTemplate restTemplate;
	  
	  @Test
	  public void testAllProducts() 
	  {
	    assertEquals(this.restTemplate
				         .getForObject("http://localhost:" + port + "/allProducts", List.class)
				         .size() ,  4);
	  }
	 
	 
	
}
