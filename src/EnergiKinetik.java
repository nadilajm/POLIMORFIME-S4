public class EnergiKinetik extends RumusFisika {
    
    EnergiKinetik(float m, float v){
       super(m, v);        
    }

    float getHasil(){
        float m = super.getM();
        float v = super.getV();

        return 0.5F * m * (v * v);
    }

    public String toString(){
        return "Energi Kinetik : " + getHasil() + " Joule";
    }

    void info(){
        System.out.println("Massa : " + getM() + " g");
        System.out.println("Kecepatan : " + getV() + " m/s2");
    }
}
