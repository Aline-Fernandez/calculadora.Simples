package calculadoraSimples;

import java.util.Scanner;
public class CalculaSimples {

    public static void main(String[] args) {
        double n1, n2;
        double soma, subtracao, multiplicacao, divisao;
        int opcao;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe o primeiro valor: ");
        n1 = entrada.nextDouble();
        System.out.println("Informe o segundo valor: ");
        n2 = entrada.nextDouble();

        System.out.println("SELECIONE UMA OPERAÇÃO");
        System.out.println("[1] - SOMAR");
        System.out.println("[2] - SUBTRAIR");
        System.out.println("[3] - MULTIPLICAR");
        System.out.println("[4] - DIVIDIR");
        System.out.println("DIGITE SUA OPÇÃO: ");
        opcao = entrada.nextInt();

        switch(opcao) {
            case 1:
                soma = n1 + n2;
                System.out.println("Reultado da soma: " + soma);
                break;

            case 2:
                subtracao = n1 - n2;
                System.out.println("Resultado da subtração: " + subtracao);
                break;

            case 3:
                multiplicacao = n1 * n2;
                System.out.println("Resultado da multiplicação" + multiplicacao);
                break;

            case 4:
                if (n1 < n2) {
                    System.out.println("!!!!Primeiro número (dividendo) precisa ser maior que divisor!!!! ");
                } else {
                    divisao = n1 / n2;
                    System.out.println("Resultado da divisão" + divisao);
                }
                break;

            default:
                System.out.println("OPERAÇÃO INVÁLIDA!!!!");
        }



        }

    }


