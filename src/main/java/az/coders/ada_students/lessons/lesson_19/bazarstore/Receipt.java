package az.coders.ada_students.lessons.lesson_19.bazarstore;

public class Receipt {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Cashier cashier = new Cashier();

        System.out.println(cashier);
        System.out.println(customer);


        String[] list = {"Lays Kebab Chips", "Doritos Hot Corn", "Fanta Duses", "Mirinda Orange", "Alpengold Chocolate Oreo"};
        int paid = 20;

        double total = 0;

        for (int i = 0; i < list.length; i++) {
            list[i] = list[i].replace(" ", "");

            System.out.println(FoodAndPrice.valueOf(list[i]) + " " + FoodAndPrice.valueOf(list[i]).p);
            total += FoodAndPrice.valueOf(list[i]).p;
        }
        System.out.println("Total  " + total);
        System.out.println("----------------------------");
        System.out.println("Paid: " + paid);
        System.out.printf("Rest: %.2f \n", (paid - total));
        System.out.println("----------------------------");
        System.out.println("      Have A Nice Day!      ");


    }
}
