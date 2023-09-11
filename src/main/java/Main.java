import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);
        try{
            String id = savedStudent.id();
            Student findStudent = studentService.findById(id);
            System.out.println("Student mit der Id: " + id + " " + findStudent);
        } catch (NoSuchElementException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Ein unerwarteter Fehler ist aufgetrehten!");
            System.out.println(e);
        }
    }
}
