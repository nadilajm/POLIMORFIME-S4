public class MassaJenis extends RumusFisika {
    float vol = 4;
    MassaJenis(float m){
        super(m);        
     }
 
     float getHasil(){
         float m = super.getM();
         return m/vol;
     }
 
     public String toString(){
         return "Energi Kinetik : " + getHasil() + " Joule";
     }
 
     void info(){
         System.out.println("Massa : " + getM() + " g");
         System.out.println("Kecepatan : " + vol + " m/s2");
     }
}
