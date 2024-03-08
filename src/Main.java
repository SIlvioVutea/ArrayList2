import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    //    Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//    In questa classe avere i metodi pubblici per ottenere le informazioni.
//    Creare un ArrayList con 12 elementi e stamparlo in console.
//    Mettere in ordine la collezione e stampare il risultato
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>(12);
        studentsList.add(new Student("Aldo", 22));
        studentsList.add(new Student("Bruno", 21));
        studentsList.add(new Student("Carlo", 20));
        studentsList.add(new Student("Dario", 19));
        studentsList.add(new Student("Enrico", 18));
        studentsList.add(new Student("Flavio", 17));
        studentsList.add(new Student("Giovanni", 16));
        studentsList.add(new Student("Harry", 15));
        studentsList.add(new Student("Iginio", 14));
        studentsList.add(new Student("Luca", 13));
        studentsList.add(new Student("Matteo", 12));
        studentsList.add(new Student("Nunzio", 11));
        System.out.println(studentsList);
        studentsList.sort(Comparator.comparing(Student::getAge));
        System.out.println(studentsList);


    }
}