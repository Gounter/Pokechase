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
