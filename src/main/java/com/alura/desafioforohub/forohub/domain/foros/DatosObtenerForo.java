package com.alura.desafioforohub.forohub.domain.foros;

import org.springframework.data.domain.Page;

import com.alura.desafioforohub.forohub.domain.respuestas.DatosRespuesta;

public record DatosObtenerForo(DatosListarForo foro, Page<DatosRespuesta> respuestas){
	
}
