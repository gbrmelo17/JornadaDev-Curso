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
public class Inventario {
    private ArrayList<Item> itens;
    
    public Inventario(){
        this.itens = new ArrayList<>();
    }
    
    public ArrayList<Item> getItem(){
        return this.itens;
    }
    
    public Item obter( int posicao ){
        return this.validarSePosicaoNaoExiste(posicao)? null : this.itens.get(posicao);   
    }
   
    public void remover( Item i ){
        this.itens.remove(i);
    }
    
    public void adicionar( Item i ){
        this.itens.add(i);
    }
    
    public boolean validarSePosicaoNaoExiste( int posicao){
        return posicao >= this.itens.size();
    }


}


