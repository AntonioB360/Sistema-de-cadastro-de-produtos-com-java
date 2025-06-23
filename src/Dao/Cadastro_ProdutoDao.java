/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T
 */
public class Cadastro_ProdutoDao {
    
    
    public void cadastrar_produtos(Produtos produto) throws SQLException{
        
        String sql="insert into produtos (nome,tipo,quantidade) values (?,?,?)";
        try(Connection com=Conexao.conectar(); PreparedStatement pst=com.prepareStatement(sql)){
            
            pst.setString(1,produto.getNome());
            pst.setString(2, produto.getTipo());
            pst.setInt(3, produto.getQuantidade());
            
            pst.executeUpdate();
        }
        
    }
    
   
    
      public List<Produtos> exibir_produtos() throws SQLException{
        
        String sql="select *from produtos";
        
        try(Connection com=Conexao.conectar(); PreparedStatement pst=com.prepareStatement(sql)){
            
            List<Produtos> listagem=new ArrayList<>();
            
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
                
                listagem.add(new Produtos(rs.getInt("id"),rs.getString("nome"),rs.getString("tipo"),rs.getInt("quantidade")));
            }
            
          return listagem;
        }
        
       
    }
}
