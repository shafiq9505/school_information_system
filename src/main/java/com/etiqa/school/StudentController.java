package com.etiqa.school;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path="/etiqa")
public class StudentController {
  @Autowired
  private StudentRepository studentRepository;

  @PostMapping(path="/add")
  public @ResponseBody String addStudent (@RequestBody  Student n) {
    studentRepository.save(n);
    return "Student Information Saved!";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Student> getAllUsers() {
    return studentRepository.findAll();
  }
  
  @GetMapping(path="/delete")
  public @ResponseBody String deleteStudent (@RequestParam Integer id) {
    studentRepository.deleteById(id);
    return "Student Successfully Deleted!";
  }
  
  @GetMapping(path="/edit")
  public @ResponseBody String editStudent (@RequestParam Integer id, String name) {
	Student n = studentRepository.findById(id).get();
	n.setStudentName(name);
	studentRepository.save(n);
    return "Student Successfully Updated!";
  }
  
  @GetMapping(path="/find")
  public @ResponseBody Optional<Student> findStudentById (@RequestParam Integer id) {
    return studentRepository.findById(id);
  }
}