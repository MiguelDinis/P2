package pt.ua.prog2;
public class Contacto {
	private String nome;
	private String telefone;
	private String eMail;
	
	public Contacto(String n,String t,String e){
		nome = n;
		telefone = t;
		eMail = e;
	}
	public Contacto(String n,String t){
		nome = n;
		telefone = t;
	}
	public String nome(){
		return nome;
	}
	
	public String telefone(){
		return telefone;
	}
	public String eMail(){
		return eMail;
	}
}

