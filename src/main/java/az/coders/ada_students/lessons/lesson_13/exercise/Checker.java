package az.coders.ada_students.lessons.lesson_13.exercise;

import java.util.Arrays;

public class Checker {
    String target; // for search
    String[] jobName;
    String[] description;
    String[] salary;
    String[] email;

    String d;
    User user;

    public Checker(String target) {
        this.target = target;
    }

    public void setJobName(String[] jobName) {
        this.jobName = jobName;
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    public void setSalary(String[] salary) {
        this.salary = salary;
    }

    public void setEmail(String[] email) {
        this.email = email;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String checkDataWithNames(){
        for (int i = 0; i < 10; i++) { // 10 - numbers of  vacancy
            if(description[i].contains(target)) {
                d = description[i]; // string
                return d;
            }
        }
        return "";
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public String toString() {
        try {
            return "Vacancy: " + jobName[Arrays.asList(description).indexOf(checkDataWithNames())] + "\n" + // d = null
                    "Job Information and Candidate Requirements:\n " + checkDataWithNames() + "\n" + // d has value
                    "Salary: " + salary[Arrays.asList(description).indexOf(d)] + "\n" + // d has value
                    "Contact: " + email[Arrays.asList(description).indexOf(d)] + "\n" + // d has value
                    "Good luck in your future business!";
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return "";
    }
}
