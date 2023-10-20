package testes.caixa.branca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// A classe representa um usuário e possui métodos para conectar ao banco de dados e verificar credenciais de usuário.
public class User {
    // Método para estabelecer uma conexão com o banco de dados MySQL.
    public Connection conectarDB() {
        // Instância para criar a conexão com o banco de dados MySQL.
        Connection conn = null;
        try {
            // Carrega o driver JDBC para MySQL.
            Class.forName("com.mysql.Driver.Manager").newInstance();
            // URL de conexão com o banco de dados, incluindo usuário e senha.
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            // Estabelece a conexão.
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Captura, mas nesse caso ignora exceções para simplificação, mas não é o correto.
        }
        // Retorna a conexão estabelecida, ou null, se falhar.
        return conn;
    }

    // Variáveis públicas para armazenar o nome do usuário e o resultado da verificação.
    public String nome = "";
    public boolean result = false;

    // Método para verificar se as credenciais do usuário no banco de dados são válidas.
    public boolean verificarUsuario(String login, String senha) {
        String sql = ""; // Varíavel criada para armazenar consulta SQL
        Connection conn = conectarDB(); // Estabelece a conexão com o banco de dados.

        // Constrói a consulta/query SQL para verificar a existência do usuário com base no login e senha fornecidos.
        sql += "select nome from usuarios ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";
        try {
            Statement st = conn.createStatement(); // Criação de um objeto Statement para executar consultas SQL no banco de dados.
            ResultSet rs = st.executeQuery(sql); // Executa a consulta SQL.
            if (rs.next()) {
                // Se houver resultados, define o resultado como verdadeiro e armazena o nome do usuário.
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Captura, mas nesse caso ignora exceções para simplificação, mas não é o correto.
        }
        // Retorna true se a verificação for bem-sucedida, false caso contrário.
        return result;
    }
}
