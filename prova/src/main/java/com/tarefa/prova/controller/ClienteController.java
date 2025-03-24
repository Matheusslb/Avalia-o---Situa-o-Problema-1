package com.tarefa.prova.controller;

import com.tarefa.prova.banco.ClienteBanco;
import com.tarefa.prova.model.Cliente;

import java.util.List;

public class ClienteController {

    ClienteBanco cb = new ClienteBanco();
    public List<Cliente> getAllClientes() {
        return cb.findAll();
    }

    public Boolean save(Cliente c) {
        cb.insert(c);
        return true;
    }
    public void update(Cliente c) {
        cb.update(c);
    }
    public void delete(Cliente c) {
        cb.delete(c.getId());
    }
}
