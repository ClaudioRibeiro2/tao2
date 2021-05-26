package br.com.sistema.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 80) // Define qual é o tamanho maximo da String
    @NotNull // Quer dizer que o String nome é obrigatório
    private String nome;

    @Size(max = 120) // Define qual é o tamanho maximo da String
    @NotNull // Quer dizer que o String email é obrigatório
    private String email;

    // GETTER & SETTER

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // TO STRING

    @Override
    public String toString() {
        return "Funcionario: " + id +
                ", " + nome +
                ", e-mail: " + email;
    }
}

