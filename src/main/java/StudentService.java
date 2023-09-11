import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

    public Student findById(String id) {
        Optional<Student> student = repo.findStudentById(id);
        if(student.isPresent()){
            return student.get();
        }
        throw new NoSuchElementException("Student mit der Id: " + id + " konnte nicht gefunden werden!");
    }
}
