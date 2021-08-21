public class Kedi {
	private String ad;
	private int yas;
	private String renk;
	
	Kedi(String ad, int yas, String renk) {
		this.ad = ad;
		this.yas = yas;
		this.renk = renk;
	}
	
	public String GetAd() {
		return ad;
	}
	
	public void SetAd(String ad) {
		this.ad = ad;
	}
	
	public int  GetYas() {
		return yas;
	}
	
	public void SetYas(int yas) {
		this.yas = yas;
	}
	
	public String GetRenk() {
		return renk;
	}
	
	public void ses() {
		System.out.println("Miav Miav");
	}
	
	public void yurumek() {
		System.out.println("Yuruyor");
	}
	
	public void uyumak() {
		System.out.println("Kedi uyuyor");
	}
	
	public void bilgiler() {
		System.out.println("Ad: " + ad + "\nYas: " + yas + "\nRengi: " + renk);
	}
	public static void main(String[] args) {
		Kedi kedi1 = new Kedi("Lila", 3, "Beyaz");
		
		kedi1.bilgiler();	
	}
}
