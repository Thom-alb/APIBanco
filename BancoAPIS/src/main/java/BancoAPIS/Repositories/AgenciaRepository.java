package BancoAPIS.Repositories;

import BancoAPIS.Model.AgenciaEntity;
import BancoAPIS.Model.BancoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;

public interface AgenciaRepository extends JpaRepository<AgenciaEntity, Integer> {
    Optional<AgenciaEntity> findById(int id);
    Optional<AgenciaEntity> findByNum(int num );

    List<AgenciaEntity> findByBancoEntities(BancoEntity bancoEntity);
}
