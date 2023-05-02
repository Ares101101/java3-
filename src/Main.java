public class Main {

    public static void main(String[] args) {

        String[] nombres = {"pedro","juan","alcides"};

        concaten(nombres);

    }

    public static void concaten( String[] variable ){

        String resultado = "" ;

        for (int i = 0; i < variable.length; i++) {
            resultado = resultado + variable[i];
        }

        System.out.println(resultado);

    }

}
