package com.ywing.platform.management;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YwingManagementServiceApplicationTests {

	@Test
	public void contextLoads() {
		//String requestURl="/group/123/user/1234s";
		//String str="/group/{*}/user/{*}";
		String requestURl="/group/get/user/123";
		String str="/group/get/user";
		String uri = str.replaceAll("\\{\\*\\}", "[a-zA-Z\\\\d]+");
		System.out.println(uri);
		String regEx = "^" + uri + "$";
		boolean ss= Pattern.compile(regEx).matcher(requestURl).find();
		System.out.println(ss);
	}

}
