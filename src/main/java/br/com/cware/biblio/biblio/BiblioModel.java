package br.com.cware.biblio.biblio;

import jakarta.persistence.*;

@Entity
@Table(name="tb_biblio")
public class BiblioModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;

    public BiblioModel() {
    }

    public BiblioModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
