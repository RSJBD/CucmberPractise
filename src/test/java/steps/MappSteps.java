package steps;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class MappSteps {
	@Given("the following data table Map")
	public void theFollowingDataTableMap(DataTable dataTable) {
	    
		Map<String, String> map = dataTable.asMap();
		
		for (Map.Entry<String, String> element : map.entrySet()) {
			String key = element.getKey();
			String value = element.getValue();
			System.out.println(key+" : "+value);
		}
		
		
	}
}
