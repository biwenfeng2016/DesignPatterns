package exception;

public enum ErrorCodeEnum {
    SYS_ERROR("SYS_ERROR","系统错误,请重写"),
    UNKOWN_ERROR("UNKOWN_SYS_ERROR","未知的系统异常"),
    SERVICE_INVOKE_FAIL("SERVICE_INVOKE_FAIL", "服务调用失败"),
    ILLEGAL_ARGS("ILLEGAL_ARGS", "参数校验错误"),
    ;

    /**
     * 结果异常
     */
    private String code;
    /**
     * 描述
     */
    private String decs;

    ErrorCodeEnum(String code, String decs) {
        this.code = code;
        this.decs = decs;
    }

    public static ErrorCodeEnum getByValue(String code){
        for (ErrorCodeEnum result : values()) {
            if (code.equals(result.getCode())){
                return result;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }
}

