package student;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> studenti = new ArrayList<>();
        List<Student> studentiPolozili = new ArrayList<>();
        Student student;

        while (true){
            System.out.println("Unesite podatke o studentima ili quit da izadjete: ");
            System.out.println("Unesite ime studenta: ");
            String ime = scanner.next();
            if (ime.equalsIgnoreCase("quit")){
                break;
            }
            System.out.println("Unesite prezime studenta: ");
            String prezime = scanner.next();
            if (prezime.equalsIgnoreCase("quit")){
                break;
            }

            System.out.println("Unesite ocenu studenta: ");
            int ocena = scanner.nextInt();
            if (("" + ocena).equalsIgnoreCase("quit")){
                break;
            }

            student = new Student(ime, prezime, ocena);
            studenti.add(student);

        }

        for (int i = 0; i < studenti.size(); i++) {
            if (studenti.get(i).getOcena() > 5){
                studentiPolozili.add(studenti.get(i));
            }
        }

        System.out.println("Svi studenti: " + studenti);
        System.out.println("Studenti koji su polozili: " + studentiPolozili);





    }


}
