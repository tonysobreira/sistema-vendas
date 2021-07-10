package br.com.sistema.vendas.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistema.vendas.model.Produto;
import br.com.sistema.vendas.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

	private final ProdutoRepository produtoRepository;

	public ProdutoController(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	@PostMapping(value = "/salvar")
	public ResponseEntity<Produto> save(@RequestBody Produto produto) {
		return ResponseEntity.ok(produtoRepository.save(produto));
	}

	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		return ResponseEntity.ok(produtoRepository.findAll());
	}

}
