package br.com.sistema.repository;

import br.com.sistema.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

// Classe que gerencia o objeto Funcionario no banco de dados.
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    public Funcionario findByEmail(String email);
    public Funcionario findByNome(String nome);
}
