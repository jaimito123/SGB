/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import conexao.JPA;
import controladores.entidades.SgObraJpaController;
import entidades.SgObra;
import junit.framework.TestCase;
import org.zkoss.zul.ListModelList;

/**
 *
 * @author Lucio
 */
public class TesteListaObra extends TestCase{
    public void teste_1(){
        ListModelList<SgObra> books = new ListModelList<SgObra>(new SgObraJpaController(new JPA().getEmf()).findSgObraEntities("Informática"));
        assertEquals(books.getSize(), 7);
    }
    public void teste_2(){
        ListModelList<SgObra> books = new ListModelList<SgObra>(new SgObraJpaController(new JPA().getEmf()).findSgObraEntities("Informática"));
        assertEquals(books.get(0).getTitulo(), "Sistemas Distribuidos : Conceitos e Projectos");
        assertEquals(books.get(1).getTitulo(), "Engenharia de Software : Uma Abordagem Professional");
    }
    public void teste_3(){
        ListModelList<SgObra> books = new ListModelList<SgObra>(new SgObraJpaController(new JPA().getEmf()).findSgObraEntities("Ciências Biológicas"));
        assertEquals(books.size(), 0);
        
    }
}
