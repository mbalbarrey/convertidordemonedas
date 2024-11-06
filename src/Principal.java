import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("******************************************************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
        System.out.println("******************************************************");

        String menu = """
                \n1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                ******************************************************
                Elija una opción válida >>>>                
                """;

        while (opcion != 7) {
            System.out.println(menu);
            opcion = teclado.nextInt();
            double valorAConvertir;
            var consulta = new ConsultarConversion();
            double valorConversion;
            var conversion = (Conversion) null;
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el monto que desea convertir:");
                    valorAConvertir = teclado.nextDouble();
                    conversion = consulta.consultarConversion("USD");
                    valorConversion = conversion.conversion_rates().get("ARS")*valorAConvertir;
                    System.out.println("******************************************************");
                    System.out.println("$"+valorAConvertir+" USD = $"+valorConversion+"(ARS)");
                    System.out.println("******************************************************");
                    break;
                case 2:
                    System.out.println("Ingrese el monto que desea convertir:");
                    valorAConvertir = teclado.nextDouble();
                    conversion = consulta.consultarConversion("ARS");
                    valorConversion = conversion.conversion_rates().get("USD")*valorAConvertir;
                    System.out.println("******************************************************");
                    System.out.println("$"+valorAConvertir+" ARS = $"+valorConversion+"(USD)");
                    System.out.println("******************************************************");
                    break;
                case 3:
                    System.out.println("Ingrese el monto que desea convertir:");
                    valorAConvertir = teclado.nextDouble();
                    conversion = consulta.consultarConversion("USD");
                    valorConversion = conversion.conversion_rates().get("BRL")*valorAConvertir;
                    System.out.println("******************************************************");
                    System.out.println("$"+valorAConvertir+" USD = $"+valorConversion+"(BRL)");
                    System.out.println("******************************************************");
                    break;
                case 4:
                    System.out.println("Ingrese el monto que desea convertir:");
                    valorAConvertir = teclado.nextDouble();
                    conversion = consulta.consultarConversion("BRL");
                    valorConversion = conversion.conversion_rates().get("USD")*valorAConvertir;
                    System.out.println("******************************************************");
                    System.out.println("$"+valorAConvertir+" BRL = $"+valorConversion+"(USD)");
                    System.out.println("******************************************************");
                    break;
                case 5:
                    System.out.println("Ingrese el monto que desea convertir:");
                    valorAConvertir = teclado.nextDouble();
                    conversion = consulta.consultarConversion("USD");
                    valorConversion = conversion.conversion_rates().get("COP")*valorAConvertir;
                    System.out.println("******************************************************");
                    System.out.println("$"+valorAConvertir+" USD = $"+valorConversion+"(COP)");
                    System.out.println("******************************************************");
                    break;
                case 6:
                    System.out.println("Ingrese el monto que desea convertir:");
                    valorAConvertir = teclado.nextDouble();
                    conversion = consulta.consultarConversion("COP");
                    valorConversion = conversion.conversion_rates().get("USD")*valorAConvertir;
                    System.out.println("******************************************************");
                    System.out.println("$"+valorAConvertir+" COP = $"+valorConversion+"(USD)");
                    System.out.println("******************************************************");
                    break;
                case 7:
                    System.out.println("******************************************************");
                    System.out.println("Gracias por utilizar nuestros servicios :)");
                    opcion = 7;
                    break;
                default:
                    System.out.println("ERROR: Ingrese una opción válida!\n");
            }
        }



    }
}
