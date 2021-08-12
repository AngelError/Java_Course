package az.coders.ada_students.lessons.lesson_19.education;

public class Person extends Student implements Talented{
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
    public String beAwarded() {
        return null;
    }

    @Override
    public String getHonorsDiploma() {
        return null;
    }

    @Override
    public String getOfferFromAbroad() {
        return null;
    }
}
