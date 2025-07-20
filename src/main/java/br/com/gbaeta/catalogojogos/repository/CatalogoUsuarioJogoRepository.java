package br.com.gbaeta.catalogojogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gbaeta.catalogojogos.entity.CatalogoUsuarioJogo;

public interface CatalogoUsuarioJogoRepository extends JpaRepository<CatalogoUsuarioJogo, Long>{

}
