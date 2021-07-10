package br.com.sistema.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.vendas.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
