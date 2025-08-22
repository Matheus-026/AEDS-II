import java.util.Scanner;

public class Main{

    public static boolean fim(String stop){
        boolean fim = false;
        if(stop.length() == 3 && stop.charAt(0) == 'F' && stop.charAt(1) == 'I' && stop.charAt(2) == 'M'){
            fim = true;
        }
        return fim;
    }

    public static String ciframento(String str){
        String cifra = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) < 127){
                cifra =  cifra + (char)(str.charAt(i) + 3);
            }else{
                cifra = cifra + str.charAt(i);
            }
        }
        return cifra;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;
        str = scanner.nextLine();
        while(!fim(str)){
            System.out.println(ciframento(str));
            str = scanner.nextLine();
        }
    }
}