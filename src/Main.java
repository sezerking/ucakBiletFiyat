import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double tutar,indirimliTutar,indirimOrani,ciftYonIndirimi,toplamTutar=0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Lütfen gideceğiniz mesafeyi KM cinsinden giriniz: ");
        mesafe=scn.nextInt();
        if (mesafe<0){
            System.out.println("Geçersiz bir değer girdiniz");
        }

        System.out.println("Lütfen yaşınızı giriniz: ");
        yas=scn.nextInt();
        

        System.out.println("Lütfen yolculuk tipinizi seçiniz(Tek yön için 1, Gidiş-Dönüş için 2): ");
        yolculukTipi=scn.nextInt();

        if(yas<0||mesafe<0 || yolculukTipi<1||yolculukTipi>2){
            System.out.println("Hatali Giris");
        }else {
            if (yolculukTipi==2){
                if (yas<12){
                    indirimOrani=0.5;
                    tutar=mesafe*0.10;
                    indirimliTutar=tutar-(tutar*indirimOrani);
                    ciftYonIndirimi=indirimliTutar*0.20;
                    toplamTutar=(indirimliTutar-ciftYonIndirimi)*2;


                } else if (yas<=24) {
                    indirimOrani=0.1;
                    tutar=mesafe*0.10;
                    indirimliTutar=tutar-(tutar*indirimOrani);
                    ciftYonIndirimi=indirimliTutar*0.20;
                    toplamTutar=(indirimliTutar-ciftYonIndirimi)*2;
                }
                else if (yas>=65){
                    indirimOrani=0.3;
                    tutar=mesafe*0.10;
                    indirimliTutar=tutar-(tutar*indirimOrani);
                    ciftYonIndirimi=indirimliTutar*0.20;
                    toplamTutar=(indirimliTutar-ciftYonIndirimi)*2;
                } else {
                    indirimOrani=0;
                    tutar=mesafe*0.10;
                    indirimliTutar=tutar-(tutar*indirimOrani);
                    ciftYonIndirimi=indirimliTutar*0.20;
                    toplamTutar=(indirimliTutar-ciftYonIndirimi)*2;
                }
            }
            else {
                if (yas<12){
                    indirimOrani=0.5;
                    tutar=mesafe*0.10;
                    indirimliTutar=tutar-(tutar*indirimOrani);
                    toplamTutar=indirimliTutar;
                } else if (yas<=24) {
                    indirimOrani=0.1;
                    tutar=mesafe*0.10;
                    indirimliTutar=tutar-(tutar*indirimOrani);
                    toplamTutar=indirimliTutar;
                }
                else if (yas>=65){
                    indirimOrani=0.3;
                    tutar=mesafe*0.10;
                    indirimliTutar=tutar-(tutar*indirimOrani);
                    toplamTutar=indirimliTutar;
                } else {
                    indirimOrani=0;
                    tutar=mesafe*0.10;
                    indirimliTutar=tutar-(tutar*indirimOrani);
                    toplamTutar=indirimliTutar;
                }
            }
        }


        System.out.println(toplamTutar);

    }
}
