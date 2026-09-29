package tn.esprit.autolocapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAgence;

    String nom;
    String ville;
    String adresse;
    String telephone;

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    List<Vehicule> vehicules;

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    List<Employe> employes;
}