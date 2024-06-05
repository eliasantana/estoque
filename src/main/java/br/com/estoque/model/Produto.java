package br.com.estoque.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

import br.com.estoque.dto.ProdutoDto;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdProduto;
    private String descricao;
    private int qtd;
    private BigDecimal vlUnit;
    private BigDecimal vlcompra;
    private BigDecimal vlVenda;


    public Produto() {
    }

    public Produto( ProdutoDto dto) {
        this.cdProduto = dto.getCdProduto();
        this.descricao = dto.getDescricao();
        this.qtd = dto.getQtd();
        this.vlUnit = dto.getVlUnit();
        this.vlcompra = dto.getVlcompra();
        this.vlVenda = dto.getVlVenda();
    }

    public Long getCdProduto() {
        return this.cdProduto;
    }

    public void setCdProduto(Long cdProduto) {
        this.cdProduto = cdProduto;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return this.qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getVlUnit() {
        return this.vlUnit;
    }

    public void setVlUnit(BigDecimal vlUnit) {
        this.vlUnit = vlUnit;
    }

    public BigDecimal getVlcompra() {
        return this.vlcompra;
    }

    public void setVlcompra(BigDecimal vlcompra) {
        this.vlcompra = vlcompra;
    }

    public BigDecimal getVlVenda() {
        return this.vlVenda;
    }

    public void setVlVenda(BigDecimal vlVenda) {
        this.vlVenda = vlVenda;
    }

    public Produto cdProduto(Long cdProduto) {
        setCdProduto(cdProduto);
        return this;
    }

    public Produto descricao(String descricao) {
        setDescricao(descricao);
        return this;
    }

    public Produto qtd(int qtd) {
        setQtd(qtd);
        return this;
    }

    public Produto vlUnit(BigDecimal vlUnit) {
        setVlUnit(vlUnit);
        return this;
    }

    public Produto vlcompra(BigDecimal vlcompra) {
        setVlcompra(vlcompra);
        return this;
    }

    public Produto vlVenda(BigDecimal vlVenda) {
        setVlVenda(vlVenda);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto produto = (Produto) o;
        return Objects.equals(cdProduto, produto.cdProduto) && Objects.equals(descricao, produto.descricao) && qtd == produto.qtd && Objects.equals(vlUnit, produto.vlUnit) && Objects.equals(vlcompra, produto.vlcompra) && Objects.equals(vlVenda, produto.vlVenda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdProduto, descricao, qtd, vlUnit, vlcompra, vlVenda);
    }

    @Override
    public String toString() {
        return "{" +
            " cdProduto='" + getCdProduto() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", qtd='" + getQtd() + "'" +
            ", vlUnit='" + getVlUnit() + "'" +
            ", vlcompra='" + getVlcompra() + "'" +
            ", vlVenda='" + getVlVenda() + "'" +
            "}";
    }

    
}
