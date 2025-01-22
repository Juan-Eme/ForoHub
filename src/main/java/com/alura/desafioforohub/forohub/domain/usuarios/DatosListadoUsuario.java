package com.alura.desafioforohub.forohub.domain.usuarios;

public record DatosListadoUsuario(Long id, String usuario) {
	public DatosListadoUsuario(Usuario usuario) {
		this(usuario.getId(), usuario.getUsuario());
	}
}
