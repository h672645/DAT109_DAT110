SET search_path TO DAT109;

DROP TABLE IF EXISTS Bil;

CREATE TABLE Bil(
	regNr String PRIMARY KEY,
	merke String,
    model String,
    farge String,
    kategori String,
    ledig BOOLEAN 
);

INSERT INTO Bil (regNr, merke, model, farge, kategori, ledig) VALUES 
('ABC123', 'Toyota', 'Corolla', 'Blå', 'SUV', 1),
('DEF456', 'Ford', 'Focus', 'Rød', 'Sedan', 1),
('GHI789', 'Honda', 'Civic', 'Grønn', 'Sedan', 0),
('JKL012', 'Nissan', 'X-Trail', 'Svart', 'SUV', 1),
('MNO345', 'Volkswagen', 'Golf', 'Hvit', 'Sedan', 1),
('PQR678', 'Chevrolet', 'Camaro', 'Gul', 'Sport', 0),
('STU901', 'BMW', 'X5', 'Sølv', 'SUV', 1),
('VWX234', 'Mercedes-Benz', 'E-Klasse', 'Brun', 'Familie', 1),
('YZA567', 'Audi', 'A4', 'Grå', 'Sedan', 1),
('BCD890', 'Jeep', 'Wrangler', 'Oransje', 'SUV', 0),
('EFG123', 'Hyundai', 'Tucson', 'Rød', 'SUV', 1),
('HIJ456', 'Kia', 'Sorento', 'Blå', 'SUV', 0),
('LMN789', 'Volvo', 'XC90', 'Svart', 'SUV', 1),
('OPQ012', 'Subaru', 'Outback', 'Grønn', 'SUV', 1),
('RST345', 'Lexus', 'RX', 'Sølv', 'SUV', 0),
('UVW678', 'Mazda', 'CX-5', 'Blå', 'SUV', 1),
('XYZ901', 'Tesla', 'Model 3', 'Rød', 'Sedan', 1),
('BCD234', 'Land Rover', 'Range Rover', 'Svart', 'SUV', 0),
('EFG567', 'Jaguar', 'F-Type', 'Blå', 'Sport', 1),
('HIJ890', 'Porsche', '911', 'Svart', 'Sport', 1);

select *from Bil;