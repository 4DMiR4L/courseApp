package dao.impl;

import config.DatabaseConfig;
import dao.StudentDao;
import helper.LoggerHelper;
import model.StudentEntity;
import query.StudentSqlQuery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class StudentDaoImpl implements StudentDao {


    @Override
    public void save(StudentEntity studentEntity) {
        try (Connection con = DatabaseConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(StudentSqlQuery.INSERT_STUDENT)) {
            ps.setString(1, studentEntity.getName());
            ps.setString(2, studentEntity.getSurname());
            ps.setInt(3, studentEntity.getAge());
            ps.setDouble(4, studentEntity.getGpa());
            ps.executeUpdate();
            LoggerHelper.info("Student saved successfully");
        } catch (Exception e) {
            LoggerHelper.error(e.getMessage());
        }
    }

    @Override
    public List<StudentEntity> findAll() {
        return null;
    }

}
