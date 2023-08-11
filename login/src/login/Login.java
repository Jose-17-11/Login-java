package login;
import java.util.Scanner;
public class Login {
	
//	Se crea el objeto scanner que lee las entradas del usuario por consola, la instancia de la clase Dates y un atributo booleano para
//	romper o seguir el ciclo
	static Scanner sc = new Scanner(System.in);
	static Dates log = new Dates();
	static boolean r = false;
	
//	Primer metodo que pide ingresar el correo y password
	public void loginSesion() {
//		instancia de la misma clase para utilizar metodos de la misma clase
		Login sesion = new Login();
//		Atributos que almacenaran el correo y password
		String user, pass;
//		ciclo que se rompe una vez se inicie sesion o el mismo usuario cierre sesion
		do {
			System.out.println("\nIngrese su correo: ");
			user = sc.next();
			System.out.println("Ingrese su contraseña: ");
			pass = sc.next();
//			Condicional que compara los datos ingresados con los de la clase Dates si son los correctos se llama el metodo sesionIniciada
			if(log.getCorreo().equalsIgnoreCase(user) && log.getPassword().equals(pass)) {
				sesion.sesionIniciada();
			}else {
//				En caso de que no se cumpla la condicion se da el aviso que algun dato fue ingresado de manera incorrecta
				System.out.println("\nAlguno de sus datos es incorrecto si desea puede volverlo a intentar\n");
			}
			
		}while(!r);
	}
	
	public void sesionIniciada() {
//		Menu que una vez iniciada sesion se dan opciones al usuario, como cambiar usuario o contraseña o si no tambien cerrar sesion
		System.out.println("\nSesion iniciada\n");
		System.out.println("1. Cambiar usuario: ");
		System.out.println("2. Cambiar contraseña: ");
		System.out.println("3. Cerrar sesion: ");
		int x = sc.nextInt();
//		Switch case que dependiendo lo que haya ingresado el usuario sera el siguiente proceso que realizara
		switch(x) {
		case 1:
			System.out.println("Ingresar nuevo correo: ");
			String newUser = sc.next();
//			mediante el metodo set de la clase dates se asigna el nuevo correo
			log.setCorreo(newUser);
			break;
		case 2: 
			System.out.println("Ingresar nueva contraseña: ");
			String newPass = sc.next();
//			De la misma forma mediante el metodo setPassword se asigna la nueva contraseña
			log.setPassword(newPass);
			break;
		case 3:
/*			En caso de que el usuario ingrese el apartado de cerrar sesion r cambiara de false a true que hara que automaticamente 
 * 			se rompera el ciclo
			**/
			System.out.println("Sesion cerrada");
			r = true;
			break;
		}
	}
}
