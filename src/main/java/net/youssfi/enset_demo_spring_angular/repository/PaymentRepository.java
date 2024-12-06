package net.youssfi.enset_demo_spring_angular.repository;

import net.youssfi.enset_demo_spring_angular.entities.Payment;
import net.youssfi.enset_demo_spring_angular.entities.PaymentStatus;
import net.youssfi.enset_demo_spring_angular.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
   List<Payment> findByStudentCode(String code);
   List<Payment> findByStatus(PaymentStatus status);
   List<Payment> findByType(PaymentType type);
}
