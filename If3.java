/* Nama : Berlian Septiani
   Nim  : 13020210143
   Hari/Tanggal : 24 Maret 2023
   Waktu Pengerjaan : 23.30 */


import java.util.Scanner;

/* contoh pemakaian if 3 kasus */ /* membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >0 */
/* 'Nilai Nol , nilai a ', jika a = 0 */
/* 'Nilai a negatif , nilai a ', jika a <0 */

public class If3 {

	public static void main(String [] args ){
		int a;
		Scanner masukan = new Scanner(System.in);

		System.out.print (" Contoh IF tiga kasus \n");
		System.out.print (" Ketikkan suatu nilai integer : ");
		a=masukan.nextInt();
		if (a > 0){
			System.out.println ("Nilai a positif "+a);
		}else if (a == 0){
			System.out.print ("Nilai Nol "+a);
		}else /* a > 0 */ {
			System.out.print ("Nilai a negatif "+a);
		}

}


}