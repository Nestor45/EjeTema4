public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int numeroIf = 00;
        if(numeroIf == 0) {
            //System.out.println("El numero es 0");
        } else if(numeroIf > 0) {
            //System.out.println("El numero es positivo");
        } else {
            //System.out.println("El numero es negativo");
        }
        int numeroWhile = 2;
        while (numeroWhile < 3) {
            numeroWhile++;
            //System.out.println(numeroWhile);
        }
        do {
            numeroWhile++;
           // System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            //System.out.println(numeroFor);
        }
        String estacion = "OTOÑO";
        switch (estacion) {
            case "VERANO":
                System.out.println("ES VERANO");
                break;
            case "PRIMAVERA":
                System.out.println("ES PRIMAVERA");
                break;
            case "OTOÑO":
                System.out.println("ES OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("ES INVIERNO");
                break;
            default:
            System.out.println("NO ES UNA ESTACION");
                break;
        }
    }
}
