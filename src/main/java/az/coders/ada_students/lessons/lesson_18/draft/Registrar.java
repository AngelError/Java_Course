package az.coders.ada_students.lessons.lesson_18.draft;

import java.util.Scanner;

public class Registrar {
    public static void main(String[] args) {
            Student student = new Student("Nadir", "Gasimzada", 11993);
//        System.out.println(student);

        String target = student.name;
        print(findByTarget(target));

        System.out.println("If the student's data is not found please enter 'Register' for registration, else 'Exit' for logging out!");
        Scanner scanner = new Scanner(System.in);
        String divider = scanner.nextLine();

        if(divider.equalsIgnoreCase("Exit")) {
            System.out.println("Successfully logging out!");
        }
        else if(divider.equalsIgnoreCase("Register")) {
            System.out.println("Student is not found!");
            Account account = new Account(student.name, student.surname, student.id);
            System.out.println(account);
        }
    }

    private static ListOfStudents[] findByTarget(String target) {
        az.coders.ada_students.lessons.lesson_18.draft.Data.loadData();

        ListOfStudents[] students = new ListOfStudents[3];
        for (int i = 0; i < az.coders.ada_students.lessons.lesson_18.draft.Data.list.length; i++) {
            if (az.coders.ada_students.lessons.lesson_18.draft.Data.list[i].getName().contains(target))
                students[i] = az.coders.ada_students.lessons.lesson_18.draft.Data.list[i];
        }
        return students;
    }

    private static String[] print(ListOfStudents[] arr) {
        for (ListOfStudents list : arr) {
            if (list != null) {
                System.out.println(list);
            }
        }
        return new String[0];
    }
}
