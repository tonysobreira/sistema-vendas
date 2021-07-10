package br.com.sistema.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.vendas.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
