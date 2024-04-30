package ex_30042024;

public class Lab001 {
    public static void main(String[] args) {
        int x = 10;
        double y = 12.4;
        double z = 56.78;
        double max = (x>y) ? ((x>z)?x:z):((y>z)?y:z);
        System.out.println("Maximum number = "+max);
    }
}
