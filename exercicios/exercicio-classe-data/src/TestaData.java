//Jefferson Nascimento dos Santos.

public class TestaData {
    public static void main(String[] args) {
        System.out.println("--- Teste Construtor com Parametros ---");
        Data d1 = new Data(10, 5, 2023);
        System.out.println("Data: " + d1.mostra1());
        System.out.println("Por extenso: " + d1.mostra2());
        System.out.println("Bissexto: " + d1.bissexto());
        System.out.println("Dias transcorridos: " + d1.diasTranscorridos());

        System.out.println("\n--- Teste Metodos Entra ---");
        d1.entraDia(20);
        d1.entraMes(12);
        d1.entraAno(2024);
        System.out.println("Nova Data: " + d1.mostra1());
        System.out.println("Bissexto: " + d1.bissexto());
        System.out.println("Dias transcorridos: " + d1.diasTranscorridos());

        System.out.println("\n--- Teste Data Atual ---");
        d1.apresentaDataAtual();

        //Descomente as linhas abaixo para testar o construtor interativo
        //System.out.println("\n--- Teste Construtor Padrao (Interativo) ---");         
        //Data d2 = new Data();
        //System.out.println("Data digitada: " + d2.mostra1());
    }
}