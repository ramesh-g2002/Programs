
public class A1 {
	String s;
	double toi;
	double hindu;
	double et;
	double bm;
	double ht;
	


	public A1(String string, double d, double e, double f, double g, double h) {
		// TODO Auto-generated constructor stub
		this.s=setS(s);
		this.toi=setToi(toi);
		this.hindu=setHindu(hindu);
		this.et=setEt(et);
		this.bm=setBm(bm);
		this.ht=setHt(ht);
	}


	public void  A1(String s,double toi,double hindu,double et, double bm,double ht)
	{
		this.s=s;
		this.toi=toi;
		this.hindu=hindu;
		this.et=et;
		this.bm=bm;
		this.ht=ht;
	}
	

	public String getS() {
		return s;
	}
	public String setS(String s) {
		return this.s = s;
	}
	public double getToi() {
		return toi;
	}
	public double setToi(double toi) {
		return this.toi = toi;
	}
	public double getHindu() {
		return hindu;
	}
	public double setHindu(double hindu) {
		return this.hindu = hindu;
	}
	public double getEt() {
		return et;
	}
	public double setEt(double et) {
		return this.et = et;
	}
	public double getBm() {
		return bm;
	}
	public double setBm(double bm) {
		return this.bm = bm;
	}
	public double getHt() {
		return ht;
	}
	public double setHt(double ht) {
		return this.ht = ht;
	}
}