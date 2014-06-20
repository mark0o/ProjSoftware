package com.proj;
// Generated 19/06/2014 22:10:45 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Veiculo generated by hbm2java
 */
public class Veiculo  implements java.io.Serializable {


     private int copVeiculo;
     private String modelo;
     private String marca;
     private Date anoModelo;
     private String tipoVeiculo;
     private Set veiculoVendas = new HashSet(0);

    public Veiculo() {
    }

	
    public Veiculo(int copVeiculo, String tipoVeiculo) {
        this.copVeiculo = copVeiculo;
        this.tipoVeiculo = tipoVeiculo;
    }
    public Veiculo(int copVeiculo, String modelo, String marca, Date anoModelo, String tipoVeiculo, Set veiculoVendas) {
       this.copVeiculo = copVeiculo;
       this.modelo = modelo;
       this.marca = marca;
       this.anoModelo = anoModelo;
       this.tipoVeiculo = tipoVeiculo;
       this.veiculoVendas = veiculoVendas;
    }
   
    public int getCopVeiculo() {
        return this.copVeiculo;
    }
    
    public void setCopVeiculo(int copVeiculo) {
        this.copVeiculo = copVeiculo;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Date getAnoModelo() {
        return this.anoModelo;
    }
    
    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }
    public String getTipoVeiculo() {
        return this.tipoVeiculo;
    }
    
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public Set getVeiculoVendas() {
        return this.veiculoVendas;
    }
    
    public void setVeiculoVendas(Set veiculoVendas) {
        this.veiculoVendas = veiculoVendas;
    }




}


