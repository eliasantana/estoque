package br.com.estoque.Controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.estoque.dto.ProdutoDto;
import br.com.estoque.model.Produto;
import br.com.estoque.projection.ProdutoProjection;
import br.com.estoque.services.ProdutoServices;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/produto")
public class ProdutoController {
    
    @Autowired
    ProdutoServices services;

    @PostMapping("/adicionar")
    public ResponseEntity<ProdutoDto> adicionar(@RequestBody ProdutoDto dto) {
        System.out.println(dto);
        return services.adicionar(dto);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<ProdutoDto>> listarTodos() {
        return services.listarTodos();
    }
    @GetMapping("/listar2")
    public ResponseEntity<List<ProdutoProjection>> listarTodos2() {
        return services.listarTodos2();
    }
    
    @GetMapping("/listar/{id}")
    public ResponseEntity<Produto> getMethodName(@PathVariable long id) {
        System.out.println(" id " + id);
        return services.listarProduto(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Produto> delete(@PathVariable Long id){
        return services.delete(id);
    }

    @PostMapping("/alterar/{id}")
    public ResponseEntity<Produto> alterar(@PathVariable Long id) {
        return services.alterar(id);
    }

    @PostMapping("/salvar")
    public ResponseEntity<Produto>salvar(@RequestBody Produto produto) {                
        return services.salvar(produto);
    }
    
        
}
