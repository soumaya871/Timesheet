package tn.esprit.spring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Mission;


public interface MissionRepository extends CrudRepository<Mission, Integer> {



}
