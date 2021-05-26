package br.com.sistema.service;

import br.com.sistema.model.Cargo;
import java.util.List;

public interface CargoService {

    public Cargo findById(Long id);
    public List<Cargo> findAll();
    public Cargo findByNome(String nome);
    public String validarCargo(Cargo cargo);

    public boolean save(Cargo cargo);
    public boolean deleteById(Long id);
}
