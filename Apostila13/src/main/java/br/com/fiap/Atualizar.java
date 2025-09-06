package br.com.fiap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Atualizar {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection conexao = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm565754", "071104");

            Statement statement = conexao.createStatement();

            statement.executeUpdate("update t_tdspw_produto set " +
                    "cd_produto = 2, nm_produto = 'Teclado top', qt_produto = 3, ds_produto = 'teclado q faz tec tec gostoso'");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
