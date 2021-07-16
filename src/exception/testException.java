package exception;

import org.junit.Test;

public class testException {

    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String name = null;
        ErrorCodeEnum errorCode = ErrorCodeEnum.getByValue("SYS_ERROR");
        String obj = (String)Class.forName("java.lang.String").newInstance();
        int i = 0;
        try {
            if (name == null) {
                throw new KomaException(ErrorCodeEnum.ILLEGAL_ARGS);
            }
            if (i == 0) {
                throw new KomaException(ErrorCodeEnum.ILLEGAL_ARGS, "参数不能为0");
            }
        } catch (KomaException e) {
            e.printStackTrace();
            System.out.println("异常码：" + e.getErrorCode().getCode());
            System.out.println("异常描述：" + e.getMessage());
        }
    }
}
