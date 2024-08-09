//Importa bibliotecas

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Scanner;
import java.util.Calendar;

public class cadastro {
    public static void main(String[] args) {

        // variáveis
        Scanner sc = new Scanner(System.in);
        Calendar cd = Calendar.getInstance();
        int hora = cd.get(Calendar.HOUR_OF_DAY);

        int year = 0, month = 0, day = 0;
        String name = " ", cidade = " ", cep = " ", email = " ", num = " ";
        String Rua = " ", Bairro = " ";
        int NumeroCasa = 0;
        String senha = " ";

        System.out.println(" ");

        // informa a data atual
        System.out.println("Data de hoje: " + LocalDate.now());
        System.out.println("Horário de acesso: " + Time.valueOf(LocalTime.now()));

        System.out.println(" ");

        // analisa a hora atual e imprime um bom dia, tarde ou noite *
        if (hora > 6 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }

        System.out.println(" ");

        System.out.println("Bem vindo ào Nagacaborus!");
        System.out.println("-> Clínica veterinária de animais marinhos");
        System.out.println(" ");

        System.out.println("Já possuí conta? S/N");
        String escolha = sc.nextLine();
        System.out.println("-----------------------------------------------------");
        System.out.println(" ");

        if (Objects.equals(escolha, "N")) {
            System.out.println("Então vamos começar com o seu cadastro!");
            System.out.println(" ");

            System.out.println("----| Dados Pessoais");

            System.out.print("Nome Completo: ");
            name = sc.nextLine();

            System.out.print("Número de Celular: ");
            num = sc.nextLine();

            System.out.print("Insira sua data de nascimento (dd MM yyyy):");
            day = sc.nextInt();
            month = sc.nextInt();
            year = sc.nextInt();

            System.out.println(" ");
            System.out.println("----| Endereço");

            System.out.print("Cidade: ");
            cidade = sc.nextLine();

            System.out.print("Bairro: ");
            Bairro = sc.nextLine();

            System.out.print("Rua: ");
            Rua = sc.nextLine();

            System.out.print("Número: ");
            NumeroCasa = sc.nextByte();
        }
        else {
            System.out.println("----| Iniciar Sessão");
            System.out.println(" ");
            System.out.println("Email:");
            email = sc.nextLine();
            System.out.println("Senha:");
            senha = sc.nextLine();
        }

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

        // Mostrar dados
        System.out.println("Deseja ver seus dados? S/N");
        String escolha2 = sc.nextLine();

        if (Objects.equals(escolha, "S")) {
            System.out.println("--------- SUAS INFORMAÇÕES ---------");
            System.out.println(" ");
            System.out.println("Nome: " + name);
            System.out.println("Idade: " + age);
            System.out.println("Data de nascimento: " + day + " de " + nameMonth + " de " + year);

            System.out.printf("Cidade:  %s%n", cidade);
            System.out.println("Endereço: " + cidade + ", " + Bairro + ", " + Rua + ", "+ NumeroCasa);
            System.out.println("Contatos: " + num);
            System.out.println("");
        }
    }
}

