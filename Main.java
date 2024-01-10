import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        Boolean verifica = data.isBefore(data2);
        System.out.println("La prima data e' precedente alla seconda? " + verifica);

        Boolean verifica2 = data2.isAfter(data);
        System.out.println("La seconda data e' successiva alla prima? " + verifica2);

        Boolean verifica3 = OffsetDateTime.now().equals(data);
        System.out.println("La prima data equivale a ora? " + verifica3);

        Boolean verifica4 = OffsetDateTime.now().equals(data2);
        System.out.println("La seconda data equivale a ora? " + verifica4);


    }
}
