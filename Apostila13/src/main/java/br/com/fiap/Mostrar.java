package br.com.fiap;

import br.com.fiap.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mostrar {
    public static void main(String[] args) {
        try{
            Connection conexao = ConnectionFactory.getConnection();

            Statement statement = conexao.createStatement();

            ResultSet query = statement.executeQuery("SELECT * FROM t_tdspw_produto");

            while(query.next()) {
                Integer cd_produto = query.getInt("CD_PRODUTO");
                String nm_produto = query.getString("NM_PRODUTO");
                int qt_produto = query.getInt("qt_produto");
                String ds_produto = query.getString("ds_produto");

                System.out.println(cd_produto + " | " + nm_produto + " | " + qt_produto + " | " + ds_produto);
            }

            conexao.close();
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }

    }
}
