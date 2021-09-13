package com.etiqa.school;
import org.springframework.data.repository.CrudRepository;
import com.etiqa.school.Student;


public interface StudentRepository extends CrudRepository<Student, Integer> {

}