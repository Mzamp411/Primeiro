package exbas;

public class String1 {

	public static void main(String[] args) {
		String str = "Isto � uma String do Java";
		
		//O m�todo split quebra a String e v�rias outras,
		//pelo separador desejado
		String[] palavras = str.split(" ");
		
		int i = str.indexOf("uma"); //retorna o �ndice da palavra na String
		
		if(str.startsWith("ol�") || str.endsWith("Mundo!")){
			// testa o come�o e o fim da String - retorna boolean
		}
		str = str.trim(); //elimina os espa�os em branco no in�cio e fim
		
		str = str.replace('a', '0'); //substitui os caracteres
		
		// substitui uma palavra (usa express�es regulares)
		str = str.replaceAll("String", "Cadeia de caracteres");
	}

}
