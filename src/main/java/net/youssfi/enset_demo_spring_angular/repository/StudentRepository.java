package net.youssfi.enset_demo_spring_angular.repository;

import net.youssfi.enset_demo_spring_angular.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//directive de jpaRepository, alors l'entité qu'on va gérer est Student et le id est de type String
public interface StudentRepository extends JpaRepository<Student,String> {
    Student findByCode(String code);
    //méthode qui retourne la liste des étudiants d'une filiale donnée
    List<Student> findByProgramId(String programId);
}
