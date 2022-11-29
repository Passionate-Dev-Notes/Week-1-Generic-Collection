package generic;

public class Main {

	public static void main(String[] args) {
		FileReader readerObj=new FileReader();
		MapData dataObj=readerObj.readFile("E:data.txt");
		dataObj.display();

	}

}
