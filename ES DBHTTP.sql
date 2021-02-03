DROP DATABASE IF EXISTS DB_HTTP;
CREATE DATABASE DB_HTTP;
USE DB_HTTP;

CREATE TABLE IF NOT EXISTS Calciatori (
	Nome VARCHAR(45),
    Cognome VARCHAR(45)
);

INSERT INTO Calciatori (Nome, Cognome)
VALUES 
	("German", "Pezzella"),
    ("Patrick", "Cutrone"),
	("Jack", "Bonaventura"),
    ("Borja", "Valero"),
    ("Gaetano", "Castrovilli"),
    ("Antonio", "Barreca"),
    ("Frank", "Ribery"),
    ("Cristiano", "Biraghi"),
    ("Martin", "Caceres"),
    ("Nikola", "Milenkovic");