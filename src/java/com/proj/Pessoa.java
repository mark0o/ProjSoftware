package com.proj;
// Generated 19/06/2014 22:10:45 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pessoa generated by hbm2java
 */
public class Pessoa  implements java.io.Serializable {


     private int codPessoa;
     private Cidade cidade;
     private String nomePessoa;
     private String email;
     private String telefone;
     private String celular;
     private String rg;
     private String cpf;
     private String cnpj;
     private String devCnpj;
     private String flgStatus;
     private Date dtNascimento;
     private Date dtInclussao;
     private int codEndereco;
     private String rua;
     private String bairro;
     private Integer numEndereco;
     private String complemento;
     private Set clientes = new HashSet(0);
     private Set funcionarios = new HashSet(0);

    public Pessoa() {
    }

	
    public Pessoa(int codPessoa, String nomePessoa, String flgStatus, Date dtInclussao, int codEndereco) {
        this.codPessoa = codPessoa;
        this.nomePessoa = nomePessoa;
        this.flgStatus = flgStatus;
        this.dtInclussao = dtInclussao;
        this.codEndereco = codEndereco;
    }
    public Pessoa(int codPessoa, Cidade cidade, String nomePessoa, String email, String telefone, String celular, String rg, String cpf, String cnpj, String devCnpj, String flgStatus, Date dtNascimento, Date dtInclussao, int codEndereco, String rua, String bairro, Integer numEndereco, String complemento, Set clientes, Set funcionarios) {
       this.codPessoa = codPessoa;
       this.cidade = cidade;
       this.nomePessoa = nomePessoa;
       this.email = email;
       this.telefone = telefone;
       this.celular = celular;
       this.rg = rg;
       this.cpf = cpf;
       this.cnpj = cnpj;
       this.devCnpj = devCnpj;
       this.flgStatus = flgStatus;
       this.dtNascimento = dtNascimento;
       this.dtInclussao = dtInclussao;
       this.codEndereco = codEndereco;
       this.rua = rua;
       this.bairro = bairro;
       this.numEndereco = numEndereco;
       this.complemento = complemento;
       this.clientes = clientes;
       this.funcionarios = funcionarios;
    }
   
    public int getCodPessoa() {
        return this.codPessoa;
    }
    
    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public String getNomePessoa() {
        return this.nomePessoa;
    }
    
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCnpj() {
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getDevCnpj() {
        return this.devCnpj;
    }
    
    public void setDevCnpj(String devCnpj) {
        this.devCnpj = devCnpj;
    }
    public String getFlgStatus() {
        return this.flgStatus;
    }
    
    public void setFlgStatus(String flgStatus) {
        this.flgStatus = flgStatus;
    }
    public Date getDtNascimento() {
        return this.dtNascimento;
    }
    
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public Date getDtInclussao() {
        return this.dtInclussao;
    }
    
    public void setDtInclussao(Date dtInclussao) {
        this.dtInclussao = dtInclussao;
    }
    public int getCodEndereco() {
        return this.codEndereco;
    }
    
    public void setCodEndereco(int codEndereco) {
        this.codEndereco = codEndereco;
    }
    public String getRua() {
        return this.rua;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public Integer getNumEndereco() {
        return this.numEndereco;
    }
    
    public void setNumEndereco(Integer numEndereco) {
        this.numEndereco = numEndereco;
    }
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }
    public Set getFuncionarios() {
        return this.funcionarios;
    }
    
    public void setFuncionarios(Set funcionarios) {
        this.funcionarios = funcionarios;
    }




}


