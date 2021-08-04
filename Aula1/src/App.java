/* 
*    Primeira aula de Java:
*      tipos de variáveis e seus tamanhos
*/

public class App {
	public static void main(String[] args) {
		byte inteiroPequeno; // 8 bits
		short inteiroCurto; // 16 bits
		int inteiro; // 32 bits
		long inteiroLongo; // 64 bits

		float real; // 32 bits
		double realDuplo; // 64 bits

		char caracter; // 16 bits
		String string;

		boolean booleano; // true ou false

		inteiroPequeno = 1;
		inteiroCurto = 10;
		inteiro = 100;
		inteiroLongo = 10000000000L; // L para número longo
		real = 1.1f;
		realDuplo = 1.11; // real = (float)1.11;
		caracter = 'a';
		string = "Fatec";
		booleano = true;

		// Operadores lógicos:
		// + - * / % ++ -- += -= /=

		System.out.print(inteiroPequeno); // Printa e não pula linha
		System.out.println(inteiroLongo); // Printa e pula linha
		System.out.printf("%d", inteiro); // Printa strings formatadas

	}
}
