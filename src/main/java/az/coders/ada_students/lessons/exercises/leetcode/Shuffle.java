package az.coders.ada_students.lessons.exercises.leetcode;

import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "aiohn";
        int[] indices = {3,1,4,2,0};

        Solution2 class2 = new Solution2();
        System.out.println(class2.restoreString(s,indices));
    }
}

class Solution2 {
    public String restoreString(String s, int[] indices) {
//        if(s.length() == indices.length) {
//            for (int index : indices) System.out.print((s.charAt(index)));
//        }
//        return restoreString(s,indices);
//

        //converting char to string
        // Character.toString
        // String.valueOf(c)
        //copyValueOf

        String str = "";
        if(s.length() == indices.length) {
            for (int i = 0; i < indices.length; i++ ) {
//                str = String.copyValueOf(s.charAt(indices[i]), 0, indices.length);
                str = String.valueOf(s.charAt(indices[i]));
            }
        }
        return str;


//        int length = indices.length;
//        char[] newString = new char[length];
//        for (int i = 0; i < indices.length; i++ )
//            newString[indices[i]] = s.charAt(i);
//        return new String(newString);
    }

}
