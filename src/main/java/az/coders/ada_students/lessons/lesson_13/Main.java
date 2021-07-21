package az.coders.ada_students.lessons.lesson_13;

public class Main {
    public static void main(String[] args) {
        Pet pets = new Pet();
        Human humans = new Human();

        pets.species = "dog";
        pets.nickname = "Rock";

        pets.age = 5;
        pets.trickLevel = 75;
        pets.habits = new String[]{"eat", "drink", "sleep"};

        String name = "Michael";
        humans.name = name;
        humans.surname = "Karleone";
        humans.year = 1977;
        humans.iq = 90;

        humans.pet = pets;

        humans.father = "Vito Karleone";
        humans.mother =  "Jane Karleone";

        System.out.println(pets);
        System.out.println(humans.toString());

    }
}
