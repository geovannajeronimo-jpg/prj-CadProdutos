package com.geovanna.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.geovanna.br.entities.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Long> {
}