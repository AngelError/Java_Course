package az.coders.ada_students.lessons.lesson_15.project;

public class Checker {
    String target;
    String searcher;

    public Checker(String target) {
        this.target = target;
    }

    Vacancy vacancy = new Vacancy();

    public String setSearcher(String searcher) {
        for (int i = 0; i < vacancy.str.length; i++) {
            this.searcher = vacancy.str[i];
            if (checkVacancy())
                return vacancy.str[i];
        }
        return searcher;
    }

    public boolean checkVacancy() {

        return this.searcher.contains(this.target);
    }

    @Override
    public String toString() {
        return "Checker{" +
                "searcher='" + searcher + '\'' +
                '}';
    }
}
