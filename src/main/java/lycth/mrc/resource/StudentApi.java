package lycth.mrc.resource;

import lombok.extern.slf4j.Slf4j;
import lycth.mrc.dto.StudentDto;
import lycth.mrc.entity.StudentEntity;
import lycth.mrc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@CrossOrigin(origins = "https://localhost:8081")
public class StudentApi {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/students")
    public ResponseEntity<StudentDto> getAllStudents(){
        try {
            Iterable<StudentEntity> students  = studentRepository.findAll();
            return new ResponseEntity<StudentDto>((StudentDto) students, HttpStatus.OK);
        }catch (Exception e){
            log.error(e.getMessage(),e);
            return new ResponseEntity<StudentDto>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/students")
    public ResponseEntity<StudentEntity> createStudents(@RequestBody StudentEntity student){
            try {
                StudentEntity savedStudent = studentRepository.save(student);
                return new ResponseEntity<StudentEntity>(savedStudent, HttpStatus.OK);
            } catch(Exception ex) {
                log.error(ex.getMessage(), ex);
                return new ResponseEntity<StudentEntity>(HttpStatus.BAD_REQUEST);
            }
    }
}
