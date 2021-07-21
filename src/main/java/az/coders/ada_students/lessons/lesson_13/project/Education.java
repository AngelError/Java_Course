package az.coders.ada_students.lessons.lesson_13.project;

public class Education {
    String university;
    int age;

    private static final String messageOne = " ,and is studying!";
    private static final String getMessageTwo = " ,and graduated!";


    public void setUniversity(String university) {
        this.university = university;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAge(int age) {
        if(21 - age >= 0) {
            return messageOne;
        }
        else
            return getMessageTwo;
    }

    @Override
    public String toString() {
        return "Education{" +
                ", age=" + age +
                "university='" + university + '\'' +
                getAge(age) +
                '}';
    }

}
