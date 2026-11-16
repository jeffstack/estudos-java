// Jefferson Nascimento dos Santos
package trabalhopratico04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private Connection con;

    public Connection abrir() {
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=aulajava;trustServerCertificate=true;", "root", "root");
    } catch (ClassNotFoundException e) {
        System.out.println("Driver não encontrado");
    } 
    catch (SQLException e) {
        System.out.println("Erro na conexão: " + e.getMessage());
    }
        return con;
    }

    public void fechar() {
        try {
            if (con != null) {
                con.close();
            }
        } 
        catch (SQLException e) {
            System.out.println("Erro ao fechar a conexão: " + e.getMessage());
        }
    }
}