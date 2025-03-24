package com.tarefa.prova.view;

import com.tarefa.prova.controller.EmprestimoController;
import com.tarefa.prova.model.Emprestimo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmprestimoView {

    EmprestimoController ec = new EmprestimoController();

    @GetMapping("/emprestimo")
    public List<Emprestimo> getAllEmprestimo(){
        return ec.getAllEmprestimos();
    }

    @PostMapping("/emprestimo")
    public Boolean postEmprestimo(@RequestBody Emprestimo e){
        return ec.save(e);
    }
    @PutMapping("/emprestimo")
    public String putEmprestimo(@RequestBody Emprestimo e){
        ec.update(e);
        return "update concluido com sucesso";
    }
    @DeleteMapping("deleteEmprestimo")
    public String deleteEmprestimo(@RequestBody Emprestimo e){
        ec.delete(e);
        return "delete concluido com sucesso";
    }


}
