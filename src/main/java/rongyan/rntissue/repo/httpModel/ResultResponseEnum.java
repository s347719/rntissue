package rongyan.rntissue.repo.httpModel;

public enum ResultResponseEnum {
    /**
     * API调用成功返回
     */
    SERVER_SUCCESS(200,"成功"),
    SERVER_ERROR(100,"系统异常"),
    BIND_ERROR(101,"参数校验异常"),
    SESSION_ERROR(102,"没有SESSION"),
    REQUEST_ERROR(103,"没有SESSION"),
    REQUEST_OVER_LIMIT(104,"请求次数过多"),
    TOKEN_SUCCESS(10000,"认证成功"),
    FAIL(10001,"请求失败"),
    LOGIN_FAIL(10099,"登陆失败"),
    AUTH_ERROR(10100,"认证失败");


    private int errCode = 0;

    private String errMsg;


    private ResultResponseEnum(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
