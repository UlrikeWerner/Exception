import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentServiceTest {
    @Test
    void useFindByIdAndReturnStudentWithTheId() {
        StudentService studentService = new StudentService();
        Student newStudent = Student.builder()
                .name("Maria")
                .subject("Englisch")
                .build();

        Student testStudent = studentService.addNewStudent(newStudent);

        try{
            Student actual = studentService.findById(testStudent.id());
            Assertions.assertEquals(testStudent, actual);
        } catch(NoSuchElementException e){
            System.out.println("Es sollte nicht ausgeführt werden.");
        } catch (Exception e){
            System.out.println("Und das sollte überhaupt nicht passieren! Unerwarteter Fehler!");
        }
    }

    @Test
    void useFindByIdAndGetNoSuchElementException() {
        StudentService studentService = new StudentService();

        assertThrows(NoSuchElementException.class, () -> studentService.findById("testId123"));
    }
}
