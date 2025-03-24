package com.tarefa.prova.view;

import com.tarefa.prova.controller.ClienteController;
import com.tarefa.prova.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteView {

    ClienteController cc = new ClienteController();
    @GetMapping("/cliente")
    public List<Cliente> getAllClientes(){
        return cc.getAllClientes();
    }

    @PostMapping("/cliente")
    public Boolean postCliente(@RequestBody Cliente c){
        return cc.save(c);
    }
    @PutMapping("/cliente")
    public String putCliente(@RequestBody Cliente c){
        cc.update(c);
        return "update concluido com sucesso";
    }
    @DeleteMapping("deleteCliente")
    public String deleteCliente(@RequestBody Cliente c){
        cc.delete(c);
        return "delete concluido com sucesso";
    }
}

