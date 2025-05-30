import service.SistemaService;
import util.DBInit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DBInit.init();
        SistemaService sys = new SistemaService();
        Scanner sc = new Scanner(System.in);

        int op;
        do {
            System.out.println("\n==== MENU SISTEMA ====");
            System.out.println("1 - Cad Usuário");
            System.out.println("2 - Cad Evento");
            System.out.println("3 - Listar Eventos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1 -> sys.cadUsuario(sc);
                case 2 -> sys.cadEvento(sc);
                case 3 -> sys.lstEvento();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }
}
