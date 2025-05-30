package model;

public class Usuario {
    private int id;
    private String nm;
    private String email;
    private int idade;

    public Usuario(String nm, String email, int idade) {
        this.nm = nm;
        this.email = email;
        this.idade = idade;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNm() { return nm; }
    public String getEmail() { return email; }
    public int getIdade() { return idade; }
}
