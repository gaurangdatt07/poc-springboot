package com.poc.backendApp.service;

import com.poc.backendApp.model.Address;
import com.poc.backendApp.model.Gender;
import com.poc.backendApp.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PocService {


    public ResponseEntity<List<Student>> getAllStudents() {
         Student student1 = new Student("1","gaurang","gaurang@mail.com","9876543210",
                 new Address("bangalore","karnataka","india","134114"), Gender.MALE);
         Student student2 =new Student("2","gunavina","gunavina@mail.com","1234567890",
                 new Address("chandigarh","chandigarh","india","134114"), Gender.FEMALE);
        return  new ResponseEntity<>(List.of(student1,student2), HttpStatus.OK);
    }

    public ResponseEntity<Student> getStudentById(String name) {
        Student student = new Student("1",name,"gaurang@mail.com","9876543210",
                new Address("bangalore","karnataka","india","134114"), Gender.MALE);
        return new ResponseEntity<>(student, HttpStatus.FOUND);
    }

    public ResponseEntity<Student> addStudent(Student student) {
        student.setId("1");
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }

    public ResponseEntity<Student> removeStudent(String id) {
        Student student = new Student(id, "gaurang", "gaurang@mail.com", "9876543210",
                new Address("bangalore", "karnataka", "india", "134114"), Gender.MALE);
        return new ResponseEntity<>(student, HttpStatus.GONE);
    }
}
