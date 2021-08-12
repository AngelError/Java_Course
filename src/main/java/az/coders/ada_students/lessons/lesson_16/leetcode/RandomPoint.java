//package az.coders.ada_students.lessons.lesson_16.leetcode;
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.stream.DoubleStream;
//
//public class RandomPoint {
//    public static void main(String[] args) {
//        Solution obj = new Solution(1.0, 0.0, 0.0);
//        double[] param_1 = obj.randPoint();
//        System.out.println(Arrays.toString(param_1));
//    }
//}
//
//class Solution {
//    double r, x, y;
//    public Solution(double radius, double x_center, double y_center) {
//        r = radius;
//        x = x_center;
//        y = y_center;
//    }
//
//    public double[] randPoint() {
//        double[] num = new double[2];
//        // min == x - r
//        // max == x + r
//            num[0] = Math.random() * ((x+r) - (x-r)) + (x-r);
//            num[1] = Math.random() * ((y+r) - (y-r)) + (y-r);
//
//        return num;
//    }
//}
