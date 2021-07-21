package az.coders.ada_students.lessons.lesson_13;

import java.util.Arrays;

public class Pet {

    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String[] habits;

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond(String nickname) {
        System.out.println("Hello, owner. I am - " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return species + '{' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    public void getPetName(String species, String nickname) {
        System.out.println(species);
        System.out.println(nickname);
    }

    public void getAllFields(int age, int trickLevel, String[] habits ) {
        System.out.println(age);
        System.out.println(trickLevel);
        System.out.println(Arrays.toString(habits));
    }
}
