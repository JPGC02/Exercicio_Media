import java.util.Scanner;

	public class EX1_AC2 {
		public static void main(String args[]){
			java.util.Scanner nota = new Scanner(System.in);
		// variaveis
		float ac1, ac2, ag, af;
		double mf;
		// exibindo na tela o texto em parenteses
		System.out.print("Entre com a nota da AC1 :");
		// atribui o valor digitado
		ac1 = nota.nextFloat();
		System.out.print("Entre com a nota do segundo AC2: ");
		ac2 = nota.nextFloat();
		System.out.print("Entre com a nota do terceiro AG: ");
		ag = nota.nextFloat();
		System.out.print("Entre com a nota do quarto AF: ");
		af = nota.nextFloat();
		// Calculo da media
		mf = (ac1*0.15)+(ac2*0.30)+(ag*0.10)+(af*0.45);
		// Condição
		if(mf >= 5)
		{
			System.out.print("Parabens, Voce foi APROVADO.");
		}
		else
		{
			System.out.print("Voce foi REPROVADO." );
		}
		System.out.print("\nA media final eh de " + mf + " pontos");
		}
}