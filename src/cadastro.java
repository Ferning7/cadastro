//Importa bibliotecas
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class cadastro {
    public static void main(String[] args) {

        // variáveis de calendario, scanner e hora
        Scanner sc = new Scanner(System.in);
        Calendar cd = Calendar.getInstance();
        int hora = cd.get(Calendar.HOUR_OF_DAY);

        System.out.println(" ");

        // informa a data atual
        cd.set(2024, Calendar.MAY, 28);
        Date data = cd.getTime();
        DateFormat formataData = DateFormat.getDateInstance();


        // analisa a hora atual e imprime um bom dia, tarde ou noite
        if (hora > 6 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }

        System.out.println("Hoje é "+formataData.format(data));
        System.out.println(" ");

        // início do cadastro
        System.out.println("Seja bem vindo(a) à area de cadastro do usuário!");
        System.out.println(" ");

        // entrada de dados
        System.out.print("Insira seu Nome: ");
        String name = sc.next();
        System.out.print("Insira seu Sobrenome: ");
        String midname = sc.next();

        System.out.println("Insira sua data de nascimento dd/MM/yyyy");
        System.out.print("Dia: ");
        int day = sc.nextInt();
        System.out.print("Mes: ");
        int month = sc.nextInt();
        System.out.print("Ano: ");
        int year = sc.nextInt();

        System.out.print("Insira sua altura (x,xx): ");
        double altura = sc.nextDouble();

        System.out.print("Cor de pele: ");
        String color = sc.next();

        // converte o ano inserido para idade
        int age = 2024 - year;

        // converte o numero do mês para o nome do mês inserido
        String nameMonth = switch (month) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Mês Inválido";
        };

        System.out.println(" ");

        // saída de dados
        System.out.println("----- SUAS INFORMAÇÕES -----");
        System.out.println("Seu nome é: " + name + " " + midname);
        System.out.println("Sua idade: " + age);
        System.out.println("Sua altura:  " + altura);
        System.out.println("Sua cor de pele: " + color);
        System.out.println("Sua data de nascimento: " + day + " de " + nameMonth + " de " + year);


    }
}

