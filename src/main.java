import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Kac tane sayi gireceksiniz : ");
        int count = input.nextInt();
        int i = 1 ;
        int min=1,max=1;
        do{
            System.out.println("Sayiyi giriniz : ");
            int n = input.nextInt();
        i++;
        if (n>max){
            max = n;
        }
        if (n < min){
                min = n;
            }
            System.out.println("En buyuk sayi: " + max);
            System.out.println("En kucuk sayi: " + min);
        }while (i<=count);
    }
}
