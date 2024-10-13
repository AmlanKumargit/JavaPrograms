package ex_30042024;

public class SumofNumString {
    public static void main(String[] args) {
        String s="101K4u202a1d2s4fs12asd1231asd12as1";
        String temp = "0";
        int sum = 0;

        System.out.println("\nNumbers present in the string: \n");
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                temp+=c;
            }
            else if(temp!="0")//added this condition as 0s were getting printed as well
            {
                System.out.println(Integer.parseInt(temp)); // Every temp count shows individual digits(except the last)
                sum+=Integer.parseInt(temp);
                temp="0";

            }
        }
        System.out.println(Integer.parseInt(temp));//last number sequence
        System.out.println("\nSum of numbers in the string: "+(sum+Integer.parseInt(temp)));//added the last number sequence
    }
}
