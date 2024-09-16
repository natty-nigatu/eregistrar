package edu.mum.cs.cs425.eregistrar.repository;

import edu.mum.cs.cs425.eregistrar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
