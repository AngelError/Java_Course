package az.coders.ada_students.lessons.lesson_19.education;

public class Contestant {
    String contestantName;

    String contestantSurname;

    String contestantFatherName;

    int studentID;

    double studentGPA;

    public String getContestantName() {
        return contestantName;
    }

    public void setContestantName(String contestantName) {
        this.contestantName = contestantName;
    }

    public String getContestantSurname() {
        return contestantSurname;
    }

    public void setContestantSurname(String contestantSurname) {
        this.contestantSurname = contestantSurname;
    }

    public String getContestantFatherName() {
        return contestantFatherName;
    }

    public void setContestantFatherName(String contestantFatherName) {
        this.contestantFatherName = contestantFatherName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }

    public Contestant(String contestantName, String contestantSurname, String contestantFatherName, int studentID, double studentGPA) {
        this.contestantName = contestantName;
        this.contestantSurname = contestantSurname;
        this.contestantFatherName = contestantFatherName;
        this.studentID = studentID;
        this.studentGPA = studentGPA;
    }
}
