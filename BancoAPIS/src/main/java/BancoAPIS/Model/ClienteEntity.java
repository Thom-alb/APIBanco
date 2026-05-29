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
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true)
    private String CPF;

    @Column
    private String nome;
    
}