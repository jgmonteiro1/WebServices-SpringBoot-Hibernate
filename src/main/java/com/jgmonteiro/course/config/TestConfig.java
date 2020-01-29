package com.jgmonteiro.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jgmonteiro.course.entities.Order;
import com.jgmonteiro.course.entities.User;
import com.jgmonteiro.course.entities.enums.OrderStatus;
import com.jgmonteiro.course.repositories.OrderRepository;
import com.jgmonteiro.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository; 
	
	@Autowired
	private OrderRepository orderRepository;
	
	//Tudo que for colocado nesse método será executado quando a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {
		//Nulo no ID porque será gerado pelo BD
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmai.com", "977777777", "654321");
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1 );
		Order o2 = new Order(null, Instant.parse("2019-06-20T19:55:12Z"), OrderStatus.WAITING_PAYMENT, u1);
		Order o3 = new Order(null, Instant.parse("2019-06-21T18:32:45Z"), OrderStatus.WAITING_PAYMENT, u2);

		//Para salvar no Banco de Dados chama o UserRepository, que é o repository e acessa os dados
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
	
}
