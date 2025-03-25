package console;

import controller.StudentController;
import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import dto.StudentDto;
import helper.ScannerHelper;
import service.StudentService;
import service.impl.StudentServiceImpl;

public class CourseConsole {
    static final StudentDao studentDao = new StudentDaoImpl();
    static final StudentService studentService = new StudentServiceImpl(studentDao);
    static final StudentController studentController = new StudentController(studentService);

    public static void run() {

        while (true){
            switch (ScannerHelper.getInt()){
                case 1:
                    saveStudent();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static void saveStudent() {
        StudentDto studentDto = new StudentDto();
        System.out.println("Enter student id, name, surname, age, gpa");
        studentDto.setId(ScannerHelper.getInt());
        studentDto.setName(ScannerHelper.getString());
        studentDto.setSurname(ScannerHelper.getString());
        studentDto.setAge(ScannerHelper.getInt());
        studentDto.setGpa(ScannerHelper.getDouble());
        studentController.save(studentDto);
    }
}
