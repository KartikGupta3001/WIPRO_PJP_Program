package suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({demo1Test.class,Demo2Test.class,EmployeeTest.class})
public class AllTest {
}
