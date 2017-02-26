import java.util.*;
public class Data {
	
	static private int dia, mes,ano;
	
	public Data(){ // inicia um objeto com a data atual
		Calendar hoje = Calendar.getInstance(); 
		dia = hoje.get(Calendar.DAY_OF_MONTH);
		mes = hoje.get(Calendar.MONTH)+1;
		ano = hoje.get(Calendar.YEAR);	
	}
	
	public Data(int d, int m, int a){
		dia = d;
		mes = m;
		ano = a;
	}
	
	public int dia(){
		return dia;
	}
	
	public int mes(){
		return mes;
	}
	
	public int ano(){
		return ano;
	}
	
	public String name_month(int mes){
		switch (mes)
		{
			case 1 :
			return "Janeiro";
			case 2:
			return "Fevereiro";
			case 3:
			return "Março";
			case 4:
			return "Abril";
			case 5:
			return "Maio";
			case 6:
			return "Junho";
			case 7:
			return "Julho";
			case 8:
			return "Agosto";
			case 9:
			return "Setembro";
			case 10:
			return "Outubro";
			case 11:
			return "Novembro";
			case 12:
			return "Dezembro";
			default:
			return "Inválido";
				
		}
		
	}	
	public void data_extenso(){ //Escrever a data por extenso;
		System.out.printf("%d de %s de %d \n",dia,name_month(mes),ano);
	} 
	public void vaiParaAmanha(){
		if(dia<dias(mes,ano)) dia++; 
		else if(dias(mes,ano) == dia){
			dia =1;
			mes++;
			}
		if (mes == 12 && dia == dias(mes,ano)){
				dia = 1;
				mes = 1;
				ano++;
				
		}  
		
	}
	
	public void vaiParaOntem(){
		if (dia ==1 && mes !=1){
			dia = (dias(mes-1,ano));
			mes--;
			}
		if (dia ==1 && mes==1){
			dia = dias(12,ano-1);
			ano--;
			mes=12;
		}
		if (dia != 1){
			dia--;
		}
	}
	public void write_data(){ //metodo para retornar data;
		System.out.printf("%2d - %2d - %2d \n",dia,mes,ano);
	}
	public static boolean ano_bi(int a){//retorna true se bissexto

		if (a % 400 ==0) {
			
			return true;
			}
		else if ( a % 4 ==0 && a %100 !=0) {
			
			return false;
			}
		else {
			 
			 return false;
			 }
	}
	public static int dias(int mes,int ano){ // metodo para retornar dias de um determinado mes tendo em conta ano
		if (ano_bi(ano)){
			if (mes == 2) {return 29;}else{
				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes ==10 || mes ==12){
					return 31;} else return 30;
					}
		}else{
			if (mes ==2) {return 28;
			}else{
				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes ==10 || mes ==12){
					 return 31;}else return 30;
				} 
	} 
		
	}
	public static boolean data_valida(){ //metodo para validar data;
		if (ano >0 && mes>0 && dia >0){
			if (!ano_bi(ano)){
				if (mes == 2 && dia >28) return false;
				else if(mes>12 && mes <1) return false;
				else if (dia > dias(mes,ano)) return false;else return true;
			}else{
				if (mes ==2 && dia >29)return false;
				else if(mes>12 && mes <1) return false;
				else if (dia > dias(mes,ano)) return false;else return true;
				}
		}else return false;
	}
	
}


