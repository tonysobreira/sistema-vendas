package br.com.sistema.vendas.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistema.vendas.model.Cliente;
import br.com.sistema.vendas.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

	private final ClienteRepository clienteRepository;

	public ClienteController(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@PostMapping(value = "/salvar")
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente) {
		return ResponseEntity.ok(clienteRepository.save(cliente));
	}

	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		return ResponseEntity.ok(clienteRepository.findAll());
	}

}
