package steps;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.lu.a.as;

public class ListofMapsSteps {
	@Given("the following data table")
	public void theFollowingDataTable(DataTable dataTable) {
	    List<Map<String,String>> asMaps = dataTable.asMaps();
	System.out.println(asMaps);
	System.out.println("-------------------------------------------------------------------");
	
	for (int i = 0; i < asMaps.size(); i++) {
		String firstname = asMaps.get(i).get("firstName");
		String lastname = asMaps.get(i).get("LastName");
		String dob = asMaps.get(i).get("dob");
		String city = asMaps.get(i).get("city");
		String country = asMaps.get(i).get("Country");
		String mobileNumber = asMaps.get(i).get("mobile number");
		System.err.println(firstname+" "+lastname+" "+dob+" "+city+" "+country+" "+mobileNumber);
	}
	
//	for (Map<String, String> map : asMaps) {
//		
//		Set<Entry<String,String>> entrySet2 = map.entrySet();
//		
//			for(Map.Entry<String, String> entrySet : map.entrySet()) {
//				String key = entrySet.getKey();
//				String value = entrySet.getValue();
//				System.out.println(key+" : "+value);
//			}
//	}
	
	
}
}