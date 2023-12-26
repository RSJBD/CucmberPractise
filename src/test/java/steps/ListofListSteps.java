package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.lu.a.as;

public class ListofListSteps {


	@Given("Precondition is given")
	public void preconditionIsGiven(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
/****Method 1 to access*****/		
		List<List<String>> asLists = dataTable.asLists();
		List<String> list2 = asLists.get(0);
		List<String> list3 = asLists.get(1);
		for (String string : list3) {
			System.out.println("2nd :"+string);
		}
		for (String string : list2) {
			System.out.println("1St :"+string);
		}
			
		/****Method 2 to access*****Best Way to access ***/			
		for (int i = 0; i < asLists.size(); i++) 
		{//asLists was give the Toltal list count
			List<String> list = asLists.get(i);//oru oru list varum 
			int sublistSize = list.size();//antha oru list kulla irrukura data ha size varum 
			for (int j = 0; j < sublistSize; j++) 
			{
				System.out.println(list.get(j));
			}
		}
		/****Method 3 to access*****/	
//		List<List<String>> lists = dataTable.asLists();
//		System.out.println(lists);
//		System.out.println("-----------------------------------------------------");
//		for (List<String> list : lists) {
//			for (String list2 : list) {
//				System.out.print(list2 +"\t");
//			}
//		}
	}

}


