package rongyan.rntissue.repo.httpModel;

public class ResultResponse {

    private int code = 0;

    private String msg;

    private Object data;

    public ResultResponse(){

    }


    public ResultResponse(Object data) {
        this.data = data;
    }

    public ResultResponse(ResultResponseEnum resultResponseEnum){
        this.code = resultResponseEnum.getCode();
        this.msg = resultResponseEnum.getMsg();
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
