@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean expected = true;
	assertEquals("Проверка не пройдена: ожидалось, что для возраста больше 18 лет вернется true", expected, isAdult);
    
}
