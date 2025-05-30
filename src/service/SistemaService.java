package service;

import model.Usuario;
import model.Evento;
import util.DBConn;
import java.sql.*;
import java.util.Scanner;

public class SistemaService {

    public void cadUsuario(Scanner sc) {
        System.out.print("Nome: ");
        String nm = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        try (Connection conn = DBConn.conn()) {
            String sql = "INSERT INTO usuarios (nome, email, idade) VALUES (?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nm);
            st.setString(2, email);
            st.setInt(3, idade);
            st.executeUpdate();
            System.out.println("Usuário cadastrado!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void cadEvento(Scanner sc) {
        System.out.print("Nome: ");
        String nm = sc.nextLine();
        System.out.print("Endereço: ");
        String end = sc.nextLine();
        System.out.print("Categoria: ");
        String cat = sc.nextLine();
        System.out.print("Horário: ");
        String hr = sc.nextLine();
        System.out.print("Descrição: ");
        String desc = sc.nextLine();

        try (Connection conn = DBConn.conn()) {
            String sql = "INSERT INTO eventos (nome, endereco, categoria, horario, descricao) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nm);
            st.setString(2, end);
            st.setString(3, cat);
            st.setString(4, hr);
            st.setString(5, desc);
            st.executeUpdate();
            System.out.println("Evento cadastrado!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void lstEvento() {
        try (Connection conn = DBConn.conn()) {
            String sql = "SELECT * FROM eventos";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Endereço: " + rs.getString("endereco"));
                System.out.println("Categoria: " + rs.getString("categoria"));
                System.out.println("Horário: " + rs.getString("horario"));
                System.out.println("Descrição: " + rs.getString("descricao"));
                System.out.println("-----------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
