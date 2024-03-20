public class RumusFisika {
    private float m, v, g, h;

    RumusFisika(float m){
        this.m = m;
    }
    RumusFisika(float m, float v){
        this.m = m;
        this.v = v;
    }
    RumusFisika(float m, float g, float h){
        this.m = m;
        this.g = g;
        this.h = h;
    }
 
    void setEnergiPotensial(float m,float g, float h){
        this.m = m;
        this.g = g;
        this.h = h;
    }
    void setEnergiKinetik(float m, float v){
        this.m = m;
        this.v = v;
    }
    void setMassaJenis(float m){
        this.m = m;
    }
  
    float getH(){      
        return h;
    }
    float getM(){      
        return m;
    }
    float getG(){
        return g;
    }
    float getV(){
        return v;
    }


}
