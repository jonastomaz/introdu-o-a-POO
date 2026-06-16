import java.util.Scanner;

public class Main {

	static String InverterInterativo(String palavra) {
	    char[] palavraInvertida = new char[palavra.length()];
	    for (int i = 0; i < palavra.length(); i++) {
	        palavraInvertida[i] = palavra.charAt(palavra.length() - 1 - i);
	    }

	    return new String(palavraInvertida);
	}
	
	static String InverterRecursivo(String palavra) {
		if(palavra.length() == 0) {
			return palavra;
		}
		return palavra.charAt(palavra.length()-1) + InverterRecursivo(palavra.substring(0,palavra.length()-1)); 
	}
	
	static int contarVogaisInterativo(String palavra) {
		int cont = 0;
		for(int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || 
				palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
				cont ++;
			}
		}
		return cont;
	}
	
	static int contarVogaisRecursivo(String palavra, int indice) {
		if(palavra.length() <= indice) {
			return 0;
		}
		
		if(palavra.charAt(indice) == 'a' || palavra.charAt(indice) == 'e' || palavra.charAt(indice) == 'i' || 
				palavra.charAt(indice) == 'o' || palavra.charAt(indice) == 'u') {
				return 1 + contarVogaisRecursivo(palavra, indice + 1);
			}
		return contarVogaisRecursivo(palavra, indice + 1);
	}
	
	static int contarConsoanteInterativo(String palavra) {
		int cont = 0;
		for(int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) != 'a' && palavra.charAt(i) != 'e' && palavra.charAt(i) != 'i' && 
				palavra.charAt(i) != 'o' && palavra.charAt(i) != 'u') {
				cont ++;
			}
		}
		return cont;
	}
	
	static int contarConsoanteRecursivo(String palavra, int indice) {
		if(palavra.length() <= indice) {
			return 0;
		}
		
		if(palavra.charAt(indice) != 'a' && palavra.charAt(indice) != 'e' && palavra.charAt(indice) != 'i' && 
				palavra.charAt(indice) != 'o' && palavra.charAt(indice) != 'u') {
				return 1 + contarConsoanteRecursivo(palavra, indice + 1);
			}
		return contarConsoanteRecursivo(palavra, indice + 1);
	}
	
	static int contarOcorrenciaLetra ( String palavra , char letra ) {
		int cont = 0;
		for(int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == letra) {
				cont ++;
			}
		}
		return cont;
	}
	
	static boolean verificarPalindromoIterativo ( String palavra ) {
		char[] palavraInvertida = new char[palavra.length()];
	    for (int i = 0; i < palavra.length(); i++) {
	        palavraInvertida[i] = palavra.charAt(palavra.length() - 1 - i);
	    }

	    String palindromo = new String(palavraInvertida);
	    return palavra.equalsIgnoreCase(palindromo);
	}
	
	static boolean verificarPalindromoRecursivo ( String palavra , int inicio , int fim ) {
		if(inicio >= fim) {
			return true;
		}
		if(palavra.charAt(inicio) != palavra.charAt(fim)) {
			return false;
		}
		return verificarPalindromoRecursivo (palavra , inicio + 1 , fim - 1);
	}
	
	static String substituirLetra ( String palavra , char antiga , char nova ) {
		char[] novaPalavra = palavra.toCharArray();
		for(int i = 0; i < palavra.length(); i++) {
			if(novaPalavra[i] == antiga) {
				novaPalavra[i] = nova;
			}
		}
		
		String palavraNova = new String(novaPalavra);
		return palavraNova;
		
	}
	
	static String mostrarApenasVogais ( String palavra ) {
		String vogais = "";
		for(int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' || palavra.charAt(i) == 'i' || 
				palavra.charAt(i) == 'o' || palavra.charAt(i) == 'u') {
				vogais = vogais + palavra.charAt(i);
			}
		}
		return vogais;
	}
	
	static String mostrarApenasConsoantes ( String palavra ) {
		String consoantes = "";
		for(int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) != 'a' && palavra.charAt(i) != 'e' && palavra.charAt(i) != 'i' && 
				palavra.charAt(i) != 'o' && palavra.charAt(i) != 'u') {
				consoantes = consoantes + palavra.charAt(i);
			}
		}
		return consoantes;
	}
	
	static int contarLetrasRepetidas ( String palavra ) {
		int letraRepetida = 0;
		for(int i = 0; i < palavra.length(); i++) {
			int cont = 0;
			if(palavra.indexOf(palavra.charAt(i)) == i) {
				for(int j = 0; j < palavra.length(); j++) {
					if(palavra.charAt(i) == palavra.charAt(j) ) {
						cont ++;
					}
				}
				if(cont > 1) {
					letraRepetida ++;
				}
			}
		}
		return letraRepetida;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    System.out.print("Digite uma palavra: ");
	    String palavra = input.next();

	    int opcao;

	    do {
	        System.out.println("\n===== MENU =====");
	        System.out.println("1 - Inverter palavra (Iterativo)");
	        System.out.println("2 - Inverter palavra (Recursivo)");
	        System.out.println("3 - Contar vogais (Iterativo)");
	        System.out.println("4 - Contar vogais (Recursivo)");
	        System.out.println("5 - Contar consoantes (Iterativo)");
	        System.out.println("6 - Contar consoantes (Recursivo)");
	        System.out.println("7 - Contar ocorrência de uma letra");
	        System.out.println("8 - Verificar palíndromo (Iterativo)");
	        System.out.println("9 - Verificar palíndromo (Recursivo)");
	        System.out.println("10 - Substituir letra");
	        System.out.println("11 - Mostrar apenas vogais");
	        System.out.println("12 - Mostrar apenas consoantes");
	        System.out.println("13 - Contar letras repetidas");
	        System.out.println("14 - Digitar nova palavra");
	        System.out.println("0 - Sair");
	        System.out.print("Escolha uma opção: ");

	        opcao = input.nextInt();

	        switch (opcao) {
	            case 1:
	                System.out.println(InverterInterativo(palavra));
	                break;
	                
	            case 2:
	                System.out.println(InverterRecursivo(palavra));
	                break;
	                
	            case 3:
	                System.out.println(contarVogaisInterativo(palavra));
	                break;
	                
	            case 4:
	                System.out.println(contarVogaisRecursivo(palavra, 0));
	                break;
	                
	            case 5:
	                System.out.println(contarConsoanteInterativo(palavra));
	                break;
	                
	            case 6:
	                System.out.println(contarConsoanteRecursivo(palavra, 0));
	                break;
	                
	            case 7:
	                System.out.print("Digite a letra: ");
	                char letra = input.next().charAt(0);
	                
	                System.out.println(contarOcorrenciaLetra(palavra, letra));
	                break;
	                
	            case 8:
	                if (verificarPalindromoIterativo(palavra))
	                    System.out.println("É palíndromo");
	                else
	                    System.out.println("Não é palíndromo");
	                break;
	            case 9:
	                if (verificarPalindromoRecursivo(palavra, 0, palavra.length() - 1))
	                    System.out.println("É palíndromo");
	                else
	                    System.out.println("Não é palíndromo");
	                break;
	            case 10:
	                System.out.print("Letra antiga: ");
	                char antiga = input.next().charAt(0);

	                System.out.print("Letra nova: ");
	                char nova = input.next().charAt(0);

	                System.out.println(substituirLetra(palavra, antiga, nova));
	                break;

	            case 11:
	                System.out.println(mostrarApenasVogais(palavra));
	                break;

	            case 12:
	                System.out.println(mostrarApenasConsoantes(palavra));
	                break;

	            case 13:
	                System.out.println(contarLetrasRepetidas(palavra));
	                break;
	                
	            case 14:
	            	System.out.print("digite a nova palavra: ");
	            	palavra = input.next();
	            	break;
	            	
	            case 0:
	                System.out.println("Encerrando...");
	                break;

	            default:
	                System.out.println("Opção inválida!");
	        }

	    } while (opcao != 0);
	    input.close();
	}
}
