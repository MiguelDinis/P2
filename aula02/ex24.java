import java.util.*;
import java.lang.*;
import pt.ua.prog2.*;

public class ex24 {
	static Scanner kb = new Scanner(System.in);
	public static void main (String[] args) {
		Contacto4[] cl = new Contacto4[4];
		int i=0;
		String nome;
		String telefone;
		String email;
		do{
		System.out.println("Indique o nome: ");
		nome = kb.nextLine();
		System.out.println("Indique o telefone: ");
		telefone = kb.nextLine();
		System.out.println("Indique o email");
		email = kb.nextLine();
	
		if (nome.length()==0){
			System.out.println("Contacto invalido!");
			 System.exit(0);
		}	
		cl[i] = new Contacto4(nome,telefone,email);
		i++;	
		}while(i<cl.length);
		
		System.out.println("Listagem");
		for(int a=0;a<cl.length;a++){
		System.out.println(cl[a].nome() + 
          ": " + cl[a].telefone() + 
          "; " + cl[a].eMail());
		}		
	}
}

