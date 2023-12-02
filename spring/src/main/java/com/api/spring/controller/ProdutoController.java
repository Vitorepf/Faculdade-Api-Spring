package com.api.spring.controller;

import com.api.spring.model.Produto;
import com.api.spring.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gerenciamento de produtos.
 * Fornece operações CRUD para trabalhar com a entidade Produto.
 */
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    /**
     * Obtém uma lista de todos os produtos.
     *
     * @return Lista de produtos.
     */
    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    /**
     * Obtém um produto específico pelo seu ID.
     *
     * @param id O ID do produto a ser buscado.
     * @return O produto encontrado ou null se não for encontrado.
     */
    @GetMapping("/{id}")
    public Produto getProdutoById(@PathVariable Long id) {
        return produtoService.getProdutoById(id);
    }

    /**
     * Cria um novo produto.
     *
     * @param produto Objeto Produto que contém os dados do produto a ser criado.
     * @return O produto recém-criado.
     */
    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoService.saveProduto(produto);
    }

    /**
     * Atualiza os dados de um produto existente.
     *
     * @param id O ID do produto a ser atualizado.
     * @param produto Objeto Produto com os dados atualizados.
     * @return O produto atualizado.
     */
    @PutMapping("/{id}")
    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.updateProduto(id, produto);
    }

    /**
     * Exclui um produto pelo seu ID.
     *
     * @param id O ID do produto a ser excluído.
     */
    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) {
        produtoService.deleteProduto(id);
    }
}
