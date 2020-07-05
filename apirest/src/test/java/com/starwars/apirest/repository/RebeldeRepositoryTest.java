package com.starwars.apirest.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.starwars.apirest.models.Rebelde;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RebeldeRepositoryTest {

	@Autowired
	private RebeldeRepository repository;

	@Test
	public void testaGetRebdeldeById() {
		Rebelde rebeldes = this.repository.findById(9);
		assertEquals(rebeldes.getNome(), "teste01");
	}

	@Test
	public void findAllRebeldeByTraidor() {
		List<Rebelde> rebeldes = this.repository.findRebeldeByTraicao(false);
		assertEquals(2, rebeldes.size());
	}

}
