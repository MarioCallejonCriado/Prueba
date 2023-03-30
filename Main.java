package registro;

import java.util.Scanner;

public class Main {
    private static void init(ValidarCampos validar) {
        boolean correcto;
        do {
            Scanner teclat = new Scanner(System.in);
            System.out.println("Escribe un nombre");
            validar.setNombreUsuario(teclat.nextLine());
            correcto = validar.compruebaNombre(validar.getNombreUsuario(), null);
            System.out.println("Escribe un email");
            validar.setEmail(teclat.nextLine());
            correcto = validar.compruebaEmail(validar.getEmail());
            System.out.println("Escribe una contraseña");
            validar.setPassword(teclat.nextLine());
            correcto = validar.compruebaContraseña(validar.getPassword());
            correcto = validar.generarCodigo();
            System.out.println("Has entrado con éxito");
            teclat.close();
        } while (!correcto);

    }

    public static void main(String[] args) {
        ValidarCampos validar = new ValidarCampos(null, null, null);
        init(validar);

    }

}