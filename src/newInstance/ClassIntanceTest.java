package newInstance;

import org.junit.Test;

public class ClassIntanceTest {

    @Test
    public void testClassNewInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        DeepCloneDog dog = (DeepCloneDog) Class.forName("newInstance.DeepCloneDog").newInstance();
        dog.spellName();


    }

}
