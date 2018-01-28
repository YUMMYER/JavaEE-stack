package utils;

import javax.servlet.http.Cookie;

public class CookieUtil {

    public static String getCookieValue(Cookie[] cookies, String cookie){
        String cookieValue = "";

        if (cookies != null){
            for(Cookie cookie1: cookies){
                if (cookie.equals(cookie1.getValue())){
                    cookieValue = cookie1.getValue();
                }
            }
        }
        return cookieValue;
    }
}
