package RPC;

import java.lang.reflect.Proxy;

public class Caller {
    public static void main(String args[]) {
        EchoService echo = (EchoService) Proxy.newProxyInstance(EchoService.class.getClassLoader(),
                new Class<?>[]{EchoService.class}, new DynamicProxyHandler());

        for (int i = 0; i < 3; i++) {
            System.out.println(echo.echo(String.valueOf(i)));
        }
    }
}