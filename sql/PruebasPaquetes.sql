SET SERVEROUTPUT ON;
--********************************************************************************************************************
--********************************************************************************************************************
--********************************************************************************************************************
-------------------------------PRUEBAS DE LOS PACKETES CRUD--------------------------------------------
--********************************************************************************************************************
--*******************************************************************************************************************
--********************************************************************************************************************
--------------------------PRUEBAS------------------------------
EXEC CRUD_TBPLATO.SP_INSERTPLATO('Frijoles blancos',6);
EXEC CRUD_TBPLATO.SP_UPDATEPLATO(36,'Lentejas',6);
EXEC CRUD_TBPLATO.SP_DELETEPLATO(36);

DECLARE 
 A TBplato.nombre%type;
 B TBtipoPlato.nombre%type;
BEGIN 
   CRUD_TBPLATO.SP_READPLATO(2, A, B); 
    DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || A || ' TIPO: ' || B);
END; 

SELECT * FROM TBPLATO ORDER BY IDPLATO;
--------------------------PRUEBAS------------------------------
EXEC CRUD_TBINGREDIENTE.SP_INSERTINGREDIETE('Camote',4);
EXEC CRUD_TBINGREDIENTE.SP_UPDATEINGREDIENTE(41,'Yuca',6);
EXEC CRUD_TBINGREDIENTE.SP_DELETEINGREDIENTE(41);

DECLARE 
 A TBingrediente.nombre%type;
 B TBtipoIngrediente.nombre%type;
BEGIN 
   CRUD_TBINGREDIENTE.SP_READINGREDIENTE(1, A, B); 
    DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || A || ' TIPO: ' || B);
END; 

SELECT * FROM TBingrediente;
--------------------------PRUEBAS------------------------------
EXEC CRUD_TBTIPOS.SP_INSERTIPOINGRE('Postre');

SELECT MAX(idTipoIngrediente) FROM TBtipoIngrediente;

EXEC CRUD_TBTIPOS.SP_UPDATETIPOINGRE(8,'NoSaludable');
EXEC CRUD_TBTIPOS.SP_DELETETIPOINGRE(8);

DECLARE 
 A TBtipoIngrediente.nombre%type;
BEGIN 
   CRUD_TBTIPOS.SP_READTIPOINGRE(1, A); 
    DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || A );
END; 

SELECT * FROM TBtipoIngrediente;*/
-----------
EXEC CRUD_TBTIPOS.SP_INSERTIPOPLATO('Coffee');

SELECT MAX(idTipoPlato) FROM TBtipoPlato;

EXEC CRUD_TBTIPOS.SP_UPDATETIPOPLATO(7,'Cafe');
EXEC CRUD_TBTIPOS.SP_DELETETIPOPLATO(7);

DECLARE 
 A TBtipoPlato.nombre%type;
BEGIN 
   CRUD_TBTIPOS.SP_READTIPOPLATO(1, A); 
    DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || A );
END; 

SELECT * FROM TBtipoPlato;
--------------------------PRUEBAS------------------------------
EXEC CRUD_TBMENU.SP_INSERTMENU('Menu0');

SELECT MAX(idMENU) FROM TBMENU;

EXEC CRUD_TBMENU.SP_UPDATEMENU(8,'MenuH');
EXEC CRUD_TBMENU.SP_DELETEMENU(8);

DECLARE 
 A TBMENU.nombre%type;
BEGIN 
   CRUD_TBMENU.SP_READMENU(1, A); 
    DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || A );
END; 

SELECT * FROM TBMENU;
--------------------------PRUEBAS------------------------------
EXEC CRUD_TBPLATOINGREDIENTE.SP_INSERTPLATOINGREDIENTE(1,25);

SELECT MAX(IDPLATOINGREDIENTE) FROM TBPLATOINGREDIENTE;

EXEC CRUD_TBPLATOINGREDIENTE.SP_UPDATEPLATOINGREDIENTE(73,1,22);
EXEC CRUD_TBPLATOINGREDIENTE.SP_DELETEPLATOINGRE(73);

DECLARE 
 A TBPLATO.nombre%type;
 B TBINGREDIENTE.nombre%type;
