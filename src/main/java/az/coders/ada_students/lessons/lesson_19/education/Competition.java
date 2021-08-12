package az.coders.ada_students.lessons.lesson_19.education;

public enum Competition {
    BSCS("John", "Nick", "Monroe"),
    BAPA("Rozalie", "John", "Mike"),
    BAIS("Tom", "Angelina", "Steve");

    public String firstContestant;
    public String secondContestant;
    public String thirdContestant;

    Competition(String firstContestant, String secondContestant, String thirdContestant) {
        this.firstContestant = firstContestant;
        this.secondContestant = secondContestant;
        this.thirdContestant = thirdContestant;
    }
}
