package com.alura.desafioforohub.forohub.domain.foros;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

public record DatosCrearForo(@NotNull String titulo, @Future LocalDateTime fechaCreacion, @NotNull boolean estado,
		@NotNull String autor, @NotNull String curso) {
}
