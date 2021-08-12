package az.coders.ada_students.lessons.lesson_19;

public class List {
    String product;

    public List(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "List{" +
                "product='" + product + '\'' +
                '}';
    }
}
