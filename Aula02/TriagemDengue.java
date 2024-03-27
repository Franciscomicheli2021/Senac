package dengue;

public class TriagemDengue {
	public static void main (String[] args) {
		
		String dengue = "";
		dengue += verificaSintomas("Dor de Cabeça");
		dengue += verificaSintomas("Febre");
		dengue += verificaSintomas("Dor atras dos olhos");
		dengue += verificaSintomas("Dor nas Articulações");
		
		System.out.println(dengue);
		
		diagnostico(dengue);
	}
	
	private static void diagnostico(String dengue) {
		boolean d1 = dengue.contains("Dor de Cabeça");
		boolean d2 = dengue.contains("Febre");
		boolean d3 = dengue.contains("Dor atras dos olhos");
		boolean d4 = dengue.contains("Dor nas Articulações");
		
		boolean diagnosticoFinal = d1&&d2&&d3&&d4;
		
		System.out.println("A pessoa está com dengue?" + diagnosticoFinal);
	}
	
	private static String verificaSintomas(String sintomas) {
		return String.format("%s \n", sintomas);
	}
}
