package controller;


import dto.StudentDto;
import service.StudentService;

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void save(StudentDto studentDto) {
        studentService.save(studentDto);
    }
}
