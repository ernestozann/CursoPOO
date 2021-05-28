import java.util.ArrayList;
import java.util.Map;

class UberVan {
	Map<String, ArrayList<String,Integer>> typeCarAccepted;
	ArrayList<String> seatsMaterial;

	public UberVan(String license, Account driver, String brand, String model,Map<String, ArrayList<String,Integer>> typeCarAccepted,ArrayList<String> seatsMaterial){
		super(license, driver);
		this.typeCarAccepted = typeCarAccepted;
		this.seatsMaterial = seatsMaterial;
	}
}