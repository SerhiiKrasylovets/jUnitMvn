import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses(value = {CalcTest.class, Test_a.class})
@Categories.ExcludeCategory(value = {ExcludeTest.class})

public class TestSuite {
}
