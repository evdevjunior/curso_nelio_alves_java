package introducao_poo;

/*  UTILIZAÇÃO DE ALGUNS MÉTODOS PARA MANIPULAR STRING
*
*   toLowerCase()
*   toUpperCase()
*   trim()
*   substring()
*   replace()
*   indexOf()
*   lastIndexOf()
*   concat()
*   split()
*
* */

public class FuncoesParaStrings {

    public static void main(String[] args) {

        String nome = "Evandro Silva do Nascimento";

        String letrasMinusculas = nome.toLowerCase();   // Converete a String em Letras Minusculas
        System.out.println(nome + " --- > " + letrasMinusculas);

        String letrasMaiusculas = nome.toUpperCase();   // Letras Maiusculas
        System.out.println(nome + " --- > " + letrasMaiusculas);

        String letrasSemEspaco = nome.trim();   // Elimina os Espaços dos cantos na String
        System.out.println(nome + " --- > " + letrasSemEspaco);

        String letrasTrocadas = nome.replace("a", "e"); // Troca os Caracteres das Strings
        System.out.println(nome + " --- > " + letrasTrocadas);


        int letrasPrimeiraPosicao = nome.indexOf("o");  //  Retorna a Posição do Primeiro Padrão dos Caracteres Passado como Parametro
        System.out.println(nome + " --- > " + letrasPrimeiraPosicao);

        int letrasUltimaPosicao = nome.lastIndexOf("o");    // Retorna a Ultima Posição dos Caracteres Passado como Parametro
        System.out.println(nome + " --- > " + letrasUltimaPosicao);

        String letrasJuntaString = nome.concat(" Filho");   // Concatena, Junta a String, Adiciona
        System.out.println(nome + " --- > " + letrasJuntaString);

        String [] vetor = nome.split(" ");  // Recorta a String pelo Separador Passado como Parametro ex: " " espaço em branco
        String vetor1 = vetor[0];
        String vetor2 = vetor[1];
        String vetor3 = vetor[2];
        System.out.println(nome + " --- > " + vetor1 + vetor2 + vetor3);

        String letrasParteDaString = nome.substring(8, 13);  // Cria uma Outra String Apaartir dos Indices Inicial e Final Passado como Parametro
        System.out.println(nome + " --- > " + letrasParteDaString);

    }
}
