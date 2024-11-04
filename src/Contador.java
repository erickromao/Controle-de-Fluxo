import java.util.Scanner;

public class Contador {

    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type the first value: ");
        int n1 = scan.nextInt();

        System.out.print("Type the second value: ");
        int n2 = scan.nextInt();

        try{
            int contt = cont(n1,n2);

            for(int i=1; i<=contt; i++){
                System.out.println("Imprimindo o número "+i);
            }

        }catch(ParametrosInvalidosException e){
            System.out.print("O segundo parâmetro deve ser maior que o primeiro.");
        }

    }

    static int cont(int n1, int n2) throws ParametrosInvalidosException {

            if(n1>n2){
                throw new ParametrosInvalidosException();
            }
            return n2-n1;
    }

}
