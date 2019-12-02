import org.testng.annotations.*;

public class testAnnotations {


    @BeforeSuite
    public void Bsuite_methode()
    {
        System.out.println("**--Before Suite--**");
    }
    @AfterSuite
    public void Asuite_Method()
    {
        System.out.println("**--After Suite--**");
    }
    @BeforeTest
    public void Btest()
    {
        System.out.println("**--Before Test--**");
    }

    @AfterTest
    public void Atest()
    {
        System.out.println("**--After Test--**");
    }

    @BeforeMethod
    public void BMethod()
    {
        System.out.println("**--Before Method--**");
    }

    @AfterMethod
    public void AMethod()
    {
        System.out.println("**--After method--**");
    }
    @BeforeClass
    public void BClass()
    {
        System.out.println("**--Before Class--**");
    }

    @AfterMethod
    public void AClass()
    {
        System.out.println("**--After Class--**");
    }

    @BeforeGroups
    public void BGroups()
    {
        System.out.println("**--Before Groups--**");
    }

    @AfterGroups
    public void AGroups()
    {
        System.out.println("**--After Groups--**");
    }

    @Test
    public void ZeroPrityTest()
    {
        System.out.println("Zero Priority Test");
    }

    @Test(priority = 1)
    public void PrityTest()
    {
        System.out.println("Priority Test=1");
    }
}
