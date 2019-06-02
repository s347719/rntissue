package rongyan.rntissue.repo.httpModel;

public class ResultResponse {

    private int errCode = 0;

    private String errMsg;

    private Object data;

    public ResultResponse(){

    }


    public ResultResponse(Object data) {
        this.data = data;
    }

    public ResultResponse(ResultResponseEnum resultResponseEnum){
        this.errCode = resultResponseEnum.getErrCode();
        this.errMsg = resultResponseEnum.getErrMsg();
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultResponse{" +
                "errCode=" + errCode +
                ", errMsg='" + errMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
