package br.com.mrl.api.security.services;

import java.util.Optional;

import br.com.mrl.api.security.entities.Usuario;

public interface UsuarioService {

	/**
	 * Busca e retorna um usuário dado um email.
	 * @param email
	 * @return
	 */
	Optional<Usuario> buscaPorEmail(String email);
	
}
