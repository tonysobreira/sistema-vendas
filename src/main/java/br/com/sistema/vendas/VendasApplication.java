package br.com.sistema.vendas;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.sistema.vendas.model.Cliente;
import br.com.sistema.vendas.model.Produto;
import br.com.sistema.vendas.repository.ClienteRepository;
import br.com.sistema.vendas.repository.ProdutoRepository;

@SpringBootApplication
public class VendasApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cliente c1 = new Cliente();
		c1.setNome("Cliente1");
		c1.setEndereco("Rua 1");

		clienteRepository.save(c1);

		Produto p1 = new Produto();
		p1.setDescricao("Produto1");
		p1.setValor(new BigDecimal(1.99));

		Produto p2 = new Produto();
		p2.setDescricao("Produto1");
		p2.setValor(new BigDecimal(2.99));

		produtoRepository.saveAll(Arrays.asList(p1, p2));
	}

}
