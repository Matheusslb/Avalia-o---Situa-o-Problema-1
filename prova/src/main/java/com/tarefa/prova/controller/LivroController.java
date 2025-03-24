package com.tarefa.prova.controller;
import com.tarefa.prova.banco.LivroBanco;
import com.tarefa.prova.model.Livro;

import java.util.List;

public class LivroController {

    LivroBanco lb = new LivroBanco();

    public List<Livro> getAllLivro() {
        return lb.findAll();
    }

    public Boolean save(Livro l) {
        lb.insert(l);
        return true;
    }
    public void update(Livro l) {
        lb.update(l);
    }
    public void delete(Livro l) {
        lb.delete(l.getId());
    }
}
