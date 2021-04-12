package ua.lviv.lgs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.domain.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Integer>{

}
