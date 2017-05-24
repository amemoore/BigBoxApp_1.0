public class Store extends Facility{
	
	private String strNo;
	private String divNo;
	private String sales;
	
	
	public Store()
	{
		super ( );
		strNo = "";
		divNo = "";
		sales = "";
	}

	public String getStrNo() {
		return strNo;
	}

	public void setStrNo(String str) {
		strNo = str;
	}

	public String getDivNo() {
		return divNo;
	}

	public void setDivNo(String divNo) {
		this.divNo = divNo;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}
	
	@Override
	public String toString(){
		System.out.println("The following store was found for Division " + divNo+ " and Store " + strNo+ ".");
		System.out.println("[Store No: " + strNo + ", Division No.: " + divNo + ", Sales: " + sales + "]");
		return super.toString() ;
	}
}