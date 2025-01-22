package com.alura.desafioforohub.forohub.domain.respuestas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.alura.desafioforohub.forohub.domain.foros.Foro;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
	 Page<Respuesta> findAllByForo(Foro foro, Pageable paginacion);
}
