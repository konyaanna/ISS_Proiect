package Service;

import Domain.Angajat;
import Domain.Comanda;
import Domain.ItemComanda;
import Domain.StatusComanda;
import Repository.AngajatRepo;
import Repository.ComandaRepo;
import Repository.MedicamentRepo;

import java.util.List;

public class Service {
    AngajatRepo angajatRepository;
    ComandaRepo comandaRepository;
    MedicamentRepo medicamentRepository;

    public Service(AngajatRepo angajatRepository, ComandaRepo comandaRepository, MedicamentRepo medicamentRepository) {
        this.angajatRepository = angajatRepository;
        this.comandaRepository = comandaRepository;
        this.medicamentRepository = medicamentRepository;
    }

    public Angajat login(String username, String password) {
        Angajat angajat = angajatRepository.findUserPass(username,password);
        return angajat;
    }

    public List<Comanda> getCommandsOf(Integer a_id) {
        return comandaRepository.getCommandsOf(a_id);
    }

    public List<ItemComanda> getMedsOf(Integer id) {
        return comandaRepository.getMedsOf(id);
    }

    public List<String> getMedTypes() {
        return medicamentRepository.getMedTypes();
    }
}
