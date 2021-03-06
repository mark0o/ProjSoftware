package com.proj;
// Generated 19/06/2014 22:10:45 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Funcionario generated by hbm2java
 */
public class Funcionario  implements java.io.Serializable {


     private int codPessoa;
     private Pessoa pessoa;
     private Usuario usuario;
     private BigDecimal vlrSalarioatual;
     private String flgStatus;
     private Set comissaos = new HashSet(0);
     private Set vendas = new HashSet(0);

    public Funcionario() {
    }

	
    public Funcionario(int codPessoa, Pessoa pessoa, BigDecimal vlrSalarioatual, String flgStatus) {
        this.codPessoa = codPessoa;
        this.pessoa = pessoa;
        this.vlrSalarioatual = vlrSalarioatual;
        this.flgStatus = flgStatus;
    }
    public Funcionario(int codPessoa, Pessoa pessoa, Usuario usuario, BigDecimal vlrSalarioatual, String flgStatus, Set comissaos, Set vendas) {
       this.codPessoa = codPessoa;
       this.pessoa = pessoa;
       this.usuario = usuario;
       this.vlrSalarioatual = vlrSalarioatual;
       this.flgStatus = flgStatus;
       this.comissaos = comissaos;
       this.vendas = vendas;
    }
   
    public int getCodPessoa() {
        return this.codPessoa;
    }
    
    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public BigDecimal getVlrSalarioatual() {
        return this.vlrSalarioatual;
    }
    
    public void setVlrSalarioatual(BigDecimal vlrSalarioatual) {
        this.vlrSalarioatual = vlrSalarioatual;
    }
    public String getFlgStatus() {
        return this.flgStatus;
    }
    
    public void setFlgStatus(String flgStatus) {
        this.flgStatus = flgStatus;
    }
    public Set getComissaos() {
        return this.comissaos;
    }
    
    public void setComissaos(Set comissaos) {
        this.comissaos = comissaos;
    }
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }




}


