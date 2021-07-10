package br.com.sistema.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.vendas.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
