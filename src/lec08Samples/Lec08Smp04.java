package lec08Samples;

public class Lec08Smp04 {
	public static void main(String args[]){

		int a = 0;
		for (int i = 1; i <= 10; i++){
			a += i;
			System.out.print( "(" + i + ") " );  //(1)
			System.out.print(a);                 //(2)
			System.out.print(" ");               //(3)
		}
		System.out.println();                        //(4)
		System.out.println("1から10までの合計は,"+a+"です。"); //(5)
	}
}