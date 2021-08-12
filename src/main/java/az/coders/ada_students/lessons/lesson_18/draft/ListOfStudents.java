package az.coders.ada_students.lessons.lesson_18.draft;

public class ListOfStudents extends Student{

    private String mail;
    private String Account;

    public ListOfStudents(String name, String surname, int id, String mail, String account) {
        super(name, surname, id);
        this.mail = mail;
        Account = account;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    @Override
    public String toString() {
        return "Student: " + '\n' +
                "name: " + name + '\n' +
                "surname: " + surname + '\n' +
                "id: " + id + '\n' +
                "mail: " + mail + '\n' +
                "account: " + Account;
    }
}
