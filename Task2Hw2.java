package DomashkiJava.DomJava1;


import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class Task2Hw2 {
    //К калькулятору из предыдущего дз добавить логирование.
    public static void main(String[] args) throws SecurityException, IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            Logger logger = Logger.getLogger(Task2Hw2.class.getName());
            FileHandler fn = new FileHandler("log.xml");
            logger.addHandler(fn);

            XMLFormatter xml = new XMLFormatter();
            fn.setFormatter(xml);

            double res;
            System.out.print("Введите число n: ");
            double n = scanner.nextDouble();
            System.out.print("Введите действие (+, -, /, *): ");
            char q = scanner.next().charAt(0);
            System.out.print("Введите число m: ");
            double m = scanner.nextDouble();

            switch(q){
                case '+': res = n + m;
                   break;
                case '-': res = n - m;
                   break;
                case '*': res = n * m;
                   break;
                case '/': res = n / m;
                   break;
                default:  System.out.println("Недопустимое действие");
                   return;
             }
             System.out.printf(n + " " + q + " " + m + " = " + res);
        }
}
    
    
}

