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
public class ContaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true)
    private int num;
    
    @Column
    private double saldo;
}
