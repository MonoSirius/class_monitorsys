package ustc.sse.student_class_status_monitor_sys.interceptor;

import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.servlet.HandlerInterceptor;
import ustc.sse.student_class_status_monitor_sys.utils.JWTUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * student_class_status_monitor_sys
 *
 * created by https://github.com/MonoSirius 16:47
 * copyright (c) USTC. All rights reserved.
 * 2022/11/2
 */
public class JWTInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Map<String, Object> map = new HashMap<>();

        //获取请求头中的令牌
        String token = request.getHeader("token");

        try {
            //验证令牌
            DecodedJWT verify = JWTUtils.verify(token);
            return true;
        } catch (SignatureVerificationException e){
            e.printStackTrace();
            map.put("msg","无效签名");
        } catch (TokenExpiredException e){
            e.printStackTrace();
            map.put("msg","token过期");
        } catch (AlgorithmMismatchException e){
            e.printStackTrace();
            map.put("msg","token算法不一致");
        } catch (Exception e){
            e.printStackTrace();
            map.put("msg","token无效");
        }
        map.put("state","flase");

        //将map转为json
        String json = new ObjectMapper().writeValueAsString(map);
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().println(json);
        return false;
    }
}
