package com.alura.desafioforohub.forohub.domain.respuestas;

import jakarta.validation.constraints.NotNull;

public record DatosCrearRespuesta(@NotNull String contenido, @NotNull Long idForo ) {}
