package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    // Constantes de conexão
    // Classe da lib responsável por fazer a conexão
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    // url da porta do servidor
    private static final String URL = "jdbc:mysql://localhost:3306/bdIngles";
    // user do banco
    private static final String USER = "root";
    // senha do banco
    private static final String PASS = "";

    // método de conexão com o banco
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            // conecta com o banco e retorna a conexão
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return null;
            // caso caia na excessão retorna o erro e a conexão null
        }
    }

    // método para o fechamento da conexão caso não tenha sido realizado
    // alterações no banco
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
                // se está conectado, desconecte
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(
                    Level.SEVERE, null, ex);
            // excessão rara mas necessária pela documentação
        }
    }

    // método para o fechamento da conexão caso tenha sido feito alterações no
    // banco
    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        // fecha a conexão
        try {
            if (stmt != null) {
                stmt.close();
                // fecha as alterações
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

    // método para o fechamento da conexão caso tenha sido feito pesquisas
    public static void closeConnection(Connection con, PreparedStatement stmt,
            ResultSet rs) {

        // fechamento da conexão com alterações
        closeConnection(con, stmt);

        try {
            if (rs != null) {
                rs.close();
                // fechamento da query
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
