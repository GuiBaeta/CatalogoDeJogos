package br.com.gbaeta.catalogojogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gbaeta.catalogojogos.entity.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {

}
