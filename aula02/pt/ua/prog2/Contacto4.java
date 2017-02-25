package pt.ua.prog2;
public class Contacto4 {
	private String nome;
	private String telefone;
	private String eMail;
	static int count;
	
	public Contacto4 (String n,String t,String e){
		nome = n;
		telefone = t;
		eMail = e;
		count++;
		
	}
	public Contacto4 (String n,String t){
		nome = n;
		telefone = t;
		count++;
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
	static {
		count =0;
	}
}



