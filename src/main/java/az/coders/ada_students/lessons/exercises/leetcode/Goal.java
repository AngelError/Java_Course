package az.coders.ada_students.lessons.exercises.leetcode;

import java.util.Scanner;

public class Goal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();
        Solution3 class3 = new Solution3();
        System.out.println(class3.interpret(command));
    }
}

class Solution3 {
    public String interpret(String command) {
        if(command.contains("()"))
            command = command.replace("()", "o");
        if(command.contains("("))
            command = command.replace("(", "");
        if(command.contains(")"))
            command = command.replace(")", "");
        return command;
    }
}
