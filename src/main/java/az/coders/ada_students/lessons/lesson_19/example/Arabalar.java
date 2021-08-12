package az.coders.ada_students.lessons.lesson_19.example;

public enum Arabalar {
    AUDI(200),
        BMW(190),
            OPEL(180),
                FIAT(160);

    public int hiz;

    Arabalar(int hiz) {
        this.hiz = hiz;
    }

    public int getHiz() {
        return hiz;
    }
}
