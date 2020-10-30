import java.util.Locale;
import java.util.Scanner;

public class Use_Array_and_For {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		String [] vct = new String [3];
		System.out.println("Preencha seus dados Pessoais");	
		System.out.println(" Qual seu Nome "); 
		vct[0] = sc.nextLine();
		System.out.println("Qual sua idade ");
		vct[1] = sc.nextLine();
		System.out.println(" Estado Civil ");
		vct[2] = sc.nextLine();
		System.out.println(" Meu nome é " + vct[0]  + " tenho " + vct[1] + " anos de e sou " + vct[2]);
		System.out.println( " =================================================== ");
		
		for(String dados : vct) {
			System.out.println(dados);
		}
		
		
		
     		
		
		
		
		
	sc.close();
		}
		
}
