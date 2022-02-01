import com.github.eduumach.bootcamp.domain.Course;
import com.github.eduumach.bootcamp.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course0 = new Course("curso de java", "descrição curso de java", 8);
        Course course1 = new Course("curso de python", "descrição curso de python", 3);

        Mentoring mentoring0 = new Mentoring("mentoria de java", "descrição mentoria java", LocalDate.now());

        System.out.println(course0);
        System.out.println(course1);
        System.out.println(mentoring0);


    }
}
