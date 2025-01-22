package com.alura.desafioforohub.forohub.domain.usuarios;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarUsuario(@NotNull Long id, String usuario, String clave) {
}
