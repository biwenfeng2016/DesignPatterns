package newInstance;

import org.junit.Test;

public class ClassIntanceTest {

    @Test
    public void testClassNewInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Dog dog = (Dog) Class.forName("newInstance.Dog").newInstance();
        dog.spellName();


    }

}
