package mz.co.empresa;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Helper {

	public static Boolean isLoggedIn(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Cookie cookies[] = req.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("user")) {
				System.out.println("Cookie: " + cookies[i].getName() + " : " + cookies[i].getValue());
				return true;
			}
		}
		return false;
	}

	public static Boolean doLogout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Cookie cookies[] = req.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			Cookie cookie = cookies[i];
			if (cookie.getName().equals("user")) {
				System.out.println("cookie deleted");
				cookie.setMaxAge(0);
				resp.addCookie(cookie);
			}
		}
		return false;
	}

}
