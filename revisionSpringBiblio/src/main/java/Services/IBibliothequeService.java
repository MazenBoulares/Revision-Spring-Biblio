package Services;


import com.example.revisionspringbiblio.DAO.Entities.Bibliotheque;

import java.util.List;
import java.util.Optional;

public interface IBibliothequeService {

    Bibliotheque addBibliotheque(Bibliotheque b);



    List<Bibliotheque> addAllBibliotheques(List<Bibliotheque> Bibliotheques);
    Bibliotheque updateBibliotheque(Bibliotheque b);
    List<Bibliotheque> findAllBibliotheques();
    Optional<Bibliotheque> findBibliothequeById(long id);
    void deleteBibliotheque(Bibliotheque b);
    void deleteBibliothequeById(long id);



}
