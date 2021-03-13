package exercicio1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Mensagem> mensagens = new ArrayList<>();		
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("MENU\n1 - Criar mensagem\n"
					+ "2 - Enviar mensagem\n3 - Imprimir mensagem\n"
					+ "4 - Imprimir todas as mensagens\n5 - Imprimir tipo de mensagem\n6 - Sair "));
			switch(op) {
			case 1:{
				int tp = Integer.parseInt(JOptionPane.showInputDialog("Tipo de mensagem\n"
						+ "1 - SMS\n2 - ALERTA\n"));
				if(tp==1) {
					int cod = 1;
					String cont = JOptionPane.showInputDialog("Digite o conteudo da mensagem");
					String s = "Caixa de saída";
					Mensagem sms = new SMS(cod, cont, s);
					mensagens.add(sms);
				}else if(tp==2) {
					int cod = 2;
					String cont = JOptionPane.showInputDialog("Digite o conteudo da mensagem");
					String s = "Caixa de saída";
					Mensagem alerta = new Alerta(cod, cont, s);
					mensagens.add(alerta);
				}else {
					JOptionPane.showMessageDialog(null,"Opção inválida");
				}
				break;	
			}
			case 2:{
				int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da mensagem"));
				mensagens.get(num).enviarMensagem();
				JOptionPane.showMessageDialog(null,"Mensagem enviada");
				break;
			}
			case 3:{
				int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da mensagem"));
				mensagens.get(num).imprimirMensagem(mensagens.get(num).getCodigo());
				break;
			}
			case 4:{
				for(int i=0;i<mensagens.size();i++) {
					mensagens.get(i).imprimirMensagem(mensagens.get(i).getCodigo());
				}
				break;
			}
			case 5:{
				int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da mensagem"));
				if(mensagens.get(num)instanceof SMS) {
					JOptionPane.showMessageDialog(null,"Essa mensagem é um SMS");
				}else if(mensagens.get(num)instanceof Alerta) {
					JOptionPane.showMessageDialog(null,"Essa mensagem é um ALERTA");
				}
				break;
			}
			case 6:{
				JOptionPane.showMessageDialog(null,"Progarama finalizado!");
				break;
			}
			default:{
				JOptionPane.showMessageDialog(null,"Opção inválida, digite novamente.");
			}
			}	
		}while(op!=6);

	}

}
