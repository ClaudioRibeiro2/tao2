package br.com.sistema.service;

import br.com.sistema.model.Cargo;
import br.com.sistema.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoServiceImpl implements CargoService {

    @Autowired
    CargoRepository cargoRepository;

    @Override
    public Cargo findById(Long id) {
        return cargoRepository.findById(id).get();
    }
    @Override
    public Cargo findByNome(String nome) { return cargoRepository.findByNome(nome); }
    @Override
    public List<Cargo> findAll() { return cargoRepository.findAll(); }

    @Override
    public String validarCargo(Cargo cargo){
        String error = null;
        Cargo x;
        if (cargo.getId() == null){ // Se Id de cargo for nulo
             x = cargoRepository.findByNome(cargo.getNome());
             // Verifica no db se existe esse nome e o atribui a x.
             if (x != null){ // Se x for diferente de nulo
                 error = "Nome do cargo já existe";
             }
        } else { // Se o Id do cargo existir
            x = cargoRepository.findByIdNotAndNome(cargo.getId(), cargo.getNome());
            // Verifica se no db
            if (x != null){
                error = " Já existe um cargo com esse nome.";           }
        }
        return error;
    }

    @Override
    public boolean save(Cargo cargo) {
        try {
            if (cargo != null){ // Se cargo for diferente de null.
                cargoRepository.save(cargo); // Salva o cargo no repository.
                return true;
            } else {
                return false;
            }
        } catch (Exception e){ // Se der algum erro.
            System.out.println("Erro ao salvar o cargo: " + e.getMessage());
            return false;
        }
    }
    @Override
    public boolean deleteById(Long id) {
        try {
            // Se id de cargo for diferente de null e maior que zero.
            if (id != null || id > 0){
                cargoRepository.deleteById(id);
                return true;
            } else {
                return false;
            }
        } catch (Exception e){
            System.out.println("Erro ao salvar o cargo: " + e.getMessage());
            return false;
        }
    }
}
