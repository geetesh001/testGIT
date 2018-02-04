package practiceAPIcall;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Practice {
	
	@Test
	public void testOutPut()
	{
		given().
				get("http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=fad81d5c9cfcd6bc9456b97dc86c9deb").
		then().
				statusCode(200).log().all();		
	}

}
