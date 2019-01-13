package com.pages;

import com.driverClass;
import org.openqa.selenium.By;

public class DataTable_page extends driverClass

{

public void clickRegButton() {

    driver.findElement(By.linkText("Register")).click();
}




}
