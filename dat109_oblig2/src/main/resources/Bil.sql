SET search_path TO Dat109;

DROP TABLE IF EXISTS Bil;

CREATE TABLE Bil(
	regNr String PRIMARY KEY,
	merke String,
    model String ,
    farge String,
    kategori String,
    ledig  boolean
);

INSERT INTO Bil (regNr,merke,model,farge,kategori,ledig)
VALUES
("DN12345","WV","Sedan","familiebil",true);
select *from Bil;



