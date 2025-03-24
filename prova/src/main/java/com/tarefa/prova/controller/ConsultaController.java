package com.tarefa.prova.controller;

import com.tarefa.prova.banco.ConsultaBanco;
import com.tarefa.prova.model.Consulta;
import java.util.List;

public class ConsultaController {
    ConsultaBanco cba = new ConsultaBanco();
    public List<Consulta> getAllConsulta() {
        return cba.findAll();
    }

    public Boolean save(Consulta co) {
        cba.insert(co);
        return true;
    }
    public void update(Consulta co) {
        cba.update(co);
    }
    public void delete(Consulta co) {
        cba.delete(co.getId());
    }
}

