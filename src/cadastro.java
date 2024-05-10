import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- AREA DE CADASTRO -----");
        System.out.println(" ");

        System.out.print("Insira seu nome: ");
        String name = sc.next();
        System.out.print("Insira seu Sobrenome: ");
        String midname = sc.next();

        System.out.println("Insira sua data de nascimento: ");
        System.out.print("Dia: ");
        int day = sc.nextInt();
        System.out.print("Mês: ");
        byte month = sc.nextByte();
        System.out.print("Ano: ");
        int year = sc.nextInt();

        System.out.print("Insira sua comida favorita: ");
        String food = sc.next();

        System.out.print("Cor de pele: ");
        String color = sc.next();

        int age = 2024 - year;

        System.out.println("----- SUAS INFORMAÇÕES -----");
        System.out.println("Seu nome é: " + name+" "+midname);
        System.out.println("Sua comida favorita: " + food);
        System.out.println("Sua idade: " + age);
        System.out.println("Sua cor de pele: " + color);
        System.out.println("Sua data de nascimento: " + day + "/" + month + "/" + year);


    }
}

