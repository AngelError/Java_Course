package az.coders.ada_students.lessons.lesson_17.registration;

public class Person {
    String name;
    String surname;
    String fatherName;
    String gender;
    int age;
    String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String  toString() {
        return "Registered\n" +
                "Name :" + name + '\n' +
                "Surname: " + surname + '\n' +
                "FatherName: " + fatherName + '\n' +
                "Gender: " + gender + '\n' +
                "Age: " + age + '\n' +
                "Position: " + position + '\n';
    }
}
