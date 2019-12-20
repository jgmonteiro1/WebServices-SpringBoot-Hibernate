package com.jgmonteiro.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jgmonteiro.course.entities.User;

//Classe responsável por disponibilizar um recurso WEB correspondente a classe USER.
//Classe que é um recurso web, que é implementado por um controlador REST.
@RestController
@RequestMapping(value="/users")
public class UserResource {
	//Método para retornar respostas de requisições webs
	//Anotação que indica que o método responde a requisição do tipo GET do HTTP
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "Maria@gmail.com", "9999999", "12345");
		//.ok retorna a resposta com sucesso no http, chama o .body para retornar o corpo da resposta e passar o usuário U que foi instanciado
		return ResponseEntity.ok(u);
	}
	
}
