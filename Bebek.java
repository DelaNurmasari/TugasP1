public class Bebek {
    String bulu, mata, paruh, sayap, kaki;

    public void setBulu(String bulu) {
        this.bulu = bulu;
    }

    public void setMata(String mata) {
        this.mata = mata;
    }

    public void setMulut(String paruh) {
        this.paruh = paruh;
    }

    public void setTelinga(String sayap) {
        this.sayap = sayap;
    }

    public void setKaki(String kaki) {
        this.kaki = kaki;
    }

    public String getBulu() {
        return bulu;
    }

    public String getMata() {
        return mata;
    }

    public String getParuh() {
        return paruh;
    }

    public String getSayap() {
        return sayap;
    }

    public String getKaki() {
        return kaki;
    }
    void bermain(String a) {
        System.out.println("kwek kwek kwek" + a);
    }

    void makan() {
        System.out.println("KWEK KWEK KWEKKK!!");
    }
}