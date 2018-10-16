import java.util.Scanner;

class Encryption{
    private String plainText;
    private String cypherText;
    private String Key;
    Scanner s = new Scanner(System.in);

    public void GetPlainText(){
        System.out.println("Enter a string to be encrypted");
        plainText = s.nextLine();
    }
    public void GetCypherText(){
        System.out.println("Enter a string to be decrypted");
        plainText = s.nextLine();
    }
}
