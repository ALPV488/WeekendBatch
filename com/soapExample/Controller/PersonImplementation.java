package Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import entity.Person;

public class PersonImplementation implements PersonServer{
	
	private static Map<Integer,Person>  persons = new HashMap<Integer,Person>();

	@Override
	public String addPerson(Person p) {
		
		if(persons.get(p.getId())!=null) return "Please enter new id";
		
		persons.put(p.getId(), p);
		
		return "Your details are injected succesfully";
	}

	@Override
	public String deletePerson(int id) {
		if(persons.get(id)==null) return "Please enter new id";
		
		persons.remove(id);
		return "your details are deleted successfully";
	}

	@Override
	public Person getPerson(int id) {
		
		return persons.get(id);
	}

	@Override
	public Person[] getAllPersons() {
		Set<Integer> ids = persons.keySet();
		
		Person[] p = new Person[ids.size()];
		
		int i = 0;
		
		for(Integer id:ids) {
			p[i] = persons.get(id);
			i++;
		}
		
		
		return p;
	}

}
