--Este solo sirve como ejemplo de inserción

INSERT INTO alumno (curp, nombre, paterno, materno, telefono, correo, nivel, asunto, turno, idmunicipio)
SELECT 'PER9832O0DX', 'Juan', 'Perez', 'Lopez', '555-555-55', 'juan.perez@example.com',
'secundaria', 'salto de la carrera', (SELECT IFNULL(MAX(turno), 0) + 1 FROM alumno WHERE idmunicipio = 15), 15;