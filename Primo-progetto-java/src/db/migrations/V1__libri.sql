CREATE TABLE libri (
    isbn   VARCHAR(20) PRIMARY KEY,
    titolo VARCHAR(200) NOT NULL,
    autore VARCHAR(120) NOT NULL,
    anno   INT
);