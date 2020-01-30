package com.jgmonteiro.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jgmonteiro.course.entities.Category;
import com.jgmonteiro.course.entities.Order;
import com.jgmonteiro.course.entities.Product;
import com.jgmonteiro.course.entities.User;
import com.jgmonteiro.course.entities.enums.OrderStatus;
import com.jgmonteiro.course.repositories.CategoryRepository;
import com.jgmonteiro.course.repositories.OrderRepository;
import com.jgmonteiro.course.repositories.ProductRepository;
import com.jgmonteiro.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository; 
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	//Tudo que for colocado nesse método será executado quando a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Eletronic");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
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
