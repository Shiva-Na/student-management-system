package com.example.demo;

import com.example.demo.exception.StudentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(
                        "Student with id " + id + " not found"
                ));
    }

    public Student updateStudent(int id, Student updateStudent){
        Student existingStudent = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student with id" +id+ "not found"));

        existingStudent.setName(updateStudent.getName());
        existingStudent.setAge(updateStudent.getAge());
        existingStudent.setCity(updateStudent.getCity());

        return studentRepository.save(existingStudent);
    }


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
