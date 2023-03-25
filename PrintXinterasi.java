/* Nama : Berlian Septiani
   Nim  : 13020210143
   Hari/Tanggal : 25 Maret 2023
   Waktu Pengerjaan : 00.35 */


import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */

public class PrintXinterasi {
	
	public static void main(String[] args){
		int Sum=0;
		int x;
		Scanner masukan=new Scanner(System.in);
		/* program */
		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt(); /* First Elmt */
		if (x==999){
			System.out.print ("Kasus kosong \n");
		}else{	/* Minimal ada satu data yang dijumlahkan */
			Sum= x;	/* Inisialisasi !! */
			for (;;){
				System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
				x=masukan.nextInt(); /* Next Element */
				if(x==999)
					break;
				else{
					Sum = Sum + x;	/* Proses */
				}
			}		
		}
		System.out.println("Hasil Penjumlahan = "+Sum);
		/* Terminasi */

}


}