package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class AboutPage {
	  
	  Properties prop;
	public WebDriver driver;
	 
	  public AboutPage()
	    {
	     try
	     {
	      prop = new Properties();
	      prop.load(new FileInputStream("Configurations.properties"));
		 }
	     catch (IOException e) 
	     {
		  e.printStackTrace();
		 }
	    }
	  //*********Web Elements*********
	    String about = "About";
	    String students = "Students";
	    String addstudent = "New";
	    String lastname = "input[name='LastName']";
		String firstname = "input[name='FirstMidName']";
		String date = "input[name='EnrollmentDate']";
		String submit = "input[value='Create']";
		String edit = "Edit";
		String delete = "Delete";
		String delete_confirm = "input[value='Delete']";
		String save = "input[value='Save']";
		String courses = "Courses";
		String addcourse = "New";
		String number = "input[name='CourseID']";
		String title = "input[name='Title']";
		String credits = "input[name='Credits']";
        String instructor = "Instructors";
		String addinstructor = "New";
		String hiredate = "input[name='HireDate']";
		String location = "input[id='OfficeAssignment_Location']";
        String departments = "Departments";
        String add_depart = "New";
        String dep_name = "input[name='Name']";
        String dep_budget = "input[name='Budget']";
        String startdate = "input[name='StartDate']";


    public void openHomePage() throws IOException, InterruptedException
	    {
		 driver = BrowserConfig.openbrowser();
		 driver.navigate().to(prop.getProperty("URL"));
	    }
     public void clickAboutPage()
        {
         driver.findElement(By.partialLinkText(about)).click();
	    }
	public void clickStudentsPage()
	{
		driver.findElement(By.partialLinkText(students)).click();
	}
	public void addStudent () throws InterruptedException
	{
		driver.findElement(By.partialLinkText(addstudent)).click();
		driver.findElement(By.cssSelector(lastname)).click();
		driver.findElement(By.cssSelector(lastname)).sendKeys("John");
		driver.findElement(By.cssSelector(firstname)).click();
		driver.findElement(By.cssSelector(firstname)).sendKeys("Doe");
		driver.findElement(By.cssSelector(date)).click();
		driver.findElement(By.cssSelector(date)).sendKeys("02/01/2019");
		driver.findElement(By.cssSelector(submit)).click();
	}
	public void editStudent () throws InterruptedException {
		driver.findElement(By.partialLinkText(edit)).click();
		driver.findElement(By.cssSelector(firstname)).click();
		driver.findElement(By.cssSelector(firstname)).clear();
		driver.findElement(By.cssSelector(firstname)).sendKeys("Edited");
		driver.findElement(By.cssSelector(save)).click();
	}

	public void deleteStudent() throws InterruptedException
	{
		driver.findElement(By.partialLinkText(delete)).click();
		driver.findElement(By.cssSelector(delete_confirm)).click();

	}
	public void clickCoursesPage()
	{
		driver.findElement(By.partialLinkText(courses)).click();
	}
	public void addCourse () throws InterruptedException
	{
		driver.findElement(By.partialLinkText(addcourse)).click();
		driver.findElement(By.cssSelector(number)).click();
		driver.findElement(By.cssSelector(number)).sendKeys("1");
		driver.findElement(By.cssSelector(title)).click();
		driver.findElement(By.cssSelector(title)).sendKeys("Test_Course");
		driver.findElement(By.cssSelector(credits)).click();
		driver.findElement(By.cssSelector(credits)).sendKeys("5");
		driver.findElement(By.cssSelector(submit)).click();
	}
	public void editCourse () throws InterruptedException {
		driver.findElement(By.partialLinkText(edit)).click();
		driver.findElement(By.cssSelector(title)).click();
		driver.findElement(By.cssSelector(title)).clear();
		driver.findElement(By.cssSelector(title)).sendKeys("Course Edited");
		driver.findElement(By.cssSelector(save)).click();
	}
    public void deleteCourse() throws InterruptedException
    {
        driver.findElement(By.partialLinkText(delete)).click();
        driver.findElement(By.cssSelector(delete_confirm)).click();

    }

	public void clickInstructorPage()
	{
		driver.findElement(By.partialLinkText(instructor)).click();
	}
	public void addInstructor () throws InterruptedException
	{
		driver.findElement(By.partialLinkText(addinstructor)).click();
		driver.findElement(By.cssSelector(lastname)).click();
		driver.findElement(By.cssSelector(lastname)).sendKeys("Tom");
		driver.findElement(By.cssSelector(firstname)).click();
		driver.findElement(By.cssSelector(firstname)).sendKeys("Ford");
		driver.findElement(By.cssSelector(hiredate)).click();
		driver.findElement(By.cssSelector(hiredate)).sendKeys("02/01/2019");
		driver.findElement(By.cssSelector(location)).click();
		driver.findElement(By.cssSelector(location)).sendKeys("New York");
		driver.findElement(By.cssSelector(submit)).click();
	}
	public void editInstructor () throws InterruptedException {
		driver.findElement(By.partialLinkText(edit)).click();
		driver.findElement(By.cssSelector(lastname)).click();
		driver.findElement(By.cssSelector(lastname)).clear();
		driver.findElement(By.cssSelector(lastname)).sendKeys("Tom Edited");
		driver.findElement(By.cssSelector(save)).click();
	}

    public void deleteInstructor() throws InterruptedException
    {
        driver.findElement(By.partialLinkText(delete)).click();
        driver.findElement(By.cssSelector(delete_confirm)).click();

    }
    public void clickDepartmentsPage()
    {
        driver.findElement(By.partialLinkText(departments)).click();
    }
    public void addDepartments () throws InterruptedException
    {
        driver.findElement(By.partialLinkText(add_depart)).click();
        driver.findElement(By.cssSelector(dep_name)).click();
        driver.findElement(By.cssSelector(dep_name)).sendKeys("Software");
        driver.findElement(By.cssSelector(dep_budget)).click();
        driver.findElement(By.cssSelector(dep_budget)).sendKeys("45000");
        driver.findElement(By.cssSelector(startdate)).click();
        driver.findElement(By.cssSelector(startdate)).sendKeys("02/01/2019");
        driver.findElement(By.cssSelector(submit)).click();
    }
    public void editDepartments () throws InterruptedException {
        driver.findElement(By.partialLinkText(edit)).click();
        driver.findElement(By.cssSelector(dep_name)).click();
        driver.findElement(By.cssSelector(dep_name)).clear();
        driver.findElement(By.cssSelector(dep_name)).sendKeys("Software Edited");
        driver.findElement(By.cssSelector(save)).click();
    }

    public void deleteDepartments() throws InterruptedException
    {
        driver.findElement(By.partialLinkText(delete)).click();
        driver.findElement(By.cssSelector(delete_confirm)).click();

    }
        public void waitFunction() {
	 	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		}
     public void closePage()
        {
    	 driver.quit();
        }
     /*public void assertion()
       {
        Assert.assertTrue(driver.findElement(By.className(DateRange)).isDisplayed());
       }
*/

}
