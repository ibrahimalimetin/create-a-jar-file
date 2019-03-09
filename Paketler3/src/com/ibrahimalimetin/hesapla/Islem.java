/*Bir Java dosyası derlediğinde JVM tarafından anlaşılması için class 'a dönüştürülür. 
Yazmış olduğumuz projemizi JAR dosyasına çevimek için ilgili projede sağa tıklanır --> Properties seçeneğine gidilir --> Packaging seçeneği seçilir ve tüm checkboxlar tiklenerek Ok denilir 
--> Sonrasında prijemizde Clean and Build diyerek .java uzantılı dosyalar .class uzantılı dosyalara dönüştürülür. */
package com.ibrahimalimetin.hesapla;

/**
 *
 * @author Ibrahim Ali Metin
 */
public class Islem implements IIslem {

    @Override
    public void toplama(int a, int b) {
         System.out.println("Toplama sonucu : " + (a+b));
    }

    @Override
    public void cikartma(int a, int b) {
         if (a > b){
             
             System.out.println("Çıkartma sonucu : " + (a - b));
             
         }else{
             
             System.out.println("Çıkartma sonucu : " + (b - a));
         }
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("Çarpma sonucu : " + (a*b));
    }

    @Override
    public void bolme(int a, int b) {
         System.out.println("Bölme sonucu : " + ((double)a / b));
    }
    
}
