package service;

import model.entidade.CriancaVO;
import model.repository.CriancaRepository;
import org.springframework.stereotype.Service;

@Service
public class CriancaService {

    private CriancaRepository criancaRepository;


    public CriancaVO inserir(CriancaVO novaCrianca) {
        return criancaRepository.save(novaCrianca);
    }
}
