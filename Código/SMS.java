package exercicio1;

import javax.swing.JOptionPane;

public class SMS extends Mensagem {
	public SMS (int codigo, String conteudo, String status) {
		super(codigo, conteudo, status);
	}

	@Override
	public void imprimirMensagem(int codigo) {
		JOptionPane.showMessageDialog(null,"SMS" + "\nConteudo: " + getConteudo() +
				"\nStatus: "+getStatus() + "\n");
	}

	@Override
	public void enviarMensagem() {
		setStatus("Enviada");
	}
	
}