BEGIN 
   CRUD_TBPLATOINGREDIENTE.SP_READPLATOINGREDIENTE(1, A, B); 
    DBMS_OUTPUT.PUT_LINE('NOMBRE PLATO: ' || A || ' NOMBRE INGREDIENTE: ' || B );
END; 

SELECT * FROM TBPLATOINGREDIENTE;
SELECT * FROM TBPLATO;
SELECT * FROM TBINGREDIENTE;

--------------------------PRUEBAS------------------------------
EXEC CRUD_TBMENUPLATO.SP_INSERTMENUPLATO(1,4);

SELECT MAX(IDMENUPLATO) FROM TBMENUPLATO;

EXEC CRUD_TBMENUPLATO.SP_UPDATEMENUPLATO(39,1,5);
EXEC CRUD_TBMENUPLATO.SP_DELETEMENUPLATO(39);

DECLARE 
 A TBPLATO.nombre%type;
 B TBMENU.nombre%type;
BEGIN 
   CRUD_TBMENUPLATO.SP_READMENUPLATO(1, A, B); 
    DBMS_OUTPUT.PUT_LINE('NOMBRE PLATO: ' || A || ' NOMBRE MENU: ' || B );
END; 

SELECT * FROM TBMENUPLATO;
SELECT * FROM TBPLATO;
SELECT * FROM TBMENU;

--------------------------PRUEBAS------------------------------
EXEC CRUD_PRINCIPAL.SP_INSERTNINO(304060606,'Cata','R','N',TO_DATE('2006-01-03', 'YYYY-MM-DD'));
EXEC CRUD_PRINCIPAL.SP_UPDATENINO(304060606,'Catalina','Robles','Nunez',TO_DATE('2006-01-03', 'YYYY-MM-DD'), TO_DATE('2022-01-03', 'YYYY-MM-DD'), null);
EXEC CRUD_PRINCIPAL.SP_DELETENINO(304060606);

DECLARE 
 A TBnino.nombreNino%type;
 B TBnino.primerApellidoNino%type;
 C TBnino.SEGUNDOApellidoNino%type;
 D DATE; 
 E DATE; 
 F DATE;                     
BEGIN 
    CRUD_PRINCIPAL.SP_READNINO(116789032, A, B,C,D,E,F); 
    DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || A || ' APELLIDO1: ' || B || ' APELLIDO2: ' || C || ' NACE: ' || D || ' INGRESO: ' || E || ' BAJA: ' || F);
END; 

SELECT * FROM TBNINO;
-----------------------------------------------

EXEC CRUD_PRINCIPAL.SP_INSERTAUTORIZADO(304060606,'Cata','R','N','Taras',89918356,'F');
EXEC CRUD_PRINCIPAL.SP_UPDATEAUTORIZADO(304060606,'CataLINA','ROBLES','NUNEZ','Taras',89918356,'F');
EXEC CRUD_PRINCIPAL.SP_DELETEAUTORIZADO(304060606);

DECLARE 
 A VARCHAR2(100);
 B TBAUTORIZADO.direccion%type;
 C number;
 D char;                
BEGIN 
    CRUD_PRINCIPAL.SP_READAUTORIZADO(102030405, A, B,C,D); 
    DBMS_OUTPUT.PUT_LINE('NOMBRE: ' || A || ' DIRECCION: ' || B || ' TELEFONO: ' || C || ' RESPONSABLE DE PAGO: ' || D);
END; 

SELECT * FROM TBAUTORIZADO;
----------------------

EXEC CRUD_PRINCIPAL.SP_INSERTRELACIONAUT(203450816,304050607,'ENCARGADO');
EXEC CRUD_PRINCIPAL.SP_UPDATERELACIONAUT(158,203450816,304050607,'AMISTAD');
EXEC CRUD_PRINCIPAL.SP_DELETERELACIONAUT(158);

DECLARE 
    A VARCHAR2(100);
    B VARCHAR2(100);
    C VARCHAR2(50);
    RCURSOR SYS_REFCURSOR;               
