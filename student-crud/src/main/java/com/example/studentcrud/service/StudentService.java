package com.example.studentcrud.service;

import com.example.studentcrud.model.Student;
import com.example.studentcrud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Optional<Student> getById(Long id) {
        return repo.findById(id);
    }

    public Student create(Student student) {
        return repo.save(student);
    }

    public Student update(Long id, Student updatedStudent) {
        return repo.findById(id).map(student -> {
            student.setName(updatedStudent.getName());
            student.setAge(updatedStudent.getAge());
            student.setEmail(updatedStudent.getEmail());
            return repo.save(student);
        }).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
