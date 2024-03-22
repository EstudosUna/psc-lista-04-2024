import java.util.Scanner;
public class atvd02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        while (true) {
        System.out.println("Digite o nome do usuário: ");
        usuario = scanner.nextLine();
        System.out.println("Digite uma senha: ");
        senha = scanner.nextLine();

        if (usuario.equals(senha)) {
            System.out.println("Senha inválida, por favor digite uma senha que não seja igual ao usuário.");
        
        } else {
            System.out.println("Senha válida. ");
            break;
        }      
    }       
        scanner.close();
    }
    
}
