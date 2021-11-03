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
public class Item {
     private String descriçao;
     private int quantidade;
     
     public Item(String d, int q){
        this.descriçao = d;
        this.quantidade = q;
     }
     
     public String getDescriçao(){
         return this.descriçao;
     }
     
     public void setDescriçao(String d){
         this.descriçao = d;
     }
     
     public int getQuantidade(){
         return this.quantidade;
     }
     
     public void setQuantidade(int q){
         this.quantidade = q;
     }
     
     public boolean equals(Object obj){
        Item outroItem = (Item) obj;
        return this.quantidade == outroItem.getQuantidade() && this.descriçao == outroItem.getDescriçao();
     }
     
     public void diminuirQuantidade(){
         this.quantidade -= 1;
     }
     
}
