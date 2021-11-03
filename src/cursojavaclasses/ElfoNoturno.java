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
public class ElfoNoturno extends Elfo{
    // 3 de exp por ataque
    // -15 de vida por ataque
    
    public ElfoNoturno(String n){
        super(n);
        super.qtdExperienciaPorAtaque = 3;
        super.qtdDano = 15.0f;
    }
}
