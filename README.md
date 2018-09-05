# prova_conceito
Prova conceito java

Olá,
Meu nome é Marcus.

As tecnologias utilizadas foram:

* Maven;
* Java 8;
* MySQL;
* Tomcat 9;
* JSF;
* PRIMEFACES;
* HIBERNATE.


Segue abaixo o script do banco para facilitar teste.

CREATE SCHEMA `conceito` ;

USE conceito;


CREATE TABLE cliente (
    id int NOT NULL AUTO_INCREMENT,
    razao_social varchar(200) NOT NULL,
    nome_fantasia varchar(100),
    cnpj_cpf varchar(20) NOT NULL,
    contato varchar(14),
    status_cliente varchar(20) NOT NULL,
    PRIMARY KEY (id)
);
