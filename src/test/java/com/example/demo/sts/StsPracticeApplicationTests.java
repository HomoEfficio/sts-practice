package com.example.demo.sts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StsPracticeApplicationTests {

	@Autowired
	private AlgebraService algebraService;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void albebra_subtract_3_1() throws Exception {
		assertThat(algebraService.subtract(3, 1)).isEqualTo(2);
	}

}
