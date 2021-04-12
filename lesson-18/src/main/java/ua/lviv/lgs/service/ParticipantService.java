package ua.lviv.lgs.service;

import java.util.List;

import ua.lviv.lgs.domain.Participant;

public interface ParticipantService {

	Participant create(Participant participant);
	List<Participant> findAll();
	Participant findById(Integer id);
	Participant update(Participant participant);
	void deleteById(Integer id);
	
}
