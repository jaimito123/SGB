/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Manhique
 */
@Embeddable
public class BLeitorSgEmprestimoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "sgemprestimolist_idemprestimo", nullable = false)
    private long sgemprestimolistIdemprestimo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bleitor_nr_cartao", nullable = false)
    private long bleitorNrCartao;

    public BLeitorSgEmprestimoPK() {
    }

    public BLeitorSgEmprestimoPK(long sgemprestimolistIdemprestimo, long bleitorNrCartao) {
        this.sgemprestimolistIdemprestimo = sgemprestimolistIdemprestimo;
        this.bleitorNrCartao = bleitorNrCartao;
    }

    public long getSgemprestimolistIdemprestimo() {
        return sgemprestimolistIdemprestimo;
    }

    public void setSgemprestimolistIdemprestimo(long sgemprestimolistIdemprestimo) {
        this.sgemprestimolistIdemprestimo = sgemprestimolistIdemprestimo;
    }

    public long getBleitorNrCartao() {
        return bleitorNrCartao;
    }

    public void setBleitorNrCartao(long bleitorNrCartao) {
        this.bleitorNrCartao = bleitorNrCartao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) sgemprestimolistIdemprestimo;
        hash += (int) bleitorNrCartao;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BLeitorSgEmprestimoPK)) {
            return false;
        }
        BLeitorSgEmprestimoPK other = (BLeitorSgEmprestimoPK) object;
        if (this.sgemprestimolistIdemprestimo != other.sgemprestimolistIdemprestimo) {
            return false;
        }
        if (this.bleitorNrCartao != other.bleitorNrCartao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.BLeitorSgEmprestimoPK[ sgemprestimolistIdemprestimo=" + sgemprestimolistIdemprestimo + ", bleitorNrCartao=" + bleitorNrCartao + " ]";
    }
    
}
