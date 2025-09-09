package br.com.fiap;

import java.sql.*;

public class Cadastro {
    public static void main(String[] args) {
        // Obter uma conexão com o banco de dados
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection conexao = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm565754", "071104");

            // Criar o Statement
            Statement statement = conexao.createStatement();


            // Executar o comando SQL de insert, para cadastrar um produto
            statement.executeUpdate("insert into t_tdspw_produto (cd_produto, nm_produto, qt_produto, ds_produto)" +
                    "values (1, 'MOUSE GAMER', 50, 'MOUSE ZICA DO EX COORDENADOR DO CURSO')");


            // Fechar conexão
            conexao.close();
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

    } // main
} // class
