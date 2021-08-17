package newInstance;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class ConstructorNewInstanceTest {

    @Test
    public void ConstructorNewInstanceTest() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        DeepCloneDog dog = (DeepCloneDog) Class.forName("newInstance.DeepCloneDog").getDeclaredConstructor(new Class[]{String.class}).newInstance("泰迪");
        dog.spellName();

    }


}
