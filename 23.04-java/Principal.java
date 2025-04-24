import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os sintomas separados por vírgula (ex: febre,tosse,coriza): ");
        String entrada = scanner.nextLine();
        String[] sintomasPaciente = entrada.split(",");

        Diagnostico gripe = new DiagnosticoGripe();
        Diagnostico covid = new DiagnosticoCovid();

        System.out.println("\n--- Avaliação para GRIPE ---");
        gripe.exibirSintomasComuns();
        System.out.println(gripe.avaliarPaciente(sintomasPaciente));

        System.out.println("\n--- Avaliação para COVID ---");
        covid.exibirSintomasComuns();
        System.out.println(covid.avaliarPaciente(sintomasPaciente));

        scanner.close();
    }
}
