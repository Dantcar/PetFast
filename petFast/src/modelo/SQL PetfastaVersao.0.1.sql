-- select * from DAC.AERONAVE;
--DROP TABLE CLIENTE
--dia 15-09-2016
USE Petfast.DAC
GO
CREATE TABLE CLIENTE (
idCliente int not null, 
nome VARCHAR(60)not null,
nascimento VARCHAR(10)not null,
endereco VARCHAR(60)not null,
numero VARCHAR(30)not null,
bairro VARCHAR(60)not null,
cidade VARCHAR(60)not null,
uf VARCHAR(2)not null,
cep VARCHAR(10)not null,
email VARCHAR(60)not null,
telefone VARCHAR(20)not null,
RG VARCHAR(16)not null,
CPF VARCHAR(18)not null primary key
)
--go

-- DROP TABLE ENDCEP
--dia 15-09-2016
CREATE TABLE endcep(
idCep int not null,
endereco VARCHAR(60)not null,
complemento VARCHAR(60)not null,
bairro VARCHAR(60)not null,
cidade VARCHAR(60)not null,
uf VARCHAR(2)not null,
cep VARCHAR(8)not null primary key
)

-- DROP TABLE PAGAMENTO
--dia 15-09-2016
CREATE TABLE PAGAMENTO(
idPagamento int not null,
dataPagamento VARCHAR(10) not null,
nomePagador VARCHAR(60) not null,
rgPagador VARCHAR(18) not null,
cpfPagador VARCHAR(14)not null primary key,
vlTotal float,
formaPagamento VARCHAR(20)not null,
referenciaPagamento VARCHAR(20) not null
)

-- DROP TABLE USUARIO
--dia 15-09-2016
CREATE TABLE USUARIO (
LOGIN VARCHAR(30) NOT NULL, 
SENHA VARCHAR(12) NOT NULL, 
PODER DECIMAL(1) NOT NULL, 
PRIMARY KEY (LOGIN));



--tabela DAC.CLIENTE
--dia 15-09-2016
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (1, 'Mario Almeida', '15/11/1954', 'Largo do Pelourinho', '70', 'Pelourinho', 'Salvador', 'BA', '40026-280', 'baiano@uou.com', '(74)98523-6644', '55.555.555-5', '555.555.555-55');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (2, 'dfsdf', '18/05/2016', 'Rua Maviael Prudente de Souza', '343', 'Vila Mariana', 'São Paulo', 'SP', '04020-010', 'dfafads@gm.com', '(11)11111-1111', '11.111.111-1', '232.323.232-33');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (3, 'dfadsf', '17/05/2016', 'Rua Maviael Prudente de Souza', '', 'Vila Mariana', 'São Paulo', 'SP', '04020-010', 'dkfd@gmail.com', '(11)11111-1111', '11.111.111-1', '082.407.688-51');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (4, 'Daniella Maratz', '27/11/1995', 'Rua Senador Jaguaribe', '29', 'Moura Brasil', 'Fortaleza', 'CE', '60010-010', 'DaniCeara@uol.com', '(50)98989-8989', '22.222.222-2', '222.222.222-22');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (5, 'Mario Sergio', '06/08/1990', 'Rua Engenheiro Portela', '1000', 'Setor Central', 'Anápolis', 'GO', '75024-970', 'MarioSergio@gmail.com', '(11)03030-4050', '99.999.999-9', '999.999.999-90');
INSERT INTO DAC.CLIENTE (IDCLIENTE, NOME, NASCIMENTO, ENDERECO, NUMERO, BAIRRO, CIDADE, UF, CEP, EMAIL, TELEFONE, RG, CPF) 
	VALUES (6, 'Custódio Mesquita', '10/10/1960', 'Rua Leandro Dupré', '690', 'Vila Clementino', 'São Paulo', 'SP', '04025-010', 'Custodio@Globo.com', '(11)98585-6321', '12.345.678-9', '899.999.999-99');

--tabela DAC.USUARIO
--dia 16-09-2016
INSERT INTO DAC.USUARIO (LOGIN, SENHA, PODER) 
	VALUES ('Teste', '12345abc', 1);

--tabela DAC.USUARIO
-- dia 18-09-2016

UPDATE
DAC.USUARIO 
SET LOGIN = 'Teste',
    SENHA = '@12345abcDEF', 
    PODER = 1
WHERE LOGIN = 'Teste'

