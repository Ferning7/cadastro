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

        double cem = 100.00;
        System.out.println(" ");

        // informa a data atual
        cd.set(2024, Calendar.MAY, 28);
        Date data = cd.getTime();
        DateFormat formataData = DateFormat.getDateInstance();
        System.out.println(formataData.format(data));

        // analisa a hora atual e imprime um bom dia, tarde ou noite
        if (hora > 6 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }

        // início do cadastro
        System.out.println("Bem vindo(a) à area de cadastro do usuário!");
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

        System.out.print("Insira sua comida favorita: ");
        String food = sc.next();

        System.out.print("Cor de pele: ");
        String color = sc.next();

        // converte o ano inserido para idade
        int age = 2024 - year;

        System.out.println(" ");

        // saída de dados
        System.out.println("----- SUAS INFORMAÇÕES -----");
        System.out.println("Seu nome é: " + name + " " + midname);
        System.out.println("Sua idade: "+ age);
        System.out.printf("Sua altura: %.2f%n ", altura);
        System.out.println("Sua cor de pele: " + color);
        System.out.println("Sua comida favorita: " + food);
        System.out.println("Sua data de nascimento: " + day + "/" + month + "/" + year);

    }
}

