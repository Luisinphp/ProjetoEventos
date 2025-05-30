package util;

import java.sql.Connection;
import java.sql.Statement;

public class DBInit {
    public static void init() {
        try (Connection conn = DBConn.conn();
             Statement st = conn.createStatement()) {
            String sqlUsr = """
                    CREATE TABLE IF NOT EXISTS usuarios (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        nome varchar(100) NOT NULL,
                        email varchar(100) NOT NULL,
                        idade INTEGER NOT NULL
                    );
                    """;
            String sqlEvt = """
                    CREATE TABLE IF NOT EXISTS eventos (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        nome varchar(100) NOT NULL,
                        endereco varchar(100) NOT NULL,
                        categoria varchar(100) NOT NULL,
                        horario datetime NOT NULL,
                        descricao varchar(200)
                    );
                    """;
            st.executeUpdate(sqlUsr);
            st.executeUpdate(sqlEvt);
            System.out.println("DB iniciado!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
