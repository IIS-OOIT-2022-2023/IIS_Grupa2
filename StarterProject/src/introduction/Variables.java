package introduction;

public class Variables {

	public static void main(String[] args) {
		
		// Deklaracija promenljive
		double firstNumber;
		
		// Inicijalizacija promenljive
		firstNumber = 1;
		
		double secondNumber = 5;
		
		double doubleResult = (firstNumber / secondNumber);
		System.out.println(doubleResult);
		
		int result = (int) (firstNumber / secondNumber);
		System.out.println(result);
		
		boolean alwaysTrue = true;
		boolean alwaysFalse = false;
		// Logički operator
		// Konjunkcija (AND)
		System.out.println(alwaysTrue && alwaysFalse); //false 
		// Disjunkcija (OR)
		System.out.println(alwaysTrue || alwaysFalse); //true
		// Negacija
		System.out.println(!alwaysTrue); //false
		
		
		// Konkatenacija stringova
		String name = "Petar";
		String lastName = "Petrovic";
		System.out.println(name + " " + lastName + " Njegoš");
		
		//faktorijel broja 5
		int number = 5;
		int factoriel = 1;
				
		while (number >= 1) 
		{
			factoriel = factoriel * number;
			number--;
					
		}
		System.out.println("Faktorijel broja 5 je: " + factoriel);
		
		//Neparni brojevi od 1 do 10
		for(int i = 0; i<=10; i++) {
			if(i%2 != 0)
				System.out.println(i);
		}
		
	}

}
