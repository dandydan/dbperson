package com.dandy.core;

import java.util.List;

public class PersonService {

    private PersonDao personDao;
 
    public PersonDao getPersonDao() {
        return personDao;
    }
 
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public boolean addPerson(Person person) {
        return getPersonDao().addPerson(person);
    }

    public boolean updatePerson(Person person){
        return getPersonDao().updatePerson(person);
    }
    
    public Person getPersonById(int personId){
        Person person = getPersonDao().getPersonById(personId);
        return person;
    }

    public void removePerson(Person person) {
        getPersonDao().removePerson(person);
    }

    public void removeContacts(Person person) {
        getPersonDao().removeContacts(person);
    }

    public List<PersonDTO> getPersons(String field, String searchText, String order) {
        return getPersonDao().getPersons(field, searchText, order);
    }
}
