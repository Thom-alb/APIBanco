package BancoAPIS.Services;

import BancoAPIS.Model.ClienteEntity;
import BancoAPIS.Repositories.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepo;

    public ClienteService(ClienteRepository clienteRepo){
        this.clienteRepo = clienteRepo;
    }
        public void SalvaConta(ClienteEntity clienteEnt) {
        clienteRepo.saveAndFlush(clienteEnt);
    }

    public void Deletacliente(ClienteEntity clienteEnt) {
        clienteRepo.delete(clienteEnt);
    }
    
    public ClienteEntity BuscarPorId(int id){
        return clienteRepo.findById(id)
        .orElseThrow(() -> new RuntimeException("Cliente não encontrado com o ID: " + id));
    }
}
