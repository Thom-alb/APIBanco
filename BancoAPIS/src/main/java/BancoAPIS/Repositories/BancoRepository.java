package BancoAPIS.Repositories;

import BancoAPIS.Model.BancoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;
public interface BancoRepository extends JpaRepository<BancoEntity,Integer> {
    
    Optional<BancoEntity> findById(int id);

    List<BancoEntity> findByNomeContainingIgnoreCase(String nome);

    Optional<BancoEntity> findByCodigo(int codigo);

}
