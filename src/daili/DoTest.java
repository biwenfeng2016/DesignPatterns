package daili;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class DoTest {

	@Test
	public void test(){

		Dog dog = new Dog();
		Animal dogProxy = (Animal) Proxy.newProxyInstance(dog.getClass().getClassLoader(),
				dog.getClass().getInterfaces(), new MyHandler(dog));
		try {
			dogProxy.eat("水果",DogException.class);	
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
