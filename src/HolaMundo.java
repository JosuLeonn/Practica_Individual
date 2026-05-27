import java.util.Scanner;
public class HolaMundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Bienvenido al Programa User----\n----Identificate----");
        System.out.println("Ingresa tu Usuario");
        String user = sc.nextLine();
        System.out.println("Ingresa tu contraseña");
        int contra = sc.nextInt();
        if (contra == 2026){
            System.out.println("Contraseña correcta\nBienvenido Transformador: " + user);
        }
        else{
            System.out.println("Contraseña incorrecta ¡Fuera de aca impostor!");
        }
    }
}
