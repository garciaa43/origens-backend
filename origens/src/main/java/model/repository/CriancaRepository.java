package model.repository;

import model.entidade.CriancaVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;



@Repository
public interface CriancaRepository
        extends JpaRepository<CriancaVO, Long>,
        JpaSpecificationExecutor<CriancaVO> {
}
