package exercicio1;

public abstract class Mensagem implements InterfaceMensagem {
	private int codigo;
	private String conteudo;
	private String status;
	
	public Mensagem(int codigo, String conteudo, String status) {
		this.codigo = codigo;
		this.conteudo = conteudo;
		this.status = status;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
