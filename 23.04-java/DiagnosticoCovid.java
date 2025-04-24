import java.util.Arrays;

public class DiagnosticoCovid extends Diagnostico {

    public DiagnosticoCovid() {
        super(new String[]{"febre", "tosse seca", "cansaço", "perda de olfato", "perda de paladar"});
    }

    @Override
    public String avaliarPaciente(String[] sintomasInformados) {
        int coincidencias = 0;

        for (String sintoma : sintomasInformados) {
            if (Arrays.asList(sintomasComuns).contains(sintoma.toLowerCase())) {
                coincidencias++;
            }
        }

        if (coincidencias >= 2) {
            return "Possível infecção por COVID-19. Isolamento e teste recomendado.";
        } else {
            return "Sintomas insuficientes para diagnóstico de COVID-19.";
        }
    }
}
