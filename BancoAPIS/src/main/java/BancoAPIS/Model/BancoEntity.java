package BancoAPIS.Model;
import jakarta.persistence.*;
import lombok.*;

@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@Builder
@Table
@Entity
public class BancoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private int codigo;
    
    @Column
    private String nome;    

    @Column(unique = true)
    private String cnpj;
}
