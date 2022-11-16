# Projeto Locação de Produtos

O projeto de locação de produtos oferece uam forma de locação de produtos.


### 1. Banco de Dados:

* O projeto está utilizando o H2, que é um banco relacional embarcado e está configurado para rodar em memória apenas.
* Você pode acessar o banco pelo browser após executar a aplicação e ver as tabelas criadas, assim como seus conteúdos.
* Para isso, acesso o endereço [http://localhost:8081/h2console/](http://localhost:8081/h2console/) e forneça os seguintes dados:

```
	JDBC URL: jdbc:h2:mem:testdb
	User Name: sa
	Password: password
```

### 2. Testes:

* Os testes estão sendo executados quando a aplicação sobe e populando o banco de dados.
* O resultado pode ser visto no log do console.


### 3. Acesso:

* A aplicação está rodando na porta 8081 e pode ser acessada pelo endereço [http://localhost:8081/](http://localhost:8081/)
