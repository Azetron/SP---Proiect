
public class Main {

	public static void main(String[] args) throws Exception {
		
		Book discatitanic = new Book("Disca Titani");
		Author a1 = new Author("Muresan");
		discatitanic.addAuthor(a1);
		
		//int indexOfParagraph = chpOneOne.createParagraph("Paragraph");
		//int indexOfImage = chpOneOne.createImage("Image");
		//int indexOfTable = chpOneOne.createTable("Table1");
		
		Book noapteBuna = new Book("Noapte buna, copii!");
		Author Radu = new Author("Radu Pavel Gheo");
		noapteBuna.addAuthor(Radu);
		
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolu 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Subchapter 1.1.1.1");
		noapteBuna.addContent(new Paragraph("Multumesc celor care au facut posibila..."));
		noapteBuna.addContent(cap1);
		
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragraph("Text from subchapter 1.1"));
		cap11.add(cap111);
		cap111.add(new Paragraph("Text from subchapter 1.1.1"));
		cap111.add(cap1111);
		cap1111.add(new Image("Image subchapter 1.1.1.1"));
		
		noapteBuna.print();
	}

}
