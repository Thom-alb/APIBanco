package BancoAPIS.Repositories;

import BancoAPIS.Model.ContaEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface ContaRepository extends JpaRepository<ContaEntity,Integer>{
    Optional<ContaEntity> findByNum(int num );



    @Transactional
    void deleteById(int Id);
}
