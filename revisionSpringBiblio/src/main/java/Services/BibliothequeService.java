package Services;


import com.example.revisionspringbiblio.DAO.Entities.Bibliotheque;
import com.example.revisionspringbiblio.DAO.Repositories.BibliothequeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class BibliothequeService implements IBibliothequeService{



    BibliothequeRepository BibliothequeRepository;

    @Override
    public Bibliotheque addBibliotheque(Bibliotheque b){
        return BibliothequeRepository.save(b);
    }

    @Override
    public List<Bibliotheque> addAllBibliotheques(List<Bibliotheque> Bibliotheques) {
        return BibliothequeRepository.saveAll(Bibliotheques);
    }

    @Override
    public Bibliotheque updateBibliotheque(Bibliotheque b) {
        return BibliothequeRepository.save(b);
    }

    @Override
    public List<Bibliotheque> findAllBibliotheques() {



        return BibliothequeRepository.findAll();
    }

    @Override
    public Optional<Bibliotheque> findBibliothequeById(long id) {
        return BibliothequeRepository.findById(id);
    }

    @Override
    public void deleteBibliotheque(Bibliotheque b) {
        BibliothequeRepository.delete(b);

    }

    @Override
    public void deleteBibliothequeById(long id) {
        BibliothequeRepository.deleteById(id);

    }






}
