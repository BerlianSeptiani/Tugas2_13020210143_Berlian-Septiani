/* Nama : Berlian Septiani
   Nim  : 13020210143
   Hari/Tanggal : 25 Maret 2023
   Waktu Pengerjaan : 00.15 */



import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan while (ringkas) */
public class PrintWhile1 {

	public static void main(String[] args) {
		int N;
		int i = 1;
		Scanner masukan=new Scanner(System.in);
		/* Program */
		System.out.print ("Nilai N >0 = ");
		N=masukan.nextInt();
		System.out.print ("Print i dengan WHILE (ringkas) : \n");
		while (i <= N){
			System.out.println (i++);
		} /* (i > N)*/

}

}