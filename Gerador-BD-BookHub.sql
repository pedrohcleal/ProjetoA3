	select * from allusers;
	select * from clientusers;
	select * from livros;

	INSERT INTO allusers (Nome, Senha, Tipo_de_usuário) VALUES ('pedro','admin','admin');
    
	CREATE TABLE allusers (
		ID INT auto_increment PRIMARY KEY, 
		nome VARCHAR(50) NOT NULL,
		senha VARCHAR(50) NOT NULL,
		tipouser ENUM('admin', 'user') NOT NULL
	);
    
	CREATE TABLE allusers (
		ID INT auto_increment PRIMARY KEY, 
		Nome VARCHAR(50) NOT NULL,
		Senha VARCHAR(50) NOT NULL,
		Sexo VARCHAR(50),
		Idade VARCHAR(50),
		LP1 VARCHAR(50),
        LP2 VARCHAR(50),
        Tipo_de_usuário VARCHAR(50) NOT NULL
	);
    
	CREATE TABLE livros(
		iduser INT,
		titulo VARCHAR(50) NOT NULL, 
		autor VARCHAR(50) NOT NULL,
		tipo VARCHAR(50) NOT NULL,
		nota_cliente int
	);

	drop table clientusers;
	drop table allusers;
    drop table livros;