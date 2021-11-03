/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaclasses;

import java.util.*;

/**
 *
 * @author Gabriel
 */
public class ElfoVerde extends Elfo {
    
    private final ArrayList<String> DESCRICOES_VALIDAS = new ArrayList<>(
            Arrays.asList(
            "Espada de aço valiriano",
            "Arco de vidro",
            "Flecha de vidro"
            )
    );
    //Itens permitidos ganhar e perder -> espada de aço valiriano, arco de vidro e felcha de vidro
    // ganhar por ataque 2x a exp.
    
    public ElfoVerde(String nome){
        super(nome);
        super.qtdExperienciaPorAtaque = 2;
    }
    
    
    private boolean descricaoValida(String d){
        return DESCRICOES_VALIDAS.contains(d);
    }
    
    @Override
    public void ganharItem(Item item){
        if(this.descricaoValida(item.getDescriçao())){
            this.inventario.adicionar(item);
        }
    }
    
    @Override
    public void perderItem(Item item){
        if(this.descricaoValida(item.getDescriçao())){
            this.inventario.remover(item);
        }
        
    }
}
