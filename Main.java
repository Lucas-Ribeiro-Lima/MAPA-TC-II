import java.util.Scanner;

/***
 * @author Lucas Ribeiro
 * @param args 
 * */

public class Main {
  public static void main(String[] args) {
    Calculator clt = new Calculator();
    Scanner sc = new Scanner(System.in);
    int option = 0;
    
    while (option != 6) {
      float result = 0;
      System.out.println("Calculadora - MAPA TOC II");
      System.out.println("Escolha a opcao: 1 -Adicao 2 -Subtracao 3 -Multiplicacao 4-Divisao 5-Potenciacao 6-Sair");
      option = sc.nextInt();

      if (option > 6 || option < 1) {
        System.out.println("Opcao invalida");
        continue;
      }

      if(option == 6) {
        System.out.println("Saindo...");
        break;
      }

      System.out.println("Digite o primeiro numero");
      float firstNumber = sc.nextFloat();
      System.out.println("Digite o segundo numero");

      float secondNumber = sc.nextFloat();
      switch (option) {
        case 1:
          result = clt.calculatePlus(firstNumber, secondNumber);
          break;
        case 2:
          result = clt.calculateMinus(firstNumber, secondNumber);
          break;
        case 3:
          result = clt.calculateTimes(firstNumber, secondNumber);
          break;
        case 4:
          result = clt.calculateDivide(firstNumber, secondNumber);
          break;
        case 5:
          result = clt.calculatePow(firstNumber, secondNumber);
          break;
        default:
          break;
      }
      System.out.println("Resultado: " + result);
    }
    sc.close();
  }
}
