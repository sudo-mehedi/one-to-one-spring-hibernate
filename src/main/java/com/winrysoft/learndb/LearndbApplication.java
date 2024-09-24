package com.winrysoft.learndb;

import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.winrysoft.learndb.entity.Address;
import com.winrysoft.learndb.entity.Person;
import com.winrysoft.learndb.repository.AddressRepository;
import com.winrysoft.learndb.repository.PersonRepository;
import com.winrysoft.learndb.services.PeropleService;

@SpringBootApplication
public class LearndbApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearndbApplication.class, args);
	}

	@Autowired
	PeropleService peropleService;

	@Bean
	CommandLineRunner commandLineRunner(AddressRepository addressRepository, PersonRepository personRepository) {
		return runner -> {

			// Person Create with address
			// Person person = new Person("Hasn", "admin@h.com");

			// person.setAddress((new Address("Mollaparaa", "Barishal;", "BDs")));

			// personRepository.save(person);
			// Find person

			// Optional<Person> person = personRepository.findById(1);

			// if (person.isPresent()) {
			// 	System.out.println("This is a person " + person.get().getAddress().getCountry());
			// 	Person p = person.get();
			// 	Address address = p.getAddress();
			// 	address.setCountry("No BD");

			// 	p.setAddress(address);

			// 	personRepository.save(p);

			// } else {
			// 	System.out.println("No person found");
			// }

			// Address address = addressRepository.findById(1).get();
			
			// System.out.println(address.getPerson().getName());

			// Person person = address.getPerson();

			// person.setName("Mehedi Hasan");
			// address.setPerson(person);
			// personRepository.save(person);
			// personRepository.save(new Person("Test name", "admin@test.com"));
			// Optional<Person> p = personRepository.findById(1);
			// if(p.isPresent()){
			// System.out.println(p.get().getName());
			// }else{
			// System.out.println("Hello");
			// }

		};
	}

}
