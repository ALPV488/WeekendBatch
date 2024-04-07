package Controller;

import entity.Person;

public interface PersonServer {
	
	public String addPerson(Person p);
	
	public String deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();
}
