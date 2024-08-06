package com.example.demoprojectREST;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoprojectRestApplicationTests {

	@Test
	void contextLoads() {
		int a= 500;
		int b= 500;
		assertEquals(a,b);
	}

}
