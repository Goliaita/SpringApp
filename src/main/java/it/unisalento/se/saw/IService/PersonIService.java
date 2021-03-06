package it.unisalento.se.saw.IService;

import java.util.List;

import it.unisalento.se.saw.domain.Person;
import it.unisalento.se.saw.dto.PersonDto;

public interface PersonIService {
	public PersonDto findById(Integer id);
	public void savePerson(PersonDto personDto);
	public void updatePerson(PersonDto personDto, Integer id);
	public void deletePersonById(Integer id);
	public void deleteAllPersons();
	public List<PersonDto> findAllPersons();
	public Person findByMail(String email);
}