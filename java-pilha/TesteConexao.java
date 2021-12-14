
public class TesteConexao {
	public static void main(String[] args) {
		
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexao.");
		}
		
		
		//------------------------------
		//AMBOS OS CODIGOS S�O EQUIVALENTE, O DE CIMA PODE SER IMPLEMENTADO APARTIR DO JAVA 1.7
		//------------------------------
		
		
		
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		}
//		catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conex�o.");
//		}finally {
//			if(con != null)
//				con.close();	
//		}
		
	}
}
