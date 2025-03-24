package com.tarefa.prova.banco;

import com.tarefa.prova.model.Consulta;

import java.util.ArrayList;
import java.util.List;

public class ConsultaBanco {
    private List<Consulta> consultas;

    public ConsultaBanco() {
        this.consultas = new ArrayList<>();
    }
    public void insert(Consulta co) {
        consultas.add(co);
    }

    public Consulta findOne(int id) {
        for (Consulta co : consultas) {
            if (co.getId() == id) {
                return co;
            }
        }
        return null;
    }


    public List<Consulta> findAll() {
        return new ArrayList<>(consultas);
    }


    public boolean update(Consulta co) {
        for (int i = 0; i < consultas.size(); i++) {
            if (consultas.get(i).getId() == co.getId()) {
                consultas.set(i, co);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id) {
        return consultas.removeIf(co -> co.getId() == id);
    }
}

