/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imrob.locadoraveiculos.entities;

/**
 *
 * @author imrob
 */
public class Modelo {

    private Long id;
    private String nome;
    private Long fabricante_id;

    public Modelo() {
    }

    public Modelo(Long id, String nome, Long idFabricante) {
        this.id = id;
        this.nome = nome;
        this.fabricante_id = idFabricante;
    }

    public Modelo(String nome, Long idFabricante) {
        this.nome = nome;
        this.fabricante_id = idFabricante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getFabricanteId() {
        return fabricante_id;
    }

    public void setFabricanteId(Long fabricanteId) {
        this.fabricante_id = fabricanteId;
    }

    @Override
    public String toString() {
        return id + " - " + nome;
    }

}
