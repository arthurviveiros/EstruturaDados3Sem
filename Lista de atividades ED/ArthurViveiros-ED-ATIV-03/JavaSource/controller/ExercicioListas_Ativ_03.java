package controller;

import javax.swing.JOptionPane;

public class ExercicioListas_Ativ_03 {
	
	public int tamanhoFifo = 0 ;
	public int primeiroFifo = 0;
	
	public int tamanhoPilha = 0;
	
	
	
	public void addValorFIFO(int listaFIFO[]) {
		
			if (tamanhoFifo == listaFIFO.length) {
				tamanhoFifo = 0;
			}
			
			listaFIFO[tamanhoFifo] = Integer.parseInt(JOptionPane.showInputDialog("Digite o int a ser colocado na lista FIFO"));
			
			tamanhoFifo++;
			
			
			if (primeiroFifo == tamanhoFifo) {
				primeiroFifo = tamanhoFifo + 1;
			}
			
			if (primeiroFifo == listaFIFO.length) {
				primeiroFifo = 0;
			}
			
			String listado = " ";
			
			for (int i = 0; i < listaFIFO.length; i++) {
				listado = listado + " " + listaFIFO[i];
			}
			JOptionPane.showMessageDialog(null,"Sua lista atual é:\n\n"+listado+"\n\nFIFO = primeiro valor que entrou, sai primeiro");
			

		}


	public void delValorFIFO(int[] listaFIFO) {
		
		listaFIFO[primeiroFifo] = 0;

		primeiroFifo++;
		
		if (primeiroFifo == listaFIFO.length) {
			primeiroFifo = 0;
		}
		
		String listado = " ";
		
		for (int i = 0; i < listaFIFO.length; i++) {
			listado = listado + " " + listaFIFO[i];
		}
		JOptionPane.showMessageDialog(null,"Sua lista atual é:\n\n"+listado+"\n\nFIFO = primeiro valor que entrou, sai primeiro");
		

	}


	public void addValorPILHA(int[] listaPILHA) {
		if (tamanhoPilha == listaPILHA.length) {
			tamanhoPilha = 0;
		}
		
		listaPILHA[tamanhoPilha] = Integer.parseInt(JOptionPane.showInputDialog("Digite o int a ser colocado na lista FIFO"));
		
		tamanhoPilha++;
		
		String listado = " ";
		
		for (int i = 0; i < listaPILHA.length; i++) {
			listado = listado + " " + listaPILHA[i];
		}
		JOptionPane.showMessageDialog(null,"Sua lista atual é:\n\n"+listado+"\n\nFIFO = primeiro valor que entrou, sai primeiro");
		

	}



	public void delValorPILHA(int[] listaPILHA) {
		
		listaPILHA[tamanhoPilha] = 0;
		
		if (tamanhoPilha != 0) {
			tamanhoPilha--;
		}

		
		
		String listado = " ";
		
		for (int i = 0; i < listaPILHA.length; i++) {
			listado = listado + " " + listaPILHA[i];
		}
		JOptionPane.showMessageDialog(null,"Sua lista atual é:\n\n"+listado+"\n\nPILHA = o último valor que entrou, sai primeiro");
		

	}
	
	

}
