package newInstance;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class ConstructorNewInstanceTest {

    @Test
    public void ConstructorNewInstanceTest() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Dog dog = (Dog) Class.forName("newInstance.Dog").getDeclaredConstructor(new Class[]{String.class}).newInstance("泰迪");
        dog.spellName();

    }


}
