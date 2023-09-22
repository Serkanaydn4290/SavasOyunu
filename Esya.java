
public class Esya {
	
	private String ad;
    private int iyilestirmeMiktari;

    public Esya(String ad, int iyilestirmeMiktari) {
        this.ad = ad;
        this.iyilestirmeMiktari = iyilestirmeMiktari;
    }

    public String getAd() {
        return ad;
    }

    public int getIyilestirmeMiktari() {
        return iyilestirmeMiktari;
    }

    @Override
    public String toString() {
        return ad + " (İyileştirme Miktarı: " + iyilestirmeMiktari + ")";
    }
}



