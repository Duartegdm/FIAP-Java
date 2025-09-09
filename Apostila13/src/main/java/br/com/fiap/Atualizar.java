package br.com.fiap;

import br.com.fiap.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Atualizar {
    public static void main(String[] args) {
        try{
            // Obter uma conexão com o banco de dados
            Connection conexao = ConnectionFactory.getConnection();

            // Criar o Statement
            Statement statement = conexao.createStatement();

            // Executar o comando SQL de insert, para cadastrar um produto
            statement.executeUpdate("update t_tdspw_produto set " +
                    "cd_produto = 2, nm_produto = 'Teclado top', qt_produto = 3, ds_produto = 'teclado q faz tec tec gostoso'");

            // Fechar a conexão
            conexao.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
