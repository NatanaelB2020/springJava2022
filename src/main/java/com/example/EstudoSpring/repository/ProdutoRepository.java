package com.example.EstudoSpring.repository;


import com.example.EstudoSpring.entity.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
