/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastro_listagem_produtos;


import static Dao.Conexao.conectar;
import java.sql.SQLException;

/**
 *
 * @author T
 */
public class Cadastro_Listagem_Produtos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        try{
            conectar();
            System.out.println("Conexao realizada com sucesso");
            
        }catch(SQLException e){
            
            System.out.println("Erro: "+e.getMessage());
        }
    }
    
}
