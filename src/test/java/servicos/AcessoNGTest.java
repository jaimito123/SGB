/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Manhique
 */
public class AcessoNGTest {
    
    public AcessoNGTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    @Test
    public void testIsbloqueadoTest() {
        Acesso acesso = new Acesso();
        String nm = "mjunior";
        boolean expResult = false;
        boolean result = acesso.isbloqueado(nm);
        assertEquals(expResult, result);
    }
}
