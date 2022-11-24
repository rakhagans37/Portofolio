import java.util.*;
public class Project{
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        boolean kondisi = true;
        System.out.print("KETIK 'X' UNTUK MEMULAI = ");
        String mulai = user.next();
        if (mulai.equals("X")){
        while(kondisi){
            System.out.println("TULIS A JIKA INGIN PERSEGI");
            System.out.println("TULIS B JIKA INGIN TRAPESIUM");
            System.out.println("TULIS C JIKA INGIN SEGITIGA");
            System.out.println("TULIS D JIKA INGIN BELAH KETUPAT");
            System.out.println("TULIS E JIKA INGIN JAJAR GENJANG");
            System.out.println("TULIS F JIKA INGIN LAYANG LAYANG");
        
        String menu = user.next();
        if(menu.equals("A")){
            System.out.print("Masukkan Panjang = ");
            int panjang = user.nextInt();
            System.out.print("Masukkan Lebar = ");
            int lebar = user.nextInt();
            persegi(panjang, lebar);
        }
        if(menu.equals("B")){
            System.out.print("Masukkan Panjang Atas = ");
            int panjangAtas = user.nextInt();
            System.out.print("Masukkan Panjang Bawah = ");
            int panjangBawah = user.nextInt();
            System.out.print("Masukkan Tinggi = ");
            int tinggi = user.nextInt();
            trapesium(panjangAtas, panjangBawah, tinggi);
        }
        if(menu.equals("C")){
            System.out.print("Masukkan Alas = ");
            int alas = user.nextInt();
            System.out.print("Masukkan Tinggi = ");
            int tinggi = user.nextInt();
            segitiga(alas, tinggi);
        }
        if(menu.equals("D")){
            System.out.print("Masukkan Diagonal Satu = ");
            int d1 = user.nextInt();
            System.out.print("Masukkan Diagonal Dua = ");
            int d2 = user.nextInt();
            belahKetupat(d1,d2);
        }
        if(menu.equals("E")){
            System.out.print("Masukkan alas = ");
            int alas = user.nextInt();
            System.out.print("Masukkan Tinggi = ");
            int tinggi = user.nextInt();
            jajarGenjang(alas, tinggi);
        }
        if(menu.equals("F")){
            System.out.print("Masukkan Diagonal Tinggi = ");
            int d1 = user.nextInt();
            System.out.print("Masukkan Diagonal Lebar = ");
            int d2 =  user.nextInt();
            layanglayang(d1,d2);
        }
        System.out.println("");
        System.out.println("==>KETIK 'S' JIKA INGIN BERHENTI ");
        System.out.println("==>KETIK HURUF APAPUN JIKA INGIN LANJUT");
        String kondisi1 = user.next();
        if(kondisi1.equals("S")){
            System.out.println("==PROGRAM SELESAI==");
            kondisi = false;
        }
    }
}
}
    


    private static void persegi(int panjang,int lebar){
        
        for(int y = 0; y < lebar ; y++){
            System.out.println("");
            for(int x = 0 ; x < panjang ; x++){
                System.out.print("* ");
            }
        }
        System.out.print("\n");
        int luas = panjang*lebar;
        System.out.println("Luas = " + luas);
        int keliling = (panjang+lebar)*2;
        System.out.println("Keliling = " + keliling);
        //PERSEGI DAN PERSEGI PANJANG
    }
    private static void trapesium(int panjangAtas, int panjangBawah, int tinggi){
        for(int y = 1; y <= tinggi; y++){
            System.out.println("");
            for(int x = 1; x <= 1000000 ;x++){
            if(x - y > panjangAtas -1){
                break;
            }
            else if(y > tinggi){
                break;
            }
            System.out.print("* ");}
        }
        float garing = (float) Math.sqrt(Math.pow(tinggi,2) + Math.pow(panjangBawah - panjangAtas,2));
        float luas = (float) ((panjangAtas+panjangBawah)*tinggi)/2;//TRAPESIUM
        float keliling = (float) (panjangAtas + panjangBawah + tinggi + garing);
        System.out.println("");
        System.out.println("Luas = " + luas);
        System.out.println("Keliling = "+ keliling);
    }
    private static void segitiga(int alas, int tinggi){
        for(int y = 1; y <= tinggi ; y++){
            System.out.println("");
            for(int x = 1; x <= 1000000 ; x++){
            if(x - y >= 1 && x > 1){
                break;
            }
                System.out.print("* ");
            }
        }
        float garing = (float) Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
        System.out.println("");
        float luas = (float)(alas*tinggi)/2;
        float keliling = (float)(alas + tinggi + garing);
        System.out.println("Luas = " + luas);
        System.out.println("Keliling = "+ keliling);
    }
    private static void belahKetupat (int d1, int d2){
        for(int y = 1 ;y <= 5; y++){
            System.out.println("");
            for(int x = 1;x <= 5; x++){
                if(x-y >= 3){
                    break;
                }
                else if(x+y >= 9){
                    break;
                }
                else if(x < 3 && y < 3 && x+y <= 3){
                    System.out.print("  ");
                    continue;
                }
                else if (x < 3 && y > 3 && x-y <= -3){
                    System.out.print("  ");
                    continue;
                }
            System.out.print("* ");
            }
        }
            System.out.println("");
            float garing = (float) Math.sqrt(Math.pow(d1/2,2)+Math.pow(d2/2,2));
            Float luas = (float) (d1*d2)/2;
            Float keliling = (float) (garing*4); 
            System.out.println("Luas = " + luas);
            System.out.println("Keliling = "+ keliling);
    }
    private static void jajarGenjang(int alas, int tinggi){
        for(int y = 1 ; y <= 4 ;y++){
            System.out.println("");
            for(int x = 1 ; x <=10 ;x++){
                if(x < 4 && x + y <= 4){
                    System.out.print("  ");
                    continue;
                }
                else if(x > 7 && x+y >=12){
                    System.out.print("  ");
                    continue;
                }
                
                System.out.print("* ");
            }
        }
            System.out.println("");
            float garing = (float) Math.sqrt(Math.pow(tinggi/Math.sqrt(3),2) + Math.pow(tinggi,2));
            float luas = (float) (alas * tinggi);
            float keliling = (float) (alas + garing)*2;
            System.out.println("Luas = " + luas);
            System.out.println("Keliling = " + keliling);
    }
    private static void layanglayang(int d1, int d2){
        for(int y = 1; y <= 7 ; y++){
            System.out.println("");
            for(int x = 1; x <= 5; x++){
                if (x - y > 2 ){
                    break;
                }
                else if (x + y < 4){
                    System.out.print("  ");
                    continue;
                }
                else if (x < 3 && y > 3 && y/x >= 3 ){
                    System.out.print("  ");
                    continue;
                }
                else if (x > 4 && y > 3 ){
                    System.out.print("  ");
                    continue;
                }
                else if (x > 3 && y > 5){
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            } 
            
        }
        System.out.println("");
        float garing1 = (float) Math.sqrt(Math.pow(d2/2,2) + Math.pow(d2/2,2));
        float garing2 = (float) Math.sqrt(Math.pow(d1-(d2/2),2) + Math.pow(d2/2,2));
        float luas = (float) (d1*d2)/2;
        float keliling = (float) (garing1 + garing2)*2;
        System.out.println("Luas = " + luas);
        System.out.println("Keliling = "+ keliling);
    }
}