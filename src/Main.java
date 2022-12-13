import java.util.Scanner;

public class Main { public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int number;
    int sum=0;
System.out.println("Lütfen tam sayı giriniz:");
number = input.nextInt();
while(number!= 0){
    sum += number %10;
    number = number/10;

}

System.out.println("Yazdığınız sayının basamakları toplamı:" +sum );

}
}
