package StepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class DataTable_StepDef {

	@Given("User has Logged in Application")
	public void user_has_logged_in_application() {
		System.out.println("user_has_logged_in_application()");
	}

	@When("I want to write a step with Data Table as List")
	public void i_want_to_write_a_step_with_data_table(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();

		// Print Cities of Each Entry
		for (List<String> each : data) {
			System.out.println("Print 2nd Row City is " + each.get(2));
		}
	}

	@When("I want to write a step with Data Table as Map")
	public void i_want_to_write_a_step_with_data_table_as_Map(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();

		// Print Cities of Each Entry
		for (Map<String, String> each : data) {
			System.out.println("Print 2nd Row City is " + each.get("City"));
		}
	}
	
	@Then ("User is done")
	public void user_is_done() {
		System.out.println("user_is_done()");
	}
}
