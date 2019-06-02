package rongyan.rntissue.repo.util;

import rongyan.rntissue.repo.httpModel.ResultResponse;
import rongyan.rntissue.repo.httpModel.ResultResponseEnum;

public class ResultResponseUtil {

    /**
     * 获取请求成功响应的ApiResponse
     *
     * @param data
     * @return
     */
    public static ResultResponse getApiResponse(Object data) {
        return getApiResponse(data, ResultResponseEnum.TOKEN_SUCCESS.getErrCode(), ResultResponseEnum.TOKEN_SUCCESS.getErrMsg());
    }

    /**
     * 获取其他请求响应的ApiResponse
     *
     * @param code
     * @param msg
     * @return
     */
    public static ResultResponse getApiResponse(int code, String msg) {
        return getApiResponse(null, code, msg);
    }

    /**
     * 枚举信息转统一返回对象
     *
     * @param resultResponseEnum
     * @return
     */
    public static ResultResponse getApiResponse(ResultResponseEnum resultResponseEnum) {
        return getApiResponse(resultResponseEnum.getErrCode(), resultResponseEnum.getErrMsg());
    }


    public static ResultResponse getApiResponse(Object data, int code, String msg) {
        ResultResponse resultResponse = new ResultResponse(data);
        resultResponse.setErrCode(code);
        resultResponse.setErrMsg(msg);
        return resultResponse;
    }
}
