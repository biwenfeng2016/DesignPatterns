package daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyHandler implements InvocationHandler {

	public Dog dog;

	public MyHandler(Dog dog) {
		this.dog = dog;
	}

	private static final Logger log = LoggerFactory.getLogger(MyHandler.class);

	@Override
	public Object invoke(Object arg0, Method method, Object[] arg2)
			throws Throwable {

		try {
			//获取对象的方法
			List<Class> list = new ArrayList<Class>();
			for(Parameter parameter:method.getParameters()){
				list.add(parameter.getType());
			}
			Class[] clazzs = new Class[list.size()];
			list.toArray(clazzs);
			Method dogMethod = dog.getClass().getMethod(method.getName(), clazzs);
			String result = (String) method.invoke(dog, arg2);
			Class<RuntimeException> exceptionClass = (Class<RuntimeException>) arg2[arg2.length - 1];
			Object[] params = new Object[] {result};
			Class<Object>[] paramTypes = new Class[] { String.class };
			RuntimeException exception = (RuntimeException) exceptionClass
					.getSuperclass().getConstructor(paramTypes)
					.newInstance(params);
			Parameter[] parameters = dogMethod.getParameters();
			StringBuilder logBuilder = new StringBuilder();
			logBuilder.append("方法名="+dogMethod.getName()+",");
			for (int i = 0; i < parameters.length; i++) {
				if (parameters[i].isAnnotationPresent(ParamName.class)) {
					logBuilder.append(",参数名："+parameters[i].getAnnotation(
							ParamName.class).value()+"="+arg2[i]);
				}else{
					throw new RuntimeException(dog.getClass()+ "：参数 "+parameters[i]+"未加@ParamName注解");
				}
			}		
			
			log.info(logBuilder.toString());
			if (log.isInfoEnabled()) {
				log.info(logBuilder.toString());
				
			}
			throw exception;
		} catch (Exception e) {
			throw e;

		}
	}

}
