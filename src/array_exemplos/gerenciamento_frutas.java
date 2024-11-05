package array_exemplos;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class gerenciamento_frutas {

	    public static void main(String[] args) {
	    	
	    	//Scanner para ver qual opção o usuário quer utilizar
	        Scanner scanner = new Scanner(System.in);
	        Set<String> frutas = new HashSet<>();

	        //Abre a lista de opções
	        while (true) {
	            System.out.println("\nEscolha uma opção:");
	            System.out.println("1. Adicionar uma fruta");
	            System.out.println("2. Listar todas as frutas");
	            System.out.println("3. Remover uma fruta");
	            System.out.println("4. Verificar se uma fruta está presente");
	            System.out.println("5. Sair");
	            System.out.print("Opção: ");

	            try {
	                int opcao = scanner.nextInt();
	                scanner.nextLine(); // Limpa o buffer

	                //Detalhando o que cada opção significa
	                switch (opcao) {
	                    case 1:
	                        System.out.print("Digite o nome da fruta para adicionar: ");
	                        String novaFruta = scanner.nextLine();
	                        if (frutas.add(novaFruta)) {
	                            System.out.println(novaFruta + " foi adicionada.");
	                        } else {
	                            System.out.println(novaFruta + " já está presente no conjunto.");
	                        }
	                        break;

	                    case 2:
	                        System.out.println("Frutas: " + frutas);
	                        break;

	                    case 3:
	                        System.out.print("Digite o nome da fruta que deseja remover: ");
	                        String frutaRemover = scanner.nextLine();
	                        if (frutas.remove(frutaRemover)) {
	                            System.out.println(frutaRemover + " foi removida.");
	                        } else {
	                            System.out.println(frutaRemover + " não foi encontrada.");
	                        }
	                        break;

	                    case 4:
	                        System.out.print("Digite o nome da fruta para verificar: ");
	                        String frutaVerificar = scanner.nextLine();
	                        if (frutas.contains(frutaVerificar)) {
	                            System.out.println(frutaVerificar + " está presente no conjunto.");
	                        } else {
	                            System.out.println(frutaVerificar + " não foi encontrada no conjunto.");
	                        }
	                        break;

	                    case 5:
	                        System.out.println("Saindo...");
	                        scanner.close();
	                        return;

	                    default:
	                        System.out.println("Opção inválida. Tente novamente.");
	                        break;
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Entrada inválida. Por favor, digite um número.");
	                scanner.nextLine(); // Limpa a entrada inválida do scanner
	            }
	        }
	    }
	}

