package com.tarefa.prova.view;

import com.tarefa.prova.controller.ConsultaController;
import com.tarefa.prova.model.Consulta;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ConsultaView {

    ConsultaController ccl = new ConsultaController();

    @GetMapping("/consulta")
    public List<Consulta> getAllConsulta(){
        return ccl.getAllConsulta();
    }

    @PostMapping("/consulta")
    public Boolean postConsulta(@RequestBody Consulta co){
        return ccl.save(co);
    }
    @PutMapping("/consulta")
    public String putConsulta(@RequestBody Consulta co){
        ccl.update(co);
        return "update concluido com sucesso";
    }
    @DeleteMapping("deleteConsulta")
    public String deleteConsulta(@RequestBody Consulta co){
        ccl.delete(co);
        return "delete concluido com sucesso";
    }
}
