import java.util.Scanner;

import footballAPI.DadosTime;
import footballAPI.LocalizarTime;
import footballAPI.MatchsTime;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o time: ");
        String time = input.nextLine();
        System.out.println("\n");

        LocalizarTime.localizarTime(time);
        //DadosTime.informacoes(5);
        //MatchsTime.partidas();
    }
}