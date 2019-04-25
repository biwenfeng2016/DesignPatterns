package daili;

public class Dog implements Animal {
	
	@Override
	public String eat(@ParamName("foot") String foot,@ParamName("clazz") Class <? extends RuntimeException> clazz
			){
		System.out.println("狗吃"+foot);
		return "狗吃错东西了";
	}

}
