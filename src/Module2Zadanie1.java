import javax.management.remote.rmi._RMIConnection_Stub;

public class Module2Zadanie1 {
    public static void main(String[] args) {
        int number1 = 345234;
        int number2 = 34532423;
        int number3 = 213421;
        int number4 = 23424512;

        int suma1 = number1 + number2;
        int suma2 = number3 + number4;


        if (suma1 % 2 == 0 && suma2 % 2 ==0)
             System.out.println("suma wszystkich liczb jest parzysta");
        else
            System.out.println("suma wszystkich liczb jest nieparzysta");


    }


}
