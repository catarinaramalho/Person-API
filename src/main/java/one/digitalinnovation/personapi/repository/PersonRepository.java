package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {
}
