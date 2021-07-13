package com.bookstore;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBookStore2ApplicationTests {

	@Test
	void contextLoads() {
		String str= "I am done with Junit setup";
	      assertEquals("I am done with Junit setup",str);
	}

}
