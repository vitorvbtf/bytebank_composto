
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente mariana = new Cliente();
		mariana.nome = "Mariana Galvão Sampaio";
		mariana.cpf = "123.456.789-12";
		mariana.profissao = "Advogada";
		
		Conta contaDaMariana = new Conta();
		contaDaMariana.deposita(100);
		
		contaDaMariana.titular = mariana;
		System.out.println(contaDaMariana.titular.nome);
		System.out.println(contaDaMariana.titular);
		System.out.println(contaDaMariana.titular);
		System.out.println(contaDaMariana.titular.cpf);
	}

}
