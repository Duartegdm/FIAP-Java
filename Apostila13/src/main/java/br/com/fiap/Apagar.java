package br.com.fiap;

import br.com.fiap.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Apagar {
    public static void main(String[] args) {
        try{
            Connection conexao = ConnectionFactory.getConnection();

            Statement statement = conexao.createStatement();

            statement.executeUpdate("DELETE FROM t_tdspw_produto WHERE cd_produto = 2");

            System.out.println("Produto removido!");

            conexao.close();
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
