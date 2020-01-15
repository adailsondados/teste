package Logica_Programacao;

import java.util.Scanner;

public class loops 
{
	public static void repet_while()//exemplo de um comando while
	{
		Scanner ler=new Scanner(System.in);
		int numero=0;
		String numerorec;
		
		/*primeiro execulta o teste para depois mostrar o que tem dentro da condicional*/
		while(numero<0)
		{
			System.out.println("digite os nomes");
			numerorec=ler.next();
			numero++;
			System.out.println(numerorec);
			if(numero==4)
			{
				System.out.println("fim");
			}
		}
	}
	
	public static void do_while()
	{
		/*primeiro execulta a linha de comando para depois fazer os testes*/
		
		int numero=0;
		do
		{
			System.out.println(numero);
			numero++;
		}
		while(numero<0);
	}
	
	public static void repet_for()
	{
		int n;
		for( n=1; n<=3;)
		{
			System.out.println(n);
			n++;
		}
	}
	
	public static void main(String[] args) 
	{
		
	}

}
