@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
    this.result = result;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
	return new Object[][] {
		{21, true},
        {17, false},
        {18, true},
        {19, true},
        
        
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
    int age = 18;
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("asdasfd", true ,isAdult);
	}
}
