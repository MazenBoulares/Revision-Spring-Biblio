package RestControllers;

import Services.IBibliothequeService;
import com.example.revisionspringbiblio.DAO.Entities.Bibliotheque;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/rest")
@AllArgsConstructor
public class RestControllerV1 {

    IBibliothequeService bibliothequeService;

    @PostMapping
    public Bibliotheque addBibliotheque(Bibliotheque b) {

        return bibliothequeService.addBibliotheque(b);

    }

    @GetMapping
    public String test() {
        return "test";
    }

}
