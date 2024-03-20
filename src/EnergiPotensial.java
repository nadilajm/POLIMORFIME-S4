public class EnergiPotensial extends RumusFisika {
    
    EnergiPotensial(float m, float g, float h){
        super(m, g, h);
    }

    float getHasil(){
        float m = super.getM();
        float g = super.getG();
        float h = super.getH();

        return m * g * h;
    }

    public String toString(){
        return "Energi Potensial :" + getHasil() + " Joule";
    }

    void info(){
        System.out.println("Massa : " + getM() + " g");
        System.out.println("Gravitasi : " + getG() + " m/s2");
        System.out.println("Ketinggian : " + getH() + " m");
    }
}
