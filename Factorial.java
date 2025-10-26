import java.util.Scanner;
public class Factorial {
    int n;
    private void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:-");
        n=sc.nextInt();
    }
    private void FactorialofaNumber(){
        int i=2;
        int fact = 1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("the factorial of "+n+ "is" +fact);
    }
    public static void main(String[] args){
        Factorial obj =new factorial();
        obj.input();
        obj.FactorialofaNumber();
    }
}