/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Manhique
 */
@Embeddable
public class SgObraSgObraAutorPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "data_alocacao", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataAlocacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sgobra_idlivro", nullable = false)
    private long sgobraIdlivro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idautor", nullable = false)
    private long idautor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idlivro", nullable = false)
    private long idlivro;

    public SgObraSgObraAutorPK() {
    }

    public SgObraSgObraAutorPK(Date dataAlocacao, long sgobraIdlivro, long idautor, long idlivro) {
        this.dataAlocacao = dataAlocacao;
        this.sgobraIdlivro = sgobraIdlivro;
        this.idautor = idautor;
        this.idlivro = idlivro;
    }

    public Date getDataAlocacao() {
        return dataAlocacao;
    }

    public void setDataAlocacao(Date dataAlocacao) {
        this.dataAlocacao = dataAlocacao;
    }

    public long getSgobraIdlivro() {
        return sgobraIdlivro;
    }

    public void setSgobraIdlivro(long sgobraIdlivro) {
        this.sgobraIdlivro = sgobraIdlivro;
    }

    public long getIdautor() {
        return idautor;
    }

    public void setIdautor(long idautor) {
        this.idautor = idautor;
    }

    public long getIdlivro() {
        return idlivro;
    }

    public void setIdlivro(long idlivro) {
        this.idlivro = idlivro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataAlocacao != null ? dataAlocacao.hashCode() : 0);
        hash += (int) sgobraIdlivro;
        hash += (int) idautor;
        hash += (int) idlivro;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SgObraSgObraAutorPK)) {
            return false;
        }
        SgObraSgObraAutorPK other = (SgObraSgObraAutorPK) object;
        if ((this.dataAlocacao == null && other.dataAlocacao != null) || (this.dataAlocacao != null && !this.dataAlocacao.equals(other.dataAlocacao))) {
            return false;
        }
        if (this.sgobraIdlivro != other.sgobraIdlivro) {
            return false;
        }
        if (this.idautor != other.idautor) {
            return false;
        }
        if (this.idlivro != other.idlivro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.SgObraSgObraAutorPK[ dataAlocacao=" + dataAlocacao + ", sgobraIdlivro=" + sgobraIdlivro + ", idautor=" + idautor + ", idlivro=" + idlivro + " ]";
    }
    
}
