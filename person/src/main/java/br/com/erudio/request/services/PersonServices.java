package br.com.erudio.request.services;

import br.com.erudio.request.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {

    private AtomicLong counter = new AtomicLong();

    public Person findById(String id) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Leandro");
        person.setLastName("Costa");
        person.setAddress("Uberlândia - Minas Gerais -Brasil");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll() {
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            personList.add(person);
        }
        return personList;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName(i + ": First name");
        person.setLastName("Last name");
        person.setAddress("Some address in Brasil");
        person.setGender("Male");
        return person;
    }

    public Person create(Person person) {
        return person;
    }

    public Person update(Person person) {
        return person;
    }

    public void delete(String id) {

    }
}
