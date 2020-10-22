import java.util.Scanner;

public class PraktikumPBO_Quiz{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int total,bayar,harga = 0; 
		int Q,q,W,w,E,e = 0;
		int kembalian,banyak;
		char merk,tipe;
		String nama;
		boolean loop = true;
		
		bayar=0;	
		System.out.print("Nama Anda : ");
		nama = input.nextLine();
		
	    System.out.println("Merk :      Tipe  :      Harga ");
		System.out.println("G           Meja(M)      Rp.  95.000 ");
		System.out.println("            Kursi(K)     Rp. 125.000 ");
		System.out.println("            Lemari(L)    Rp. 450.000 ");
		System.out.println();
		System.out.println("O           Meja(M)      Rp. 115.000 ");
		System.out.println("            Kursi(K)     Rp. 135.000 ");
		System.out.println("            Lemari(L)    Rp. 550.000 ");
		
		System.out.print("Masukkan Merek : ");
		merk = input.next().charAt(0);
		while(loop){
		System.out.print("Masukkan tipe : ");
		
        tipe = input.next().charAt(0);
		

		 switch(tipe)
		 {
		 	case 'q':
            case 'Q'  :
               if (merk =='G')
               {harga = 95000;
               }
               else {harga = 115000;
               }
                loop = false;
                break;
           case 'w':     
           case 'W' :
               if (merk =='G')
               {harga = 125000;
               }
               else {harga = 135000;
               }
                loop = false;
                break;
                
		   case 'e':
           case 'E'  :
               if (merk =='G')
               {harga = 450000;
               }
               else {harga = 550000;
               }
                loop = false;
                break;
                        
           
               default :
                System.out.println("Pilihan tidak tersedia, Mohon input ulang");
               
                
        }
        
	  
	}
	
       System.out.println("Masukkan Banyak Pesanan : ");
       banyak = input.nextInt();
       total = banyak*harga;
       System.out.println("Total Harga : Rp. "+total);
      
       
		while(bayar<total){
		System.out.print("Masukkan Uang Anda = Rp."); 
		bayar = input.nextInt();
			if (bayar > total){
				kembalian=bayar-total;
			}
			else if (bayar<total){
				System.out.println("Mohon ditambah, Uang anda Kurang");
			}
		}
	   
	   kembalian = bayar - total;
		
		
		
	   System.out.println("Nama        : "+nama );
	   System.out.println("Total Harga : Rp."+total);
	   System.out.println("Bayar       : Rp."+bayar);
	   System.out.println("Kembalian   : Rp."+kembalian);
	    
	   
	    	
		
				
	}
}