package com.alura.desafioforohub.forohub.domain.respuestas;

public record DatosRespuesta(Long id, String contenido, Long idTopico) {

	public DatosRespuesta(Respuesta respuesta) {
		this(respuesta.getId(), respuesta.getContenido(), respuesta.getForo().getId());
	}
}