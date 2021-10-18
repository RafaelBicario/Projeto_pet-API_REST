package com.projeto.restapi.entidade;

import java.sql.Date;
import java.text.DecimalFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic;

@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String raca;
    private Dynamic telefone;
    private String descricao;
    private DecimalFormat valor;
    private Date data_cadastro;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public Dynamic getTelefone() {
        return telefone;
    }
    public void setTelefone(Dynamic telefone) {
        this.telefone = telefone;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public DecimalFormat getValor() {
        return valor;
    }
    public void setValor(DecimalFormat valor) {
        this.valor = valor;
    }
    public Date getData_cadastro() {
        return data_cadastro;
    }
    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
    
}

// final createTable = '''
// CREATE TABLE contact(
//   id INTEGER PRIMARY KEY AUTOINCREMENT
//   ,raca VARCHAR(20) NOT NULL
//   ,telefone CHAR(16) NOT NULL
//   ,descricao VARCHAR(100) NOT NULL
//   ,valor DECIMAL(6,2) NULL
//   ,data_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP
// );
// ''';