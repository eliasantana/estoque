package br.com.estoque.services;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.estoque.dto.ProdutoDto;
import br.com.estoque.model.Produto;
import br.com.estoque.projection.ProdutoProjection;
import br.com.estoque.repository.ProdutoRepository;

@Service
public class ProdutoServices {
    
    @Autowired
    ProdutoRepository repository;

    public ResponseEntity<ProdutoDto> adicionar(@RequestParam ProdutoDto dto) {
        Produto produto= new Produto(dto);
        Produto pdtoSalvo = repository.save(produto);
        ProdutoDto pdtoSalvoDto = new ProdutoDto(pdtoSalvo);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pdtoSalvoDto.getCdProduto()).toUri();
        return ResponseEntity.created(uri).build();        
    }

    public ResponseEntity<List<ProdutoDto>> listarTodos() {
        List<Produto> lista=repository.listarTodos();
        List<ProdutoDto> listaDto = lista.stream().map(p -> new ProdutoDto(p)).collect(Collectors.toList());
        return ResponseEntity.ok(listaDto);
    }
    
    public ResponseEntity<List<ProdutoProjection>> listarTodos2() {
        List<ProdutoProjection> lista=repository.listarTodos2();        
        return ResponseEntity.ok(lista);
    }

    public ResponseEntity<Produto> listarProduto(long id) {
        Produto p =repository.listarProduto(id);
        System.out.println(p.toString());
        return ResponseEntity.ok(p);
    }

    public ResponseEntity<Produto> delete(Long id) {
        Produto p = repository.listarProduto(id);
        repository.delete(p);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<Produto> alterar(Long id) {
        Produto p = repository.listarProduto(id);
        return ResponseEntity.ok(p);
    }

    public ResponseEntity<Produto> salvar(Produto produto) {        
        return ResponseEntity.ok(produto);
    }
}
