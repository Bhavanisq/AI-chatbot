
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Chat bot.Type some commands to get started!");

        while (true) {
            String command = scanner.nextLine();
            if(command.equals("hi chat bot")){
                System.out.println("(hello myself chat bot.How can I Help you today?)");

            }else if(command.equals("tell me about yourself")){
                System.out.println("(I'm your AI Assistent to assist you)"); 
            }else if(command.equals("Are you robot")){
                System.out.println("(yes, I'm a robot pretending to be a human)"); 
            }else if(command.equals("tell me about weather")){
                System.out.println("(It is Sunny Today!)"); 
            }else if(command.equals("Exit")){
                System.out.println("Exiting..."); 
                System.exit(0);
            }
        }
    }
}
    
