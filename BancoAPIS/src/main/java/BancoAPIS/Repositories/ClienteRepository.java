package BancoAPIS.Repositories;

import BancoAPIS.Model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;
public interface ClienteRepository extends JpaRepository<ClienteEntity,Integer> {
    
    Optional<ClienteEntity> findById(int id);

    List<ClienteEntity> findByNomeContainingIgnoreCase(String nome);
}
