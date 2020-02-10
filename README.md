
# Projeto Webservices utilizando Springboot e JPA/Hibernate.

O projeto foi realizado como proposta de um curso ministrado pelo professor Nélio Alves(https://www.udemy.com/course/java-curso-completo/)

O projeto consiste num sistema de pedido, com o seguinte relacionamento entre suas entidades:
 
 ![DomainModel](https://user-images.githubusercontent.com/49801757/74161555-e0e2f200-4bfd-11ea-822b-565c802e20ac.png)
 

O deploy da aplicação foi feito no Heroku e pode ser acessado no link abaixo:
https://projeto-webservices-sb.herokuapp.com/

## Alguns dos endpoints que podem ser acessados:
1. https://projeto-webservices-sb.herokuapp.com/users
2. https://projeto-webservices-sb.herokuapp.com/orders
3. https://projeto-webservices-sb.herokuapp.com/products
4. https://projeto-webservices-sb.herokuapp.com/categories

## Você também pode acessar pelos id's dos objetos da seguinte maneira:
1. https://projeto-webservices-sb.herokuapp.com/orders/1 
2. https://projeto-webservices-sb.herokuapp.com/users/1
3. https://projeto-webservices-sb.herokuapp.com/products/1
4. https://projeto-webservices-sb.herokuapp.com/categories/1

Ao acessar um pedido pelo ID, ele trás pendurado todos os relacionamentos que ele possui, ele mostra o momento do pedido, o status do pagamento, as informações do cliente que realizou o pedido, os itens que constam no pedido(e a categoria desses intens), além do preço parcial, que é o método "subtotal", que leva em conta a quantidade de itens * o preço daquele item. E o preço total que é a soma dos subtotais.

## Você pode inserir um usuário !

Para inserir um usuário você pode utilizar o Postman||Insomnia e enviar em um método POST os dados do usuário da seguinte maneira:
{
	"name": "João",
	"email": "joao@gmail.com",
	"password": "123456",
	"phone": "888888"
}

##### Abaixo é mostrado como fica o sistema na prática:
![DomainInstance](https://user-images.githubusercontent.com/49801757/74162431-877bc280-4bff-11ea-96ef-d0ea96e15848.png)



## IMPORTANTE:
Vale ressaltar que a ideia do projeto era apenas a implementação de um webservices, então aspectos como interface gráfica e segurança não foram levados em conta/implementados.(Espero poder incrementar o projeto futuramente).

## Lista de coisas que eu PRETENDO fazer para deixar esse projeto mais maneiro:
- [X] Popular o banco de dados
- [] Criar uma interface gráfica
- [] Armazenar a senha em hash no banco de dados
- [] Controlar os acessos com token.

*Não necessariamente nessa ordem.
