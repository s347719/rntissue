package rongyan.rntissue.repo.httpModel;

public enum ResultResponseEnum {
    /**
     * API调用成功返回
     */
    SERVER_SUCCESS(200,"成功"),
    REQUEST_ERROR(201,"请求失败"),
    SERVER_ERROR(100,"系统异常"),
    BIND_ERROR(101,"参数校验异常"),
    SESSION_ERROR(102,"没有SESSION"),
    REQUEST_OVER_LIMIT(104,"请求次数过多"),
    TOKEN_SUCCESS(10000,"认证成功"),
    FAIL(10001,"请求失败"),
    LOGIN_FAIL(10099,"登陆失败"),
    AUTH_ERROR(10100,"认证失败");


    private int code = 0;

    private String msg;


    private ResultResponseEnum(int errCode, String msg) {
        this.code = errCode;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
