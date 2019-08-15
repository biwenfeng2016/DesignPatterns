package daili;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class DoTest {

	@Test
	public void test(){

		Dog dog = new Dog();
		Dog dog1 = new Dog();
		Dog dog3 = new Dog();
		Animal dogProxy = (Animal) Proxy.newProxyInstance(dog.getClass().getClassLoader(),
				dog.getClass().getInterfaces(), new MyHandler(dog));
		try {
			String resultString = dogProxy.eat("水果",DogException.class);
			System.out.println(resultString);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
