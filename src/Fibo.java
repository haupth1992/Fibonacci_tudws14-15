import java.io.*;

public class Fibo {
	
	int[] fibo;
	
	public Fibo(int laenge){   //Array mit gewünschter Länge
		this.fibo = new int[laenge];
	}
	
	public void fibonacci(){
		for(int i=0; i<this.fibo.length; i++){
			if ((i == 0) || (i == 1)){
				this.fibo[i] = 1; //ersten beiden Zahlen die 1 zuweisen
			}
			else {
				this.fibo[i] = this.fibo[i-1] + this.fibo[i-2]; //Summe aus vorherigen Zahlen
			}
			System.out.println(this.fibo[i] + " ");
		}
	}
	
	public void fibonacci_rec(int i){
		if (i<15){
			if ((i == 0) || (i == 1)){
				this.fibo[i] = 1;
			} else {
				this.fibo[i] = this.fibo[i-1] + this.fibo[i-2];
			}
			System.out.println(this.fibo[i] + " ");
			i++;			      	//Yo Dawg, I heard you like methods
			fibonacci_rec(i);	//so i put a method in your method
		}
	}
	

	public static void main(String[] args) {
		//Beispiel für eine Usereingabe der Laenge
		/*
		System.out.println("Wieviele Elemente sollen berechnet werden?");
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
		String number = "1";
		try {
			number = bufferedreader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int laenge = Integer.parseInt(number);
		*/
		
		int laenge = 15; //auskommentieren wenn Usereingabe genutzt werden soll
		
		Fibo fibo = new Fibo(laenge);
		
		//nicht rekursiv
		fibo.fibonacci();
		//rekursiv
		fibo.fibonacci_rec(0);
	}
}
