# Projeto Java Web 17 com Spring Boot
>  Este projeto foi criado com base na aula do DevSuperior, as descrições explicação o passo a passo para implementação desde projeto

### Visão geral do sistema

Vamos construir um pequeno sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:

- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/dominio.png "Modelo conceitual")

### Desenvolvimento moderno: relacional -> objeto -> json

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/objetos.png "Objetos")

### Passos da aula

- Criar o projeto
- Implementar o modelo de domínio
- Mapeamento objeto-relacional com JPA
- Configurar o banco de dados H2
- Criar os endpoints da API REST

### Trechos de código para copiar

#### Configuração do Maven Resources Plugin

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version>
</plugin>
```

#### Configurações do banco de dados

```
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

#### Script SQL

```sql
INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');
```
