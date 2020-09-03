package br.com.fatec.model;

import java.util.Date;

import br.com.fatec.control.Leitor;

import java.util.Date;
import java.time.LocalDateTime;

public class Tempo{

	  Date data;
	  Leitor leitor = new Leitor();

	  // informando a data/hora de sa�da do ve�culo no estacionamento
	public long anotarSa�da(long tempo){
			data = new Date();
			
			long d = 0;
			
			do {

				System.out.print("\nInforme a data e a hora de sa�da...\nDia: ");
			  data.setDate(leitor.getValor()); // Informa o dia

				System.out.print("M�s: ");
				data.setMonth(leitor.getValor() - 1);// Informa o m�s
	      // o setMouth() pega os valores de m�s na varia��o de 0-11
				
				System.out.print("Hora: ");
				data.setHours(leitor.getValor());

				System.out.print("Minutos: ");
				data.setMinutes(leitor.getValor());

				d = data.getTime();  

				if(d < tempo)  {
					System.out.println("Data e/ou hor�rio inv�lido");
				}

			}while(d < tempo);
			
			return d;
	} 
	}