import exception.SerieNaoHabilitadaException;
import service.SerieProxy;

public class Main {
    public static void main(String[] args) throws SerieNaoHabilitadaException {

        try {
            SerieProxy serie1 = new SerieProxy();
            System.out.println(serie1.getSerie("Last Kingdom"));

            SerieProxy serie2 = new SerieProxy();
            System.out.println(serie2.getSerie("Friends"));

            SerieProxy serie3 = new SerieProxy();
            System.out.println(serie3.getSerie("Peaky Blinders"));

            SerieProxy serie4 = new SerieProxy();
            System.out.println(serie4.getSerie("Breaking bad"));

            SerieProxy serie5 = new SerieProxy();
            System.out.println(serie5.getSerie("Lupin"));

            SerieProxy serie6 = new SerieProxy();
            System.out.println(serie6.getSerie("The Witcher"));

        } catch (SerieNaoHabilitadaException e ) {
            System.out.println("Erro: " + e);
        }

    }
}
