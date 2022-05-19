import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("digite a Usuario");
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        login.setUsuario(scanner.next());
        System.out.println("digite a senha");
        login.setSenha(scanner.next());
        Metodos metodos = new Metodos();
        metodos.entrada(login.getUsuario(), login.getSenha());
    }
}

/*

 while (true) {
            System.out.println("Senha");
            Scanner scanner = new Scanner(System.in);
            Login login = new Login();
            login.setUsuario(scanner.next());
            System.out.println("digite a senha");
            login.setSenha(scanner.next());
            if (login.getUsuario().equals("luan") && login.getSenha().equals("leo@020989")) {
                System.out.println("Acesso concedido");
                break;
            }
            System.out.println("Acesso negado, tente novamente");

        }

         }

         }


       while (true) {
            Scanner i = new Scanner(System.in);
            System.out.println("digite o Login:");
            String login = i.next();
            System.out.println("digite a senha:");
            String senha = i.next();

            if (login.equals("luan") && senha.equals("leo@020989")) {
                System.out.println("Acesso concedido");
                break;
            }
            System.out.println("Acesso negado, tente novamente");
*/












/*        Scanner i = new Scanner(System.in);
        while (true) {
            System.out.println("Senha:");
            int senha = i.nextInt();
            if (senha != 20989) {
                System.out.println("senha errada! Tente novamente");
                continue;

            }
            break;
        }
}

        }
    }
}
*/