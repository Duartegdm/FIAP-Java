package aula08.br.com.fiap.teste;
public class Teste1 {

    public static void main(String[] args) {
        String email = "Antonella@lizmacedo.com";
        String confirmacaoEmail = new String("antonella@lizmacedo.com");

        //Validar se os e-mails são iguais
        if (email.equalsIgnoreCase(confirmacaoEmail)){ //Comprar o valor ("texto") do objeto string
            System.out.println("Email confirmado!");
        } else {
            System.out.println("Emails não são iguais");
        }
        System.out.println(email);
        System.out.println(confirmacaoEmail);

        //Retornar a posição do @ do email
        System.out.println("A letra '@' aparece primeiro na posicao ("+ email.indexOf("@") + ") da string (" + email + ")");

        //Imprimir a quantidade de caracteres do email
        System.out.println("Qnt de caracteres: " + email.length());

        //Exibir o email ( sem dominio)
        String qualquerCoisa = email.substring(0, email.indexOf("@"));
        System.out.println(qualquerCoisa);

        //Exibir o dominio do email
        String dominio = email.substring(email.indexOf("@") + 1);
        System.out.println("Domínio: " + dominio);
    }
}