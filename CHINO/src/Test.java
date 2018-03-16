
public class Test {

	public static void main(String[] args) {
		// COMIDA RESTAURANTE 

		Chinos chimpin=new Chinos("Chiao", "Jefe de sala", "macho");
		System.out.println(chimpin);
		//para nuemeros decimales tenemos que meter float con una f al final. 
		Comida china=new Comida("CHINA", "fin de semana", 20.30f);
		System.out.println(china);
		Restaurante_chino pekin=new Restaurante_chino(40, 100, "Pekin", "Calle de la ilustración nº20", chimpin, china);
		System.out.println(pekin);
		
		
	}

}
