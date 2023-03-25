/* Nama : Berlian Septiani
   Nim  : 13020210143
   Hari/Tanggal : 25 Maret 2023
   Waktu Pengerjaan : 00.10 */





import java.util.Scanner;

/* Baca N, Print i = 1 s/d N dengan WHILE */
public class PrintWhile {

	public static void main(String[] args ) {
		int N;
		int i;
		Scanner masukan=new Scanner(System.in);
		/* program */
		System.out.print ("Nilai N >0 = "); /* Inisialisasi */
		N = masukan.nextInt();
		i = 1;	/* First Elmt */

		System.out.print ("Print i dengan WHILE : \n");
		while (i <= N ) /* Kondisi pengulangan */
		{ System.out.println (i) ; /* Proses*/
		i++; /* Next Elmt */
		}; /* (i > N )*/


}



}