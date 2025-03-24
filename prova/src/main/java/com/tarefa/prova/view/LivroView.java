package com.tarefa.prova.view;

import com.tarefa.prova.controller.LivroController;
import com.tarefa.prova.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivroView {

    LivroController lc = new LivroController();

    @GetMapping("/livro")
    public List<Livro> getAllLivro(){
        return lc.getAllLivro();
    }

    @PostMapping("/livro")
    public Boolean postLivro(@RequestBody Livro l){
        return lc.save(l);
    }
    @PutMapping("/livro")
    public String putLivro(@RequestBody Livro l){
        lc.update(l);
        return "update concluido com sucesso";
    }
    @DeleteMapping("deleteLivro")
    public String deleteLivro(@RequestBody Livro l){
        lc.delete(l);
        return "delete concluido com sucesso";
    }
}

