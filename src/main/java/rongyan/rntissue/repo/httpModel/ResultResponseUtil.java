package rongyan.rntissue.repo.httpModel;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class ResultResponseUtil {

    /**
     * 获取请求成功响应的ApiResponse
     *
     * @param data
     * @return
     */
    public static String getApiTokenResponse(Object data) {
        return getApiResponse(data, ResultResponseEnum.TOKEN_SUCCESS.getCode(), ResultResponseEnum.TOKEN_SUCCESS.getMsg());
    }

    /**
     * 获取其他请求响应的ApiResponse
     *
     * @param code
     * @param msg
     * @return
     */
    public static String getApiResponse(int code, String msg) {
        return getApiResponse(null, code, msg);
    }

    /**
     * 枚举信息转统一返回对象
     *
     * @param resultResponseEnum
     * @return
     */
    public static String getApiResponse(ResultResponseEnum resultResponseEnum) {
        return getApiResponse(resultResponseEnum.getCode(), resultResponseEnum.getMsg());
    }


    public static String getApiResponse(Object data, int code, String msg) {
        ResultResponse resultResponse = new ResultResponse(data);
        resultResponse.setCode(code);
        resultResponse.setMsg(msg);
        return JSONObject.toJSONString(resultResponse);
    }

    /**
     * 返回成功对象 code为200
     *
     * @param object 内容
     * @return alibaba 的String
     */
    public static String success(Object object) {
        ResultResponse resultResponse = new ResultResponse(object);
        resultResponse.setCode(ResultResponseEnum.SERVER_SUCCESS.getCode());
        resultResponse.setMsg(ResultResponseEnum.SERVER_SUCCESS.getMsg());
        return JSONObject.toJSONString(resultResponse, SerializerFeature.WriteMapNullValue);
    }
    /**
     * 返回成功对象 code为200
     *
     * @return alibaba 的String
     */
    public static String success() {
        ResultResponse resultResponse = new ResultResponse();
        resultResponse.setCode(ResultResponseEnum.SERVER_SUCCESS.getCode());
        resultResponse.setMsg(ResultResponseEnum.SERVER_SUCCESS.getMsg());
        return JSONObject.toJSONString(resultResponse, SerializerFeature.WriteMapNullValue);
    }
    public static String error() {
        ResultResponse resultResponse = new ResultResponse();
        resultResponse.setCode(ResultResponseEnum.REQUEST_ERROR.getCode());
        resultResponse.setMsg(ResultResponseEnum.REQUEST_ERROR.getMsg());
        return JSONObject.toJSONString(resultResponse, SerializerFeature.WriteMapNullValue);
    }

}
