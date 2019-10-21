
public class Paragraph implements Element{
	public String Nume;
	
	public Paragraph() {}
	public Paragraph(String N) {
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
	
	public void print() {
		System.out.println(Nume);
		
	}
}
