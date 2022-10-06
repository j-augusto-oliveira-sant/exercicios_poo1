package exercicios;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Exercicio: ");
		int escolha = scan.nextInt();
		System.out.println("---------------------");
		if (escolha==1) {
			exercicio1();
		} else if (escolha==2) {
			exercicio2();
		} else if (escolha==3) {
			exercicio3();
		} else if (escolha==4) {
			exercicio4();
		} else if (escolha==5) {
			exercicio5();
		} else if (escolha==6) {
			exercicio6();
		} else if (escolha==7) {
			exercicio7();
		} else if (escolha==8) {
			exercicio8();
		} else if (escolha==9) {
			exercicio9();
		} else if (escolha==10) {
			exercicio10();
		} else if (escolha==11) {
			exercicio11();
		}
		System.out.println("---------------------");
		scan.close();
	}
	
	public static void exercicio1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome:");
		String nome = scan.nextLine();
		System.out.println("Sobrenome:");
		String sobrenome = scan.nextLine();
		System.out.println(nome+" "+sobrenome);
		scan.close();
	}
	public static void exercicio2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("N1: ");
		int n1 = scan.nextInt();
		System.out.println("N2: ");
		int n2 = scan.nextInt();
		if (n1 > n2) {
			System.out.println("Inversao");
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		for (int i = n1; i <= n2; i++) {
			System.out.println(i);
		}
		scan.close();
	}
	public static void exercicio3() {
		Scanner scan = new Scanner(System.in);
		Calcular calc = new Calcular();
		System.out.println("N1: ");
		int n1 = scan.nextInt();
		System.out.println("N2: ");
		int n2 = scan.nextInt();
		System.out.println("1.Soma 2.Multiplicao 3.Divisao 4.Subtracao: ");
		int choice = scan.nextInt();
		double res=0;
		if (choice==1) {
			res = calc.soma(n1, n2);
		} else if (choice==2) {
			res = calc.multiplica(n1, n2);
		} else if (choice==3) {
			res = calc.divide(n1, n2);
		} else if (choice==4) {
			res = calc.subtrai(n1, n2);
		}
		System.out.println(res);
		scan.close();
	}
	public static void exercicio4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Salario Por Hora: ");
		double sal_hora = scan.nextDouble();
		System.out.println("Horas no Mes: ");
		double horas = scan.nextDouble();
		Calc_Imposto calc = new Calc_Imposto(sal_hora,horas);
		System.out.println("Salario Liquido: "+calc.salario_liquido());
		scan.close();
	}
	public static void exercicio5() {
		Scanner scan = new Scanner(System.in);
		String[] nomes = {"Cachorro Quente","Bauru Simples","Bauru com ovo","Hamburguer","Cheeseburguer",
				"Refrigerante"};
		double[] precos = {1.20,1.30,1.50,1.20,1.30,1};
		int[] quantidades = {0,0,0,0,0,0};
		String codigo;
		int valor = 0;
		System.out.println("Cachorro Quente 100 R$ 1,20\r\n"
				+ "Bauru Simples 101 R$ 1,30\r\n"
				+ "Bauru com ovo 102 R$ 1,50\r\n"
				+ "Hambúrguer 103 R$ 1,20\r\n"
				+ "Cheeseburguer 104 R$ 1,30\r\n"
				+ "Refrigerante 105 R$ 1,00");
		System.out.println("------------------");
		do {
			System.out.println("Codigo (digite sair): ");
			codigo = scan.nextLine().toLowerCase();
			if (!codigo.equals("sair")) {
				valor = Integer.parseInt(String.valueOf(codigo.charAt(codigo.length()-1)));
				System.out.println(valor);
				System.out.println("Quantidade: ");
				int quantidade = scan.nextInt();
				scan.nextLine();
				quantidades[valor] += quantidade;
			}
		} while (!codigo.equals("sair"));
		
		for (int i=0;i<6;i++) {
				System.out.println("-------------");
				System.out.println(nomes[i]+" "+(precos[i]*quantidades[i]));
				System.out.println("Quantidade: "+(quantidades[i]));
				System.out.println("Preco: "+(precos[i]));
				System.out.println("-------------");
		}
		
		scan.close();
	}
	public static void exercicio6() {
		Scanner scan = new Scanner(System.in);
		Quadrado quadrado = new Quadrado();
		System.out.println("Lado:");
		int l = scan.nextInt();
		quadrado.setLado(l);
		System.out.println("Lado = "+quadrado.getLado());
		System.out.println("Area = "+quadrado.getArea());
		scan.close();
	}
	public static void exercicio7() {
		Pessoa pessoa = new Pessoa("Carlos",10);
		pessoa.setAltura(1.00);
		pessoa.setPeso(40);
		for (int i=0;i<14;i++) {
			System.out.println("-------------");
			System.out.println(pessoa.getNome());
			pessoa.envelhecer();
			System.out.println("Idade: "+pessoa.getIdade());
			String[] alt = String.valueOf(pessoa.getAltura()).split("\\.");
			System.out.println("Altura: "+(alt[0])+" metros e "+(Integer.parseInt(alt[1].substring(0, 2)))+" cm");
		}
	}
	public static void exercicio8() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome:");
		String nome = scan.nextLine();
		Banco banco = new Banco(13242);
		banco.setNome(nome);
		System.out.println("Depositou 200");
		banco.depositar(200);
		System.out.println("Sacou 100");
		banco.saque(100);
		System.out.println("R$ "+banco.getSaldo());
		scan.close();
	}
	public static void exercicio9() {
		System.out.println("NAO EXISTE NA LISTA");
	}
	public static void exercicio10() {
		Scanner scan = new Scanner(System.in);
		Televisor tv = new Televisor();
		int comando=0;
		do {
			System.out.println(tv.imagem_televisor());
			System.out.println("CANAL ATUAL: "+tv.getCanal_atual());
			System.out.println("VOLUME: "+tv.getVolume());
			System.out.println("COMANDO (0 para sair) 1.mudar canal (faixa 0-2) 2.Volume:");
			comando = scan.nextInt();
			if (comando==1) {
				System.out.println("Canal:");
				int x = scan.nextInt();
				tv.mudar_canal(x);
			} else if (comando==2) {
				System.out.println("Volume:");
				int v = scan.nextInt();
				tv.alterar_volume(v);
			}
		} while(comando!=0);
		scan.close();
	}
	public static void exercicio11() {
		
	}
}
