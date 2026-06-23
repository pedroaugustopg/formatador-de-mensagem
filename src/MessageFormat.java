public class MessageFormat {

        public static void Escreva (String msg){
            String linha = "~".repeat(msg.length() + 4);

            System.out.println(linha);
            System.out.println(" " + msg);
            System.out.println(linha);
        }
}
