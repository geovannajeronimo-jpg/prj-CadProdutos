package com.geovanna.br.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.geovanna.br.entities.Produto;
import com.geovanna.br.repository.ProdutosRepository;

@Service
public class ProdutoService {

    private final ProdutosRepository repository;

    public ProdutoService(ProdutosRepository repository) {
        this.repository = repository;
    }

    public Produto saveProduto(Produto produto) {
    	return repository.save(produto);
    }

    public Produto getProdutoById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Produto> getAllProdutos() {
        return repository.findAll();
    }

    public void deleteProduto(Long id) {
        repository.deleteById(id);
    }
}