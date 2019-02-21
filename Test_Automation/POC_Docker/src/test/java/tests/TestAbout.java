package tests;


import objectRepo.AboutPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestAbout {
  AboutPage about = new AboutPage();

  @BeforeTest
    public void beforeTest() throws InterruptedException, IOException
    {
        about.openHomePage();
    }
  
  @Test(priority = 1)
  public void About()  throws InterruptedException, IOException {
      about.clickAboutPage();
  }

  @Test(priority = 2)
  public void Student() throws InterruptedException, IOException {
      about.clickStudentsPage();
      about.waitFunction();
      about.addStudent();
      about.waitFunction();
      about.editStudent();
      about.waitFunction();
      about.deleteStudent();
  }

  /*@Test(priority = 3)
          public void Course() throws InterruptedException, IOException {
      //about.deleteStudent();
      about.waitFunction();
      about.clickCoursesPage();
      about.addCourse();
      about.waitFunction();
      about.editCourse();
      about.waitFunction();
      //about.deleteCourse();

  }*/
  @Test(priority = 4)
          public void Instructor() throws InterruptedException, IOException {
      about.clickInstructorPage();
      about.addInstructor();
      about.waitFunction();
      about.editInstructor();
      about.waitFunction();
  }
  @Test(priority = 5)
          public void Department() throws InterruptedException, IOException {
   about.clickDepartmentsPage();
   about.waitFunction();
   about.addDepartments();
   about.waitFunction();
   about.editDepartments();
   about.waitFunction();
   about.deleteDepartments();
  }
  
 @AfterTest
  public void afterTest()
  {
   about.closePage();
  }
}