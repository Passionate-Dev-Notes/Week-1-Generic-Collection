package generic;

public class Main {

	public static void main(String[] args) {
		FileReader readerObj=new FileReader();
		MapData dataObj=readerObj.readFile("C:\\Users\\Rituraj.singh\\Desktop\\data.txt");
		dataObj.display();

	}

}
