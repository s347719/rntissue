package rongyan.rntissue.repo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import com.alibaba.fastjson.JSONObject;
import rongyan.rntissue.repo.httpModel.ResultResponse;
import rongyan.rntissue.repo.httpModel.ResultResponseEnum;
import rongyan.rntissue.repo.util.ResultResponseUtil;
import rongyan.rntissue.repo.util.JwtUtil;

public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setCharacterEncoding("utf-8");
        String token = request.getHeader("access_token");
        //token不存在
        if (null != token) {
            //验证token是否正确
            boolean result = JwtUtil.verify(token);
            if (result) {
                return true;
            }
        }
        ResultResponse resultResponse = ResultResponseUtil.getApiResponse(ResultResponseEnum.AUTH_ERROR);
        responseMessage(response,response.getWriter(), resultResponse);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    /**
     * 返回信息给客户端
     *
     * @param response
     * @param out
     * @param resultResponse
     */
    private void responseMessage(HttpServletResponse response, PrintWriter out, ResultResponse resultResponse) {
        response.setContentType("application/json; charset=utf-8");
        out.print(JSONObject.toJSONString(resultResponse));
        out.flush();
        out.close();
    }
}
