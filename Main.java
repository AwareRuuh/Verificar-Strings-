import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc1 = new Scanner(System.in);
    String stringUser, stringUser2;

  System.out.println("Escreva uma frase: ");
    stringUser = sc1.nextLine();
  System.out.println("Escreva uma outra frase: ");
    stringUser2 = sc1.nextLine();
    if(stringUser == "" || stringUser2 ==""){
      System.out.println("Favor inserir uma frase em ambas variáveis!");
    }
  System.out.println("Sua segunda frase: " + stringUser2 + " contém algo da primeira?: " + stringUser );
        if(stringUser.contains(stringUser2)) {
            System.out.println("Contém.");
        }
        else {
            System.out.println("Não contém.");
        }
  }
}