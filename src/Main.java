import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome1, nome2, nome3, email1, email2, email3, resultado;
        double nota1_aluno1, nota2_aluno1, nota3_aluno1;
        double nota1_aluno2, nota2_aluno2, nota3_aluno2;
        double nota1_aluno3, nota2_aluno3, nota3_aluno3;
        double media1, media2, media3;
        String media1_formatada, media2_formatada, media3_formatada;

        String resultado1, resultado2, resultado3;

        System.out.println("Seja bem vindo ao cadastro de alunos");

//        for (contador = 1; contador <= 3; contador++){
//            System.out.println("Por favor, informe o nome do " + contador + " aluno: ");
//            if($)
//        }
//

//        Aluno 1
        System.out.println("Por favor, informe o nome do 1ª aluno: ");
        nome1 = scanner.next();

        System.out.println("O seu email:");
        email1 = scanner.next();

        System.out.println("Qual a 1ª nota: ");
        nota1_aluno1 = scanner.nextDouble();

        System.out.println("Qual a 2ª nota: ");
        nota2_aluno1 = scanner.nextDouble();

        System.out.println("Qual a 3ª nota: ");
        nota3_aluno1 = scanner.nextDouble();

        media1 = (nota1_aluno1 + nota2_aluno1 + nota3_aluno1)/3;

        media1_formatada = String.format("%.1f", media1);

        if (media1 >= 7){
            resultado1 = "Parabéns, você passou direto. Por acaso você programa em Java?";
        } else {
            resultado1 = "Você foi reprovado. Ainda bem que é só simulação, hein?";
        }

//        Aluno 2
        System.out.println("---------------------------------");
        System.out.println("Por favor, informe o nome do 2ª aluno: ");
        nome2 = scanner.next();

        System.out.println("O seu email:");
        email2 = scanner.next();

        System.out.println("Qual a 1ª nota: ");
        nota1_aluno2 = scanner.nextDouble();

        System.out.println("Qual a 2ª nota: ");
        nota2_aluno2 = scanner.nextDouble();

        System.out.println("Qual a 3ª nota: ");
        nota3_aluno2 = scanner.nextDouble();

        media2 = (nota1_aluno2 + nota2_aluno2 + nota3_aluno2)/3;

        media2_formatada = String.format("%.1f", media2);


        if (media2 >= 7){
            resultado2 = "Parabéns, você passou direto. Por acaso você programa em Java?";
        } else {
            resultado2 = "Você foi reprovado. Ainda bem que é só simulação, hein?";
        }

//        Aluno 3
        System.out.println("---------------------------------");
        System.out.println("Por favor, informe o nome do 3ª aluno: ");
        nome3 = scanner.next();

        System.out.println("O seu email:");
        email3 = scanner.next();

        System.out.println("Qual a 1ª nota: ");
        nota1_aluno3 = scanner.nextDouble();

        System.out.println("Qual a 2ª nota: ");
        nota2_aluno3 = scanner.nextDouble();

        System.out.println("Qual a 3ª nota: ");
        nota3_aluno3 = scanner.nextDouble();

        media3 = (nota1_aluno3 + nota2_aluno3 + nota3_aluno3)/3;

        media3_formatada = String.format("%.1f", media3);


        if (media3 >= 7){
            resultado3 = "Parabéns, você passou direto. Por acaso você programa em Java?";
        } else {
            resultado3 = "Você foi reprovado. Ainda bem que é só simulação, hein?";
        }


        System.out.println("__________________________");
        System.out.println("________Resultados________");
        System.out.println("__________________________");


//        Aluno 1
        System.out.println("Resultado para o aluno:");
        System.out.println("Nome:" + nome1);
        System.out.println("Email:" + email1);
        System.out.println("Notas:" + nota1_aluno1 + ", " + nota2_aluno1 + ", " + nota3_aluno1);
        System.out.println("Média:" + media1_formatada);
        System.out.println(resultado1);


        //        Aluno 2
        System.out.println("----------------------------------");
        System.out.println("Resultado para o aluno:");
        System.out.println("Nome:" + nome2);
        System.out.println("Email:" + email2);
        System.out.println("Notas:" + nota1_aluno2 + ", " + nota2_aluno2 + ", " + nota3_aluno2);
        System.out.println("Média:" + media2_formatada);
        System.out.println(resultado2);


        //        Aluno 3
        System.out.println("----------------------------------");
        System.out.println("Resultado para o aluno:");
        System.out.println("Nome:" + nome3);
        System.out.println("Email:" + email3);
        System.out.println("Notas:" + nota1_aluno3 + ", " + nota2_aluno3 + ", " + nota3_aluno3);
        System.out.println("Média:" + media3_formatada);
        System.out.println(resultado3);


        scanner.close();

    }
}