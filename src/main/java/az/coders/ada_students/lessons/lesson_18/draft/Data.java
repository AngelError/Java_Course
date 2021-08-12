package az.coders.ada_students.lessons.lesson_18.draft;

public class Data {

    public static final ListOfStudents[] list = new ListOfStudents[3];

    public static void loadData() {
        list[0] = new ListOfStudents("Nadir", "Jabbarli", 12123, "NJabbarli12123@ada.edu.az", "NJabbarli12123");
        list[1] = new ListOfStudents("Toghrul", "Pashazada", 7944, "TPashazada7944@ada.edu.az", "TPashazada7944");
        list[2] = new ListOfStudents("Gozal", "Alizada", 12123, "GAlizada12107@ada.edu.az", "GAlizada12107");
    }
}
