package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class AllTableSteps {
	 @Given("I have the following data")
	    public void iHaveTheFollowingData(DataTable dataTable) {
	        // 1. List of Lists
	        List<List<String>> listTable = dataTable.asLists();
	        System.out.println("List of Lists:");
	        System.out.println(listTable);

	        // 2. List of Maps
	        List<Map<String, String>> mapListTable = dataTable.asMaps();
	        System.out.println("List of Maps:");
	        System.out.println(mapListTable);

	        // 3. Map
	        Map<String, String> mapTable = dataTable.asMap();
	        System.out.println("Map:");
	        System.out.println(mapTable);

	        // 4. Map of Lists
//	        Map<String, List<String>> mapOfListsTable = dataTable.asMaps();
//	        System.out.println("Map of Lists:");
//	        System.out.println(mapOfListsTable);
//
//	        // 5. Map of Maps
//	        Map<String, Map<String, String>> mapOfMapsTablee = dataTable.asMap();
//	        System.out.println("Map of Maps:");
//	        System.out.println(mapOfMapsTablee);
	    }
	}

