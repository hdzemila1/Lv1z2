import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        for (int i=1; i<n; i++){
            if(divwownDig(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean divwownDig(int i){
        return i%digitSum(i)==0;
    }

    public static int digitSum(int i){
        int suma=0;
        while(i>0){
            suma+=i%10;
            i=i/10;
        }
        return suma;

    }
}