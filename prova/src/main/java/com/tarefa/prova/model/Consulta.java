package com.tarefa.prova.model;

import java.util.ArrayList;

public class Consulta {

    private Integer id;
    private ArrayList<Emprestimo> emprestimosL;

    public Consulta(Integer id, ArrayList<Emprestimo> emprestimosL) {
        this.id = id;
        this.emprestimosL = emprestimosL;
    }

    public Consulta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Emprestimo> getEmprestimosL() {
        return emprestimosL;
    }

    public void setEmprestimosL(ArrayList<Emprestimo> emprestimosL) {
        this.emprestimosL = emprestimosL;
    }
}
