package tn.esprit.spring.services;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.Mission;

public interface IMissionService {

	List<Mission> getallMissions();

	void deleteMission(int Id);

	Mission ajouterMission(Mission mission);

	Mission updateMission(Mission mission);

	public void affecterMissionADepartement(int missionId, int depId);

	Optional<Mission> FindMissionById(int id);

	
	
}
