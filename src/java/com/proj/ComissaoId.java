package com.proj;
// Generated 19/06/2014 22:10:45 by Hibernate Tools 3.2.1.GA



/**
 * ComissaoId generated by hbm2java
 */
public class ComissaoId  implements java.io.Serializable {


     private int codFuncionario;
     private int codContrato;
     private int seqPagamento;
     private int seqComissao;

    public ComissaoId() {
    }

    public ComissaoId(int codFuncionario, int codContrato, int seqPagamento, int seqComissao) {
       this.codFuncionario = codFuncionario;
       this.codContrato = codContrato;
       this.seqPagamento = seqPagamento;
       this.seqComissao = seqComissao;
    }
   
    public int getCodFuncionario() {
        return this.codFuncionario;
    }
    
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    public int getCodContrato() {
        return this.codContrato;
    }
    
    public void setCodContrato(int codContrato) {
        this.codContrato = codContrato;
    }
    public int getSeqPagamento() {
        return this.seqPagamento;
    }
    
    public void setSeqPagamento(int seqPagamento) {
        this.seqPagamento = seqPagamento;
    }
    public int getSeqComissao() {
        return this.seqComissao;
    }
    
    public void setSeqComissao(int seqComissao) {
        this.seqComissao = seqComissao;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ComissaoId) ) return false;
		 ComissaoId castOther = ( ComissaoId ) other; 
         
		 return (this.getCodFuncionario()==castOther.getCodFuncionario())
 && (this.getCodContrato()==castOther.getCodContrato())
 && (this.getSeqPagamento()==castOther.getSeqPagamento())
 && (this.getSeqComissao()==castOther.getSeqComissao());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodFuncionario();
         result = 37 * result + this.getCodContrato();
         result = 37 * result + this.getSeqPagamento();
         result = 37 * result + this.getSeqComissao();
         return result;
   }   


}


