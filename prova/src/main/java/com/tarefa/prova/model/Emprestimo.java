package com.tarefa.prova.model;

import java.time.LocalDate;

import java.util.Date;

public class Emprestimo {
    private Integer id;

    private LocalDate dataInicio;
    private Date dataFIm = null;
    private Livro livroL;
    private Cliente clienteL;


    public Emprestimo(LocalDate dataInicio, Date dataFIm, Livro livroL, Cliente clienteL, Integer id) {
        this.dataInicio = dataInicio;
        this.dataFIm = dataFIm;
        this.livroL = livroL;
        this.clienteL = clienteL;
        this.id = id;
    }

    public Emprestimo() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFIm() {
        return dataFIm;
    }

    public void setDataFIm(Date dataFIm) {
        this.dataFIm = dataFIm;
    }

    public Livro getLivroL() {
        return livroL;
    }

    public void setLivroL(Livro livroL) {
        this.livroL = livroL;
    }

    public Cliente getClienteL() {
        return clienteL;
    }

    public void setClienteL(Cliente clienteL) {
        this.clienteL = clienteL;
    }
}
