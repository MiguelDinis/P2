import java.util.*;

public class ex25 {
	static Scanner kb = new Scanner(System.in);
	public static void main (String[] args) {
	int opcao;
	Data data = new Data();
	do{
		System.out.println();
		System.out.println("1. Cria novo objeto com a data actual");
		System.out.println("2. Cria novo objecto com uma qualquer data");
		System.out.println("3. Indica se a data é válida");
		System.out.println("4. Escreve data");
		System.out.println("5. Dia anterior");
		System.out.println("6. Dia seguinte");
		System.out.println("0. Termina");
		System.out.println("Opção: ");
		opcao = kb.nextInt();
		switch(opcao){
			case 1:
				data = new Data();
			break;
			case 2:
				System.out.println("Dia: ");
				int d = kb.nextInt();
				System.out.println("Mes: ");
				int m= kb.nextInt();
				System.out.println("Ano: ");
				int a = kb.nextInt();
				data = new Data(d,m,a);
			break;
			case 3:
				if(data.data_valida()) System.out.println("Data é válida!");
				else System.out.println("Data inválida!");
			break;
			case 4:
				data.write_data();
				data.data_extenso();
			break;
			case 5:
				data.vaiParaOntem();
			break;
			case 6:
				data.vaiParaAmanha();
			break;
			case 7:
				System.exit(0);
			break;
		}
	}	while(opcao !=0);

}
}

