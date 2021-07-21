package az.coders.ada_students.lessons.lesson_12;

public class Person {
    // icerisinde class members olur
    // fields
    // properties

    public String name;

    public String surname;

    public int age;

    public String gender;

    public void print() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(gender);

        System.out.println(this); // toString evez edir
    }

    // local var == method daxili
    // instance var == method daxilinde olmayan
    // this ile ayirmaq olar

    // what is class class members fields properties instance var or local var

    public boolean checkName(String name) {
//        return name.equals("Nadir");
        return this.name.equals(name);
    }

    @Override
    // alt + insert
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }



}
