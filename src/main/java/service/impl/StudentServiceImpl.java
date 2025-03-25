package service.impl;

import dao.StudentDao;
import dto.StudentDto;
import helper.LoggerHelper;
import model.StudentEntity;
import service.StudentService;

public class StudentServiceImpl  implements StudentService {

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void save(StudentDto studentDto) {
        if (studentDto.getAge()<17) {
            LoggerHelper.error("Student age is less than 17");
            return;
        }
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDto.getId());
        studentEntity.setName(studentDto.getName());
        studentEntity.setSurname(studentDto.getSurname());
        studentEntity.setAge(studentDto.getAge());
        studentEntity.setGpa(studentDto.getGpa());
        studentDao.save(studentEntity);
    }
}
