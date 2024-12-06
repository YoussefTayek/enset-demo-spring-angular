package net.youssfi.enset_demo_spring_angular.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity  //Pour que ce soit une entité JPA il faut mettre l'annotation @Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder //Annotation lombock
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    @Column(unique = true) //Pour que le code de l'etudiant soit unique comme ça on peut pas avoir dans la base de données deux étudiants qui ont le même code
    private String code;
    private String programId;
    private String photo;
}
