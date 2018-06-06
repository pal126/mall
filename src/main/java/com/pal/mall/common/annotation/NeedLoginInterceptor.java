/*
package com.pal.mall.common.annotation;

import com.alibaba.fastjson.JSON;
import com.pal.mall.common.Const;
import com.pal.mall.common.ResponseCode;
import com.pal.mall.common.ServerResponse;
import com.pal.mall.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.OutputStream;

@Service
public class NeedLoginInterceptor extends HandlerInterceptorAdapter {

    */
/**
     * 拦截业务处理
     * preHandle在进入controller之前调用
     * @param request request
     * @param response response
     * @param handler handler
     * @return boolean
     * @throws Exception Exception
     *//*

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (handler instanceof HandlerMethod) {

            User user = null;
            HttpSession session = request.getSession(false);
            if (session != null) {
                user = (User) session.getAttribute(Const.CURRENT_USER);
            }

            //获取@NeedLogin注解
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            NeedLogin needLogin = handlerMethod.getMethodAnnotation(NeedLogin.class);
            if (needLogin == null) {
                return true;
            }

            boolean login = needLogin.needLogin();

            //验证登陆信息
            if (login) {
                if (user == null) {
                    render(response, ResponseCode.NEED_LOGIN.getDesc());
                    return false;
                }
            }
        }
        return true;
    }

    */
/**
     * 返回消息到前端
     * @param response response
     * @param string string
     * @throws Exception Exception
     *//*

    private void render(HttpServletResponse response, String string) throws Exception {
        response.reset();
        response.setContentType("application/json;charset=UTF-8");
        OutputStream out = response.getOutputStream();
        String str = JSON.toJSONString(ServerResponse.createByErrorMessage(string));
        out.write(str.getBytes("UTF-8"));
        out.flush();
        out.close();
    }

}
*/
