package ua.lviv.lgs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.ParticipantRepository;
import ua.lviv.lgs.domain.Participant;
import ua.lviv.lgs.service.ParticipantService;

@Service
public class ParcipantServiceImpl implements ParticipantService{

	@Autowired
	private ParticipantRepository participantRepository;
	
	@Override
	public Participant create(Participant participant) {
		
		return participantRepository.save(participant);
	}

	@Override
	public List<Participant> findAll() {
		
		return participantRepository.findAll();
	}

	@Override
	public Participant findById(Integer id) {
		
		return participantRepository.getOne(id);
	}

	@Override
	public Participant update(Participant participant) {
		
		return participantRepository.save(participant);
	}

	@Override
	public void deleteById(Integer id) {
		participantRepository.deleteById(id);
		
	}

}
