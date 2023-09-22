
public class Karakter {
	
	 private String isim;
	    private int canPuan;
	    private int saldiriGucu;
	    private int savunma;
	    Esya[] esyalar;
	    int esyaIndeks; 

	    public Karakter(String isim, int canPuan, int saldiriGucu, int savunma) {
	        this.isim = isim;
	        this.canPuan = canPuan;
	        this.saldiriGucu = saldiriGucu;
	        this.savunma = savunma;
	        this.esyalar = new Esya[5]; 
	        this.esyaIndeks = 0; 
	    }
	    
	    public String getIsim() {
	        return isim;
	    }

	    public int getCanPuan() {
	        return canPuan;
	    }

	    public void setCanPuan(int canPuan) {
	        this.canPuan = canPuan;
	    }

	    public int getSaldiriGucu() {
	        return saldiriGucu;
	    }

	    public int getSavunma() {
	        return savunma;
	    }
	    public void addItem(Esya esya) {
	        if (esyaIndeks < esyalar.length) {
	            esyalar[esyaIndeks] = esya;
	            esyaIndeks++;
	            System.out.println(esya.getAd() + " eklendi.");
	        } else {
	            System.out.println("Eşya eklenemedi, eşya limitine ulaşıldı.");
	        }
	    }

	    public void listItems() {
	        System.out.println("----- " + isim + "'in Eşyaları -----");
	        for (int i = 0; i < esyalar.length; i++) {
	            if (esyalar[i] != null) {
	                System.out.println(esyalar[i]);
	            }
	        }
	        System.out.println("----------------------------");
	    }

	    @Override
	    public String toString() {
	        return isim + " (Can Puanı: " + canPuan + ", Saldırı Gücü: " + saldiriGucu + ", Savunma: " + savunma + ")";
	    }
	}



