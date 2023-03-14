package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;

public class TestAPI {
	
	@Test (priority=1, groups={"windows.regression"})
	public void getUsersInPageTwo() {
		
		Response response = given().when().get("https://reqres.in/api/users?page=2");
		int actualStatusCode = response.statusCode();
		Assert.assertEquals(actualStatusCode, 200);
		System.out.println("GetUsersInPageTwo");
	}
	
	@Test (priority=2, groups={"windows.regression"})
	public void getSingleUser() {
		
		Response response = given().when().get("https://reqres.in/api/users?page=2");
		ResponseBody responseBody = response.getBody();
		String actualResponseBody = responseBody.asString();
		Assert.assertTrue(actualResponseBody.contains("Michael"));
		System.out.println("getSingleUser");
	}
	
}

	