package BancoAPIS.Services;

import BancoAPIS.Model.ContaEntity;
import BancoAPIS.Repositories.ContaRepository;
import org.springframework.stereotype.Service;

@Service
public class ContaService {
    private final ContaRepository contaRepo;

    public ContaService(ContaRepository contaRepo) {
        this.contaRepo = contaRepo;
    }

    public void SalvaConta(ContaEntity contaEnt) {
        contaRepo.saveAndFlush(contaEnt);
    }

    public void DeletaConta(ContaEntity contaEnt) {
        contaRepo.delete(contaEnt);
    }
}
