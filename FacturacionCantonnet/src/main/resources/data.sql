INSERT INTO PRODUCTO(IDPRODUCTO,CODIGO,NOMBRE,DESCRIPCION,CANTIDAD,PRECIO)
VALUES
(1,77309222,'DANETTE','CHOCOLATE',60,79.99),
(2,75010111,'LAYS','STAX SABOR BARBACUE',25,119.50),
(3,77301970,'COCAOLA','SABOR ORIGINAL',50,160.50);

INSERT INTO CLIENTE(IDCLIENTE,DNI,NOMBRE,APELLIDO,FECHANACIMIENTO)
VALUES
(1,10100100,'Alejandro','Cantonnet','1991-07-16'),
(2,10100200,'Lucas','Garcia','1992-11-01'),
(3,10100300,'Marcos','Sastre','1985-07-24'),
(4,10100300,'sebastian','Sastre','1985-07-24'),
(5,10100400,'Marcelo','Pintos','1997-02-05');

INSERT INTO TRANSACCION(TRANSACCIONID,FECHA,MONTO,CLIENTEID)
VALUES
(1,'2022-07-18',400.50,1),
(2,'2022-07-17',1562,2);