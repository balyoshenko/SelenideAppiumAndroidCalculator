package test;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import utilits.TestBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;

public class CalculatorTest extends TestBase {


@Test
public void testCalculator(){

    $(By.name("2")).click();
    $(By.name("+")).click();
    $(By.name("4")).click();
    $(By.name("=")).click();

    $(By.className("android.widget.EditText")).shouldHave(text("6"));
    // assert $(By.className("android.widget.EditText")).getText().equals("6"):"Actual value is : "+$(By.className("android.widget.EditText")).getText()+" did not match with expected value: 6";

  }

}
