public class StoreDB {
	
	public static Facility getStoreByDivisionStore(String divNumber, String strNumber) 
	{
		Facility f=null; //initializing object to null so as to not have a compiler error.
		
		Store store = new Store();
		
		if (divNumber.equals("001")) {
			if (strNumber.equals("00011")) {
				
				store.setId(1);
				store.setName("Mason BigBox");
				store.setAddress("5711 Fields Ertel Rd.");
				store.setCity("Mason");
				store.setState("OH");
				store.setZip("45249");
				store.setDivNo("001");
				store.setStrNo("00011");
				store.setSales("$25,000");
			}
			else if (strNumber.equals("00255")) {
				
				store.setId(2);
				store.setName("Downtown BigBox");
				store.setAddress("9330 Main St.");
				store.setCity("Cincinnati");
				store.setState("OH");
				store.setZip("45202");
				store.setDivNo("001");
				store.setStrNo("00255");
				store.setSales("$27500");
			}
			else if (strNumber.equals("00172")) {
				
				store.setId(3);
				store.setName("Goshen BigBox");
				store.setAddress("6777 Goshen Rd.");
				store.setCity("Goshen");
				store.setState("OH");
				store.setZip("45122");
				store.setDivNo("001");
				store.setStrNo("00172");
				store.setSales("$32,555.55");
			
			}
			else if (strNumber.equals("00075")) {
				
				store.setId(4);
				store.setName("Bridgetown BigBox");
				store.setAddress("3888 Race Rd.");
				store.setCity("Cincinnati");
				store.setState("OH");
				store.setState("45211");
				store.setDivNo("001");
				store.setStrNo("00075");
				store.setSales("$21425.37");
			}
			f=store;
		}
		else if (divNumber.equals("111")) {
			if (strNumber.equals("00001")) {
				
				store.setId(5);
				store.setName("Louisville BigBox");
				store.setAddress("1111 Washington St.");
				store.setCity("Louisville");
				store.setState("KY");
				store.setZip("40206");
				store.setDivNo("111");
				store.setStrNo("00001");
				store.setSales("$14432.77");
			}
			else if (strNumber.equals("00044")) {
				
				store.setId(5);
				store.setName("Lawrenceburg BigBox");
				store.setAddress("8000 Liberty S");
				store.setCity("Louisville");
				store.setState("KY");
				store.setZip("40204");
				store.setDivNo("111");
				store.setStrNo("00044");
				store.setSales("$17555.11");}
			f=store;
		}
		return f;
	}
}
