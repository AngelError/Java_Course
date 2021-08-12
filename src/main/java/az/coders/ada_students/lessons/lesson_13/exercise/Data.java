package az.coders.ada_students.lessons.lesson_13.exercise;

public class Data {
    String name;
    String surname;
    String fathername;
    int age;
    String specialty;
    int internship;
    String language;
    String address;

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

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String pecialty) {
        this.specialty = pecialty;
    }

    public String getInternship() {
        if (internship > 0) {
            return internship + "year!";
        } else
            return "Inexperienced!";
    }

//    public Data() {
//        System.out.println("hello");
//    }

    public void setInternship(int internship) {
        this.internship = internship;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Applicant: " + surname + " " + name + " " + fathername +
                "\n" + "specialty applied for: " + specialty +
                "\n" + "Applicant's experience: " + getInternship() +
                "\n" + "Applicant's age: " + age +
                "\n" + "Applicant's better-language-skill : " + language +
                "\n" + "Applicant's address : " + address;
    }
}
