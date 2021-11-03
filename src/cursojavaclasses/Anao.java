/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaclasses;

/**
 *
 * @author Gabriel
 */
public class Anao extends Personagens {
    
    private boolean escudoEquipado;
    
    public Anao(String n){
        super(n);
        super.vida = 110f;
        this.inventario.adicionar(new Item("Escudo",1));
        this.escudoEquipado = false;
        super.qtdDano = 10.0;
    }
   
    public void verificarEscudoSetarDano(){
        super.qtdDano = this.itemEstaAtivo( this.inventario.obter(0),1)? 5.0 : 10.0;
    }
    
}
