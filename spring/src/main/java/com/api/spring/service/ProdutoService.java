package com.api.spring.service;

import com.api.spring.model.Produto;
import com.api.spring.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    public Produto getProdutoById(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto saveProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto updateProduto(Long id, Produto produtoDetalhes) {
        Produto produto = produtoRepository.findById(id).orElse(null);
        if (produto != null) {
            produto.setNome(produtoDetalhes.getNome());
            produto.setDescricao(produtoDetalhes.getDescricao());
            produto.setPreco(produtoDetalhes.getPreco());
            return produtoRepository.save(produto);
        }
        return null;
    }

    public void deleteProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
