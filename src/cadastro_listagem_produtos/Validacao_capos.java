/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro_listagem_produtos;

import javax.swing.JOptionPane;

/**
 *
 * @author T
 */
public class Validacao_capos {
    
    
    public void validar_entradas(String nome) {
        
       if(nome.trim().isEmpty()) {
         JOptionPane.showMessageDialog(null, "O campo para nome nao deve estar vazio");
       }
       
      
        
        
    }
    
}
