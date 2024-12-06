package net.youssfi.enset_demo_spring_angular.dtos;

import jakarta.persistence.*;
import lombok.*;
import net.youssfi.enset_demo_spring_angular.entities.PaymentStatus;
import net.youssfi.enset_demo_spring_angular.entities.PaymentType;
import net.youssfi.enset_demo_spring_angular.entities.Student;

import java.time.LocalDate;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class PaymentDTO {
    private Long id;
    private LocalDate date;
    private double amount;
    private PaymentType type;
    private PaymentStatus status;
}
