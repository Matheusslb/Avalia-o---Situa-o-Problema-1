package com.tarefa.prova.controller;

import com.tarefa.prova.banco.EmprestimoBanco;
import com.tarefa.prova.model.Emprestimo;

import java.util.List;

public class EmprestimoController {

    EmprestimoBanco eb = new EmprestimoBanco();

    public List<Emprestimo> getAllEmprestimos() {
        return eb.findAll();
    }

    public Boolean save(Emprestimo e) {
        eb.insert(e);
        return true;
    }
    public void update(Emprestimo e) {
        eb.update(e);
    }
    public void delete(Emprestimo e) {
        eb.delete(e.getId());
    }
}
