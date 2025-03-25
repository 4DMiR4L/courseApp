package dao;

import model.StudentEntity;

import java.util.List;

public interface StudentDao {

    void save(StudentEntity studentEntity);

    List<StudentEntity> findAll();
}
