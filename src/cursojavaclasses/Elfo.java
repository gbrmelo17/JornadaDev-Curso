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
public class Elfo extends Personagens {
    private int indiceFlecha = 0;
    
    public Elfo(String n){
        super(n);
        super.vida = 100.0f;
        inventario.adicionar(new Item("Flecha", 2));
        inventario.adicionar(new Item("Arco", 1));
        this.ativarOuDesativarItem(true, this.inventario.obter(0), 0);
        this.ativarOuDesativarItem(true, this.inventario.obter(1), 1);
    }
    
    public Item getFlecha(){
        return this.inventario.obter(indiceFlecha);
    }
   
}
