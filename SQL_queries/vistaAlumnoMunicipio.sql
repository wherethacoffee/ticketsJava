CREATE VIEW `alumnoMunicipio` AS
    SELECT 
        alumno.curp,
        alumno.nombre,
        alumno.paterno,
        alumno.materno,
        alumno.telefono,
        alumno.correo,
        alumno.nivel,
        alumno.asunto,
        municipio.nombre
    FROM
        alumno
            JOIN
        municipio ON alumno.municipio_idmunicipio = municipio.idmunicipio