import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentRepoTest {
    @Test
    void useFindByIdAndReturnStudentWithTheId() {
        StudentService studentService = new StudentService();
        Student newStudent = Student.builder()
                .name("Maria")
                .subject("Englisch")
                .build();

        Student testStudent = studentService.addNewStudent(newStudent);

        Student actual = studentService.findById(testStudent.id());

        Assertions.assertEquals(testStudent, actual);
    }
}

