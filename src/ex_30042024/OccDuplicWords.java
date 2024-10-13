package ex_30042024;

public class OccDuplicWords {
    public static void main(String[] args) {

        String s = "Man is a word is of a rowdy man";
        s= s.toLowerCase();
        String[]  array = s.split(" ");
        for(int i=0;i<array.length;i++)
        {
            int count = 1;
            for (int j = i+1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                    array[j]="0";
                }
            }
            if(count>1 && array[i]!="0")
            {
                System.out.println("Occurence of the duplicate word,\""+array[i]+"\" = "+count);
            }

        }
        }
    }

