import java.util.Scanner;
public class lines {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку a: ");
        String a = in.nextLine();
        System.out.print("Введите строку b: ");
        String b = in.nextLine();

        if(a.equals(b)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }
    }
}
