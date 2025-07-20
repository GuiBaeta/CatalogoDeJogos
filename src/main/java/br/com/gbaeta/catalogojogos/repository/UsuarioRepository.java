package br.com.gbaeta.catalogojogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gbaeta.catalogojogos.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
