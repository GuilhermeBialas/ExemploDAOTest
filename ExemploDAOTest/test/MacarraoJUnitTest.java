/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dao.MacarraoDAO;
import bean.Macarrao;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guilherme Bialas
 */
public class MacarraoJUnitTest {

    @Test
    public void testarCadastro() {
        Macarrao nissin = new Macarrao();
        nissin.setMarca("Nissin");
        nissin.setPeso(100);
        nissin.setAldente(false);
        nissin.setTipo("Na Hora");

        int identificador = new MacarraoDAO().cadastrar(nissin);

        assertNotSame(identficador, -1);

        Macarrao macarraoBucado = new MacarraoDAO().obterPeloId(identifcador);

        
        //Verifica se o que foi quardado em um objeto java
        //foi oq relamente foi armazenado no banco,ou seja
        //consistir se as informações são iguais
        assertEquals(nissin.getMarca(),macarraoBuscado.getMarca());
        assertEquals(nissin.getMarca(),macarraoBuscado.getPeso(),0);
        assertEquals(nissin.isAldente(),macarraoBuscado.isAldente());
        assertEquals(nissin.getTipo(),macarraoBuscado.getTipo());
        
        
    }

}
