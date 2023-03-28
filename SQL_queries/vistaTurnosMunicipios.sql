CREATE VIEW `turnos_municipio` AS
SELECT municipio.idmunicipio, municipio.nombre, COUNT(*) AS num_turnos
FROM municipio
JOIN municipio_has_turno ON municipio.idmunicipio = municipio_has_turno.municipio_idmunicipio
GROUP BY municipio.idmunicipio