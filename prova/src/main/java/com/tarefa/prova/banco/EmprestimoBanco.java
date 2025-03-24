package com.tarefa.prova.banco;

import com.tarefa.prova.model.Emprestimo;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoBanco {
    private List<Emprestimo> emprestimos;

    public EmprestimoBanco() {
        this.emprestimos = new ArrayList<>();
    }

    public void insert(Emprestimo e) {
        emprestimos.add(e);
    }

    public Emprestimo findOne(int id) {
        for (Emprestimo e : emprestimos) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public List<Emprestimo> findAll() {
        return new ArrayList<>(emprestimos);
    }

    public boolean update(Emprestimo e) {
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getId().equals(e.getId())) {
                emprestimos.set(i, e);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id) {
        return emprestimos.removeIf(e -> e.getId().equals(id));
    }
}
