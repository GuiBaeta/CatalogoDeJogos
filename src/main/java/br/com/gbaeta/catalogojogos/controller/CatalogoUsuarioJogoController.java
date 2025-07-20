package br.com.gbaeta.catalogojogos.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.gbaeta.catalogojogos.dto.CatalogoUsuarioJogoDTO;
import br.com.gbaeta.catalogojogos.entity.CatalogoUsuarioJogo;
import br.com.gbaeta.catalogojogos.entity.Jogo;
import br.com.gbaeta.catalogojogos.entity.Usuario;
import br.com.gbaeta.catalogojogos.repository.CatalogoUsuarioJogoRepository;
import br.com.gbaeta.catalogojogos.repository.JogoRepository;
import br.com.gbaeta.catalogojogos.repository.UsuarioRepository;

@RestController
@RequestMapping("/catalogo")
public class CatalogoUsuarioJogoController {

    private final CatalogoUsuarioJogoRepository catalogoRepo;
    private final UsuarioRepository usuarioRepo;
    private final JogoRepository    jogoRepo;

    public CatalogoUsuarioJogoController(CatalogoUsuarioJogoRepository catalogoRepo,
                                         UsuarioRepository usuarioRepo,
                                         JogoRepository jogoRepo) {
        this.catalogoRepo = catalogoRepo;
        this.usuarioRepo  = usuarioRepo;
        this.jogoRepo     = jogoRepo;
    }

    @PostMapping
    public ResponseEntity<CatalogoUsuarioJogo> salvar(@RequestBody CatalogoUsuarioJogoDTO dto) {

        /* Busca usuário e jogo pelos IDs recebidos */
        Usuario usuario = usuarioRepo.findById(dto.getIdUsuario())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado"));

        Jogo jogo = jogoRepo.findById(dto.getIdJogo())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Jogo não encontrado"));

        /* Constrói a entidade a partir do DTO */
        CatalogoUsuarioJogo entidade = new CatalogoUsuarioJogo();
        entidade.setUsuario(usuario);
        entidade.setJogo(jogo);
        entidade.setStatus(dto.getStatus());
        entidade.setNotaPessoal(dto.getNotaPessoal());
        entidade.setDataCompra(dto.getDataCompra());
        entidade.setPrecoPago(dto.getPrecoPago());
        CatalogoUsuarioJogo salvo = catalogoRepo.save(entidade);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @GetMapping
    public List<CatalogoUsuarioJogo> listar() {
        return catalogoRepo.findAll();
    }

}
