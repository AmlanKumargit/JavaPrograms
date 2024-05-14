package ex_14052024;
//Maximum among 2D array elements
public class Assignment001 {
    public static void main(String[] args) {
        int[][] arr= {
                {9,2,3},
                {4,5,6},
                {7,8,1}
        };
        int max=0;
        for(int i= 0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                 if(arr[i][j]>max)
                     max=arr[i][j];
            }
        }
        System.out.println("Maximum: "+max);
    }
}
