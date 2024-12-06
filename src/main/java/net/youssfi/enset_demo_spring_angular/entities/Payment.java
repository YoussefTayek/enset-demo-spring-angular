package net.youssfi.enset_demo_spring_angular.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
@Entity
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private double amount;
    private PaymentType type;
    private PaymentStatus status;
    private String file;
    @ManyToOne   //Plusieurs paiements pour un étudiant
    private Student student;
}
