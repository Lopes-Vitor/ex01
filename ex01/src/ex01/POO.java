package ex01;
import java.util.Scanner;

public class POO {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		String resposta;
		Pessoa p = new Pessoa();
		boolean a = true;
		
		while(a == true) {
			System.out.println("-- Menu --");
			System.out.println("Digite o numero para selecionar");
			System.out.println("1 - Criar pessoa");
			System.out.println("2 - Mostrar pessoa criada");
			System.out.println("3 - Sair");
			resposta = l.next();
			
			switch(resposta) {
			case "1":
				System.out.println("Digite seu nome: ");
				p.setNome(l.next());
				System.out.println("Digite seu CPF: ");
				p.setCpf(l.next());
				System.out.println("Digite sua Idade: ");
				p.setIdade(l.nextInt());
				System.out.println("Digite seu Sexo: ");
				p.setSexo(l.next());
				System.out.println(" ");
				break;
			case "2":
				System.out.println("Nome: "+ p.getNome());
				System.out.println("CPF: "+ p.getCpf());
				System.out.println("Idade: "+ p.getIdade());
				System.out.println("Sexo: "+ p.getSexo());
				System.out.println(" ");
				break;
			case "3":
				System.out.println("Saindo...");
				a = false;
				break;
			}
		}
	}

}
