package pojos;


public class Table {

	private String valueToBeSearched;
	private String url;
	private String verifyIfValue;

	public Table() {
		this.valueToBeSearched = "";
		this.url = "";
		this.verifyIfValue = "";
	}

	public Table(String valueToBeSearched, String url, String verifyIfValue) {
		this.valueToBeSearched = valueToBeSearched;
		this.url = url;
		this.verifyIfValue = verifyIfValue;
	}
	
	public String getValueToBeSearched() {
		return valueToBeSearched;
	}

	public void setValueToBeSearched(String valueToBeSearched) {
		this.valueToBeSearched = valueToBeSearched;
	}

	public String getUrl() {
		return url;
	}

	public void setURL(String URL) {
		this.url = URL;
	}
	
	public String getVerifyIfValue() {
		return verifyIfValue;
	}

	public void setVerifyIfValue(String verifyIfValue) {
		this.verifyIfValue = verifyIfValue;
	}

}