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
public class Personagens {
    //ATRIBUTOS
    protected String nome;
    protected int experiencia;
    protected int qtdExperienciaPorAtaque;
    protected Inventario inventario;
    protected Status status;
    protected double vida;
    protected double qtdDano;
    protected Item[] maos;
    
    //INICIALIZACAO
    { 
      this.inventario = new Inventario(); 
      this.experiencia = 0;
      this.status = Status.RECEM_CRIADO;
      this.qtdExperienciaPorAtaque = 1;
      this.qtdDano = 0.0;
      this.maos = new Item[2];
    }
    
    //CONSTRUTOR
    public Personagens (String nome){
        this.nome = nome;  
    }
    
    //METODOS
    public String getnome(){
        return this.nome;
    }
    
    public void setNome(String n){
         this.nome = n;
    }
    
    public int getExperiencia(){
        return this.experiencia;
    }
    
    public double getVida(){
        return this.vida;
    }
    
    public Status getStatus(){
        return this.status;
    }
    
    public Inventario getInventario(){
        return this.inventario;
    }
    
    protected void ativarOuDesativarItem(boolean ativado,Item item ,int posicao){
        this.maos[posicao] = ativado ? item : null;
    }
    
    protected boolean itemEstaAtivo(Item item, int posicao){
        return this.maos[posicao].equals(item.getDescriçao());
    }
    
    public void ganharItem(Item i){
        this.inventario.adicionar(i);
    }
    
    public void perderItem(Item i){
        this.inventario.remover(i);
    }
    
     protected void aumentarExp(){
        this.experiencia += qtdExperienciaPorAtaque;
    }
     
     protected boolean podeSofrerDano(){
        return this.vida > 0;
    }
    
     protected Status validacaoStatus(){
        return this. vida == 0? Status.MORTO : Status.SOFREU_DANO;
    } 
     
    protected void sofrerDano(){
        if(this.podeSofrerDano()){
            this.vida -= this.vida >= this.qtdDano ? 10 : this.vida;
            this.status = this.validacaoStatus();
        } else {
            this.status = Status.MORTO;
        }
    }
    
    public void atacar(Item item){
        if( item != null){
            etapasItem(item);
       }else {
           this.aumentarExp();
           this.sofrerDano(); 
        }
    }
        
       public void atacarOutroPersonagem(Personagens personagem, Item item){
        if( item != null){
            etapasItem(item);
            personagem.sofrerDano();
       }else {
            this.aumentarExp();
            this.sofrerDano();
            personagem.sofrerDano();
        }
    }
    
    private void etapasItem(Item item){
        item.diminuirQuantidade();
            this.aumentarExp();
            this.sofrerDano();
    }   
    
}
