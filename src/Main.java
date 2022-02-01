import com.github.eduumach.bootcamp.domain.Bootcamp;
import com.github.eduumach.bootcamp.domain.Course;
import com.github.eduumach.bootcamp.domain.Dev;
import com.github.eduumach.bootcamp.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course0 = new Course("curso de java", "descrição curso de java", 8);
        Course course1 = new Course("curso de python", "descrição curso de python", 3);

        Mentoring mentoring0 = new Mentoring("mentoria de java", "descrição mentoria java", LocalDate.now());

        /*System.out.println(course0);
        System.out.println(course1);
        System.out.println(mentoring0);*/

        Bootcamp bootcamp = new Bootcamp("Bootcamp java", "Descrição do bootcamp java");
        bootcamp.getContents().add(course0);
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(mentoring0);

        Dev dev0 = new Dev("Eduardo");
        dev0.registerBootcamp(bootcamp);
        dev0.progress();
        System.out.println("Conteudos Incritos Edu: " + dev0.getSubscribedContent());
        System.out.println("Conteudos Concluidos Edu: " + dev0.getCompletedContents());
        System.out.println("XP: " + dev0.calculateTotalXp());

        System.out.println("--------");

        Dev dev1 = new Dev("Maria");
        dev1.registerBootcamp(bootcamp);
        dev1.progress();
        dev1.progress();
        dev1.progress();
        System.out.println("Conteudos Incritos Maria: " + dev1.getSubscribedContent());
        System.out.println("Conteudos Concluidos Maria: " + dev1.getCompletedContents());
        System.out.println("XP: " + dev1.calculateTotalXp());

    }
}
