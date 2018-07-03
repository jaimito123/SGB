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
public class SgObraSgExemplarPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "sgobra_idlivro", nullable = false)
    private long sgobraIdlivro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sgexemplarlist_nr_registo", nullable = false)
    private long sgexemplarlistNrRegisto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "getsgexemplarlist_nr_registo", nullable = false)
    private long getsgexemplarlistNrRegisto;

    public SgObraSgExemplarPK() {
    }

    public SgObraSgExemplarPK(long sgobraIdlivro, long sgexemplarlistNrRegisto, long getsgexemplarlistNrRegisto) {
        this.sgobraIdlivro = sgobraIdlivro;
        this.sgexemplarlistNrRegisto = sgexemplarlistNrRegisto;
        this.getsgexemplarlistNrRegisto = getsgexemplarlistNrRegisto;
    }

    public long getSgobraIdlivro() {
        return sgobraIdlivro;
    }

    public void setSgobraIdlivro(long sgobraIdlivro) {
        this.sgobraIdlivro = sgobraIdlivro;
    }

    public long getSgexemplarlistNrRegisto() {
        return sgexemplarlistNrRegisto;
    }

    public void setSgexemplarlistNrRegisto(long sgexemplarlistNrRegisto) {
        this.sgexemplarlistNrRegisto = sgexemplarlistNrRegisto;
    }

    public long getGetsgexemplarlistNrRegisto() {
        return getsgexemplarlistNrRegisto;
    }

    public void setGetsgexemplarlistNrRegisto(long getsgexemplarlistNrRegisto) {
        this.getsgexemplarlistNrRegisto = getsgexemplarlistNrRegisto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) sgobraIdlivro;
        hash += (int) sgexemplarlistNrRegisto;
        hash += (int) getsgexemplarlistNrRegisto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SgObraSgExemplarPK)) {
            return false;
        }
        SgObraSgExemplarPK other = (SgObraSgExemplarPK) object;
        if (this.sgobraIdlivro != other.sgobraIdlivro) {
            return false;
        }
        if (this.sgexemplarlistNrRegisto != other.sgexemplarlistNrRegisto) {
            return false;
        }
        if (this.getsgexemplarlistNrRegisto != other.getsgexemplarlistNrRegisto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.SgObraSgExemplarPK[ sgobraIdlivro=" + sgobraIdlivro + ", sgexemplarlistNrRegisto=" + sgexemplarlistNrRegisto + ", getsgexemplarlistNrRegisto=" + getsgexemplarlistNrRegisto + " ]";
    }
    
}
