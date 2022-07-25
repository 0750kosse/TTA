import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import UnitTests.CharacterUnitTests;
import UnitTests.MapUnitTests;

@RunWith(Suite.class)
@SuiteClasses({
	MapUnitTests.class, 
	CharacterUnitTests.class
})
public class AllTests {

}
