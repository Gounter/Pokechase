DROP TABLE pokemonLocation;
DROP TABLE pokemon;

CREATE TABLE pokemon(
  id SERIAL PRIMARY KEY,
  number INTEGER NOT NULL,
  name TEXT NOT NULL,
  UNIQUE (number)
);

CREATE TABLE pokemonLocation(
  id SERIAL PRIMARY KEY,
  pokemonId INTEGER REFERENCES pokemon(id) NOT NULL,
  lastSeen DATE NOT NULL,
  coord GEOMETRY(POINT, 4326) NOT NULL
)

en haut, postgres en bas mysql

CREATE TABLE pokemon(
  ID int NOT NULL AUTO_INCREMENT,
  Number int NOT NULL,
  Name varchar(50) NOT NULL,
  PRIMARY KEY(ID),
  UNIQUE (Number)
);

CREATE TABLE pokemonLocation(
  ID int NOT NULL AUTO_INCREMENT,
  pokemonId int NOT NULL,
  lastSeen TIMESTAMP NOT NULL,
  PRIMARY KEY(ID),
  FOREIGN KEY (pokemonId) REFERENCES pokemon(ID)
);