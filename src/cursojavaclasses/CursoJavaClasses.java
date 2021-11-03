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
public class CursoJavaClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ElfoNoturno luke = new ElfoNoturno("Luke");
        Item faca = new Item("Faca",2);
        Item espada = new Item("Espada",1);
        luke.ganharItem(faca);
        luke.ganharItem(espada);
        Anao jake = new Anao("Jake");
        System.out.println(jake.getVida());
        System.out.println(luke.getExperiencia());
        luke.atacarOutroPersonagem(jake, espada);
        System.out.println(jake.getVida());
        for(int i = 0; i < 4; i++){
            System.out.println(luke.getInventario().obter(i).getDescriçao());
        }
        System.out.println(luke.getExperiencia());
        
    }
    
}
