package br.com.estoque.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.estoque.model.Produto;
import br.com.estoque.projection.ProdutoProjection;

@Repository
public interface ProdutoRepository  extends CrudRepository<Produto,Long>{

    @Query(value = "select * from produto",nativeQuery = true)
    List<Produto> listarTodos();

    @Query(value = "select descricao, qtd from produto", nativeQuery = true)
    List<ProdutoProjection> listarTodos2();

    @Query(value = "select * from produto where cd_produto=:id",nativeQuery = true)
    Produto listarProduto(long id);

    
} 
