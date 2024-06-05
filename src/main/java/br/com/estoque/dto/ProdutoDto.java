package br.com.estoque.dto;

import java.math.BigDecimal;
import java.util.Objects;

import br.com.estoque.model.Produto;

public class ProdutoDto {
    private Long cdProduto;
    private String descricao;
    private int qtd;
    private BigDecimal vlUnit;
    private BigDecimal vlcompra;
    private BigDecimal vlVenda;

    

    public ProdutoDto() {
    }

    public ProdutoDto( Produto p) {
        this.cdProduto = p.getCdProduto();
        this.descricao = p.getDescricao();
        this.qtd = p.getQtd();
        this.vlUnit = p.getVlUnit();
        this.vlcompra = p.getVlcompra();
        this.vlVenda = p.getVlVenda();
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

    public ProdutoDto cdProduto(Long cdProduto) {
        setCdProduto(cdProduto);
        return this;
    }

    public ProdutoDto descricao(String descricao) {
        setDescricao(descricao);
        return this;
    }

    public ProdutoDto qtd(int qtd) {
        setQtd(qtd);
        return this;
    }

    public ProdutoDto vlUnit(BigDecimal vlUnit) {
        setVlUnit(vlUnit);
        return this;
    }

    public ProdutoDto vlcompra(BigDecimal vlcompra) {
        setVlcompra(vlcompra);
        return this;
    }

    public ProdutoDto vlVenda(BigDecimal vlVenda) {
        setVlVenda(vlVenda);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProdutoDto)) {
            return false;
        }
        ProdutoDto produtoDto = (ProdutoDto) o;
        return Objects.equals(cdProduto, produtoDto.cdProduto) && Objects.equals(descricao, produtoDto.descricao) && qtd == produtoDto.qtd && Objects.equals(vlUnit, produtoDto.vlUnit) && Objects.equals(vlcompra, produtoDto.vlcompra) && Objects.equals(vlVenda, produtoDto.vlVenda);
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
