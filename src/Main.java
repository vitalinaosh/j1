import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть оцінку");
        final String s1 = scanner.nextLine();
        int a = Integer.parseInt(s1);
        if (a<=100&&a>=90){
            System.out.println("A");
        }
        else if (a<=90&&a>=80){
            System.out.println("B");
        }
        else if (a<=80&&a>=70) {
            System.out.println("C");
        }
        else if (a<=70&&a>=60){
            System.out.println("D");
        }
        else if (a<60&&a>=0){
            System.out.println("F");}
        else if (a>100||a<0){
            System.out.println("щось пішло не так");}











    }
}