package az.coders.ada_students.lessons.lesson_19.simple;

public class Person extends Student implements Talented {
    String name;
    String surname;
    String fatherName;

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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return  "Student : " + name + " " + surname + " " + fatherName + '\n' +
                "Id : " + getId() + '\n' +
                "Average GPA : " + getAverageGPA() + '\n' +
                beAwarded() + '\n' + getHonorsDiploma() + '\n' + getOfferFromAbroad();
    }


    @Override
    public String beAwarded() {
        return name + " is not awarded!";
    }

    @Override
    public String getHonorsDiploma() {
        return name + " has a school-level honors degree!";
    }

    @Override
    public String getOfferFromAbroad() {
        return name + " have not receive any offer from abroad!";
    }

    @Override
    public void beAwarded(String s) {
        System.out.println(s);
    }
}
