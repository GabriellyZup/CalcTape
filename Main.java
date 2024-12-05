import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner é input com validacao
        ArrayList<String> tape = new ArrayList<>(); // < >

        System.out.println("Boas vindas ao CalcTape");

        while (true) { //loop aqui
            int num1, num2; //variaveis
            String operador;
            System.out.println("Digite o primeiro número: ");
            num1 = scanner.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = scanner.nextInt();
            System.out.println("Digite o operador (+, -, *, /):");
            operador = scanner.next();

            System.out.println("Você inseriu: " + num1 + " " + operador + " " + num2);


            if (operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")) {
                //verif operador - if prossiga

                switch (operador) {
                    case "+":
                        int sum = num1 + num2;
                        System.out.println("Resultado: " + sum);
                        tape.add(num1 + "+" + num2 + " = " + sum);
                        break;
                    case "-":
                        int sub = num1 - num2;
                        System.out.println("Resultado: " + sub);
                        tape.add(num1 + "-" + num2 + " = " + sub);
                        break;
                    case "*":
                        int mult = num1 * num2;
                        System.out.println("Resultado: " + mult);
                        tape.add(num1 + "+" + num2 + " = " + mult);
                        break;
                    case "/":
                        if (num2 != 0) {
                            int div = num1 / num2;
                            System.out.println("Resultado: " + div);
                            tape.add(num1 + "/" + num2 + " = " + div);
                        } else {
                            System.out.println("Divisão por Zero não é permitida.");
                        }
                        break;
                }
                System.out.println("Fita: "); //imprime fita
                for (String operation : tape) {
                    System.out.println(operation);
                }
            } else {
               System.out.println("Operador Inválido, tente novamente.");
            }
            System.out.println("Digite 'exit' para sair ou pressione Enter para continuar.");
            scanner.nextLine();
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("exit")) {
                break;
            }
        }
        scanner.close();
        System.out.println("Encerrando o programa..... Até logo!");
    }
}//finish