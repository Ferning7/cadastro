//Importa bibliotecas

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
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
        System.out.println("Data de hoje: " + LocalDate.now());
        System.out.println("Horário de acesso: " + Time.valueOf(LocalTime.now()));

        System.out.println(" ");

        // analisa a hora atual e imprime um bom dia, tarde ou noite
        if (hora > 6 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }

        System.out.println(" ");

        // início do cadastro
        System.out.println("Seja bem vindo(a) à area de cadastro do usuário!");
        System.out.println(" ");

        // entrada de dados
        System.out.print("Insira seu Nome: ");
        String name = sc.next();
        String midname = sc.next();

        System.out.println("Insira sua data de nascimento: dd MM yyyy");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.print("Insira sua profissão: ");
        String pro = sc.next();
        String fi = sc.next();
        String ssao = sc.next();


        System.out.print("Insira sua altura (x,xx): ");
        double altura = sc.nextDouble();

        System.out.print("Nacionalidade: ");
        String nac = sc.next();

        System.out.print("Endereço: ");
        String rua = sc.next();
        String nameR = sc.next();
        String nameR2 = sc.next();

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

        sc.close();

        System.out.println(" ");


        // saída de dados
        System.out.println("--------- SUAS INFORMAÇÕES ---------");
        System.out.println(" ");
        System.out.println("Nome: " + name + " " + midname);
        System.out.println("Idade: " + age);
        System.out.printf("Profissão: %s %s %s %n", pro, fi, ssao);
        System.out.println("Data de nascimento: " + day + " de " + nameMonth + " de " + year);
        System.out.printf("Endereço:  %s %s %s %n", rua, nameR, nameR2);
        System.out.println("Nacionalidade: " + nac);
        System.out.println("Altura:  " + altura);



    }
}

