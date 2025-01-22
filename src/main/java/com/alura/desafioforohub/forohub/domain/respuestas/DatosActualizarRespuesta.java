package com.alura.desafioforohub.forohub.domain.respuestas;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarRespuesta(@NotNull Long id, @NotNull String contenido) {

}
