package com.jgmonteiro.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jgmonteiro.course.entities.User;
import com.jgmonteiro.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository; 
	
	//Tudo que for colocado nesse método será executado quando a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {
		//Nulo no ID porque será gerado pelo BD
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmai.com", "977777777", "654321");
		
		//Para salvar no Banco de Dados chama o UserRepository, que é o repository e acessa os dados
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	
}
