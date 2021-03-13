package exercicio1;

import javax.swing.JOptionPane;

public class Alerta extends Mensagem {
	public Alerta(int codigo, String conteudo, String status) {
		super(codigo, conteudo, status);
	}

	@Override
	public void imprimirMensagem(int codigo) {
		JOptionPane.showMessageDialog(null,"ALERTA" + "\nConteudo: "+getConteudo()+
				"\nStatus: "+getStatus()+"\n");
	}

	@Override
	public void enviarMensagem() {
		setStatus("Enviada");
		
	}
	
}
