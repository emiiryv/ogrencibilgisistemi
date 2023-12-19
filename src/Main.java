import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mehmet Hoca","90501","TRH");
        Teacher t2 = new Teacher("Graham Bell","90502","FZK");
        Teacher t3 = new Teacher("Nevzat","90503","BIO");
        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji","101","BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Hasan","123","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,75,50);
        s1.isPass();

        Student s2 = new Student("Murat","243","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(50,35,42);
        s2.isPass();
    }
}
