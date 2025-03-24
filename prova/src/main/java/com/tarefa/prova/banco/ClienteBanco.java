package com.tarefa.prova.banco;

import com.tarefa.prova.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteBanco {
    private List<Cliente> clientes;

    public ClienteBanco() {
        this.clientes = new ArrayList<>();
    }

    public void insert(Cliente p) {
        clientes.add(p);
    }

    public Cliente findOne(int id) {
        for (Cliente p : clientes) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }


    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }


    public boolean update(Cliente p) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == p.getId()) {
                clientes.set(i, p);
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id) {
        return clientes.removeIf(p -> p.getId() == id);
    }
}


