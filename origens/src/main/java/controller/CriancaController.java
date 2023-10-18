package controller;


import model.entidade.CriancaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.CriancaService;


@RestController
@RequestMapping(path = "/api/criancas")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:5500"}, maxAge = 3600)
public class CriancaController {

    @Autowired
    private CriancaService criancaService;


    @PostMapping
    public CriancaVO salvar(@RequestBody CriancaVO novaCrianca) {
        return criancaService.inserir(novaCrianca);
    }

}
