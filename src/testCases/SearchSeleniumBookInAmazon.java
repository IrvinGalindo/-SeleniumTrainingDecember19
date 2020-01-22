package testCases;

import java.io.IOException;

import enums.Action;
import enums.Option;
import exceptions.ActionException;
import pages.Amazon;
import utilities.Do;
import utilities.Wait;

public class SearchSeleniumBookInAmazon {
	
	public static void execute() throws ActionException, IOException {
		
		Do.action(Action.NAVIGATE, "www.amazon.com");
		Do.action(Action.CLICK, Amazon.clickBtn_All());
		Do.action(Action.SELECT, Option.BY_VISIBLE_TEXT, "Books", Amazon.select_Books());
		Do.action(Action.TYPE, "Selenium" , Amazon.txt_SearchBar());
		Do.action(Action.CLICK, Amazon.btn_Submit());
		Wait.implicit(5);
		Do.action(Action.SELECT, Option.BY_VISIBLE_TEXT, "Price: Low to High", Amazon.btn_StorBy());
		Do.action(Action.CLICK, Amazon.img_Book());
		Wait.implicit(5);
		if(Do.action(Action.VERIFY_IF_EXIST, Amazon.btn_Kindle())) {
			System.out.println("Contains");
		}else {
			System.out.println("Not Contains");
		}
}
}