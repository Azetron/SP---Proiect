
public class Image implements Element{
	public String Nume;
	
	public Image() {}
	public Image(String N) {
		this.Nume = N;
	}
	public String getNume() {
		return Nume;
	}
	public void setNume(String nume) {
		Nume = nume;
	}
	public String toString() {
		return this.Nume;
	}
	@Override
	public void print() {
		System.out.println(Nume);
		
	}
}
