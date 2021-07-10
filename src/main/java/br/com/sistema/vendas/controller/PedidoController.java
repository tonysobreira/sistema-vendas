package br.com.sistema.vendas.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sistema.vendas.model.Pedido;
import br.com.sistema.vendas.repository.PedidoRepository;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

	private final PedidoRepository pedidoRepository;

	public PedidoController(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	@PostMapping(value = "/salvar")
	public ResponseEntity<Pedido> save(@RequestBody Pedido pedido) {

		if (pedido.getId() == null || pedido.getId().isEmpty()) {
			pedido.setId(UUID.randomUUID().toString());
		}

		return ResponseEntity.ok(pedidoRepository.save(pedido));
	}

	@GetMapping
	public ResponseEntity<List<Pedido>> findAll() {
		return ResponseEntity.ok(pedidoRepository.findAll());
	}

}
