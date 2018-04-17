package loginStpDef;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep {
	@Then("^I should see the userform page$")
	public void seeTheUserForm() {
		
	}
	
	@Given("^I navigate to the login page$")
	public void navigateLoginPage() {
		
		System.out.println("Hola cucumber");
		
	}
	
	@And("^I enter the followin for login$")
	public void enterUserPass(DataTable table) {
		//List<List<String>>data = table.raw();
		//System.out.println("This is te data: " + data.get(0).get(1));
		
		List<User>usr = new ArrayList<User>();
		usr = table.asList(User.class);
		
		for (User user : usr) {
			System.out.println("Nombre: " + user.username);
			System.out.println("Password: " + user.password);
		}
		
		
		
	}
	
	@And("^I click login button$")
	public void clickLoginButton() {
		
	}
	
	
	public class User{
		public String username;
		public String password;
		
		
		public User(String userName, String passWord) {
			super();
			username = userName;
			password = passWord;
		}
		
		
	}
	
	
}
