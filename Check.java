import java.util.Scanner;

public class Check {

    public static void main(String[] args){
        try (Scanner read = new Scanner(System.in)) {
            String text = read.nextLine();

            System.out.println(binaryCheck(text));
        }
    }

    public static Boolean binaryCheck(String text){
        //Boolean result = false;
        for (int i=0; i<text.length(); i++){
            if (text.charAt(i) == '0' || text.charAt(i) == '1'){
                continue;
            } else{
                System.out.println(text.charAt(i));
                return false;
            }
        }

        return true;


    }
}
