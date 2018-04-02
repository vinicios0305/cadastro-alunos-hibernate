
package br.edu.ifro.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
        
public class aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    
    private Interger id;
    private String nome;
    private Interger idade;

    public Interger getId() {
        return id;
    }

    public void setId(Interger id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Interger getIdade() {
        return idade;
    }

    public void setIdade(Interger idade) {
        this.idade = idade;
    }
    
}
