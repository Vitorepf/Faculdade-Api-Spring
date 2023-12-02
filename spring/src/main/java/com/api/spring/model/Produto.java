package com.api.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa a entidade Produto.
 * Esta classe é usada para mapear produtos no banco de dados.
 */
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;

    /**
     * Obtém o ID do produto.
     * @return O ID do produto.
     */
    public Long getId() {
        return id;
    }

    /**
     * Obtém o nome do produto.
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém a descrição do produto.
     * @return A descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Obtém o preço do produto.
     * @return O preço do produto.
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Define o ID do produto.
     * @param id O ID do produto.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Define o nome do produto.
     * @param nome O nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define a descrição do produto.
     * @param descricao A descrição do produto.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Define o preço do produto.
     * @param preco O preço do produto.
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * Construtor padrão necessário para JPA.
     */
    public Produto() {
    }

    /**
     * Construtor para facilitar a criação de instâncias de Produto.
     * @param nome O nome do produto.
     * @param descricao A descrição do produto.
     * @param preco O preço do produto.
     */
    public Produto(String nome, String descricao, Double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * Retorna uma representação em String do produto.
     * @return String representando o produto.
     */
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