BEGIN 
    SP_READRELACIONAUT(203450816, RCURSOR);   
    LOOP
        FETCH RCURSOR INTO A, B, C;
        EXIT WHEN RCURSOR%NOTFOUND;  
        
        DBMS_OUTPUT.PUT_LINE('NOMBRE NINO: ' || A || ' NOMBRE AUTORIZADO: ' || B || ' RELACION: ' || C );
    END LOOP;
    CLOSE RCURSOR;
END;

SELECT * FROM TBRELACIONAUTORIZACION;
--------------------------PRUEBAS------------------------------
SET SERVEROUTPUT ON;
EXEC CRUD_TBALERGIA.SP_INSERTALERGIA(203450816,30);
EXEC CRUD_TBALERGIA.SP_UPDATEALERGIA(203450816,203450816, 29);

SELECT MAX(TBALERGIA) FROM TBMENUPLATO;

EXEC CRUD_TBALERGIA.SP_DELETEALERGIA(9);

DECLARE 
    A VARCHAR2(50);
    B VARCHAR2(50);
    C VARCHAR2(50);
    D NUMBER;
    E VARCHAR2(50);
    RCURSOR SYS_REFCURSOR;               
BEGIN 
    CRUD_TBALERGIA.SP_READALERGIA(116789032, RCURSOR); 
    LOOP
        FETCH RCURSOR INTO D, A, B, C, E;
        EXIT WHEN RCURSOR%NOTFOUND;  
        
        DBMS_OUTPUT.PUT_LINE('CEDULA NINO: ' || D || ' NOMBRE: ' || A || ' APELLIDO1: ' || B || ' APELLIDO2: ' || C || ' ALERGIA: ' || E);
    END LOOP;
    CLOSE RCURSOR;
END;

SELECT * FROM TBNINO;
SELECT * FROM TBALERGIA;

-------------------------------------------------------------------------PRUEBAS------------------------------
EXEC CRUD_CONSUMOPAGO.SP_INSERTCONSUMO(203450816,2,TO_DATE('2023-08-18', 'YYYY-MM-DD'));
EXEC CRUD_CONSUMOPAGO.SP_UPDATECONSUMO(36,203450816, 3, TO_DATE('2023-08-17', 'YYYY-MM-DD'));

SELECT MAX(IDCONSUMO) FROM TBCONSUMO;

EXEC CRUD_CONSUMOPAGO.SP_DELETECONSUMO(36);

DECLARE 
    A NUMBER;
    B VARCHAR2(50);
    C VARCHAR2(50);
    D VARCHAR2(50);
    E VARCHAR2(50);
    F DATE;
    RCURSOR SYS_REFCURSOR;               
BEGIN 
    CRUD_CONSUMOPAGO.SP_READCONSUMO(589876543, RCURSOR); 
    LOOP
        FETCH RCURSOR INTO A, B, C, D, E, F;
        EXIT WHEN RCURSOR%NOTFOUND;  
        
        DBMS_OUTPUT.PUT_LINE('CEDULA NINO: ' || A || ' NOMBRE: ' || B || ' APELLIDO1: ' || C || ' APELLIDO2: ' || D || ' MENU: ' || E || ' FECHA: ' || F);
    END LOOP;
    CLOSE RCURSOR;
END;

SELECT * FROM TBNINO;
SELECT * FROM TBCONSUMO;
SELECT * FROM TBMENU;
--------------------------PRUEBAS------------------------------
EXEC CRUD_CONSUMOPAGO.SP_INSERTPAGO(1260127329,69000,'CR3748420029552');
EXEC CRUD_CONSUMOPAGO.SP_UPDATEPAGO(70,1260127329, 68000,'CR3748420029552');

SELECT MAX(IDCONSUMO) FROM TBCONSUMO;

EXEC CRUD_CONSUMOPAGO.SP_DELETEPAGO(69);

DECLARE 
 A VARCHAR2(100);
 B NUMBER;
 C VARCHAR2(50);                  
BEGIN 
    CRUD_CONSUMOPAGO.SP_READPAGO(70, A, B,C); 
    DBMS_OUTPUT.PUT_LINE('NOMBRE AUTORIZADO: ' || A || ' MONTO: ' || B || ' CUENTA: ' || C );
END; 



SELECT * FROM TBAUTORIZADO;
SELECT * FROM TBPAGO;
SELECT * FROM TBMENU;

-----------------------------------------------