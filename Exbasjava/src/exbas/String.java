package exbas;

public class String {

	public String() {
		// TODO Auto-generated constructor stub
	}

	public static void main(java.lang.String[] args) {
		String str = "Isto é uma String do Java";
		String xyz = new String("Isto é uma String do java");
		if(str == xyz) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if (str.equals(xyz)){
			//MAEIRA CORRETA DE SE COMPARAR O CONTEÚDO DAS STRINGS
		}
System.out.println("Tamanho da String: "+ str.length());
System.out.println("SubString: "+ str.substring(0, 10));
System.out.println("Caracter na posição 5: "+ str.charAt(5));
}
}
