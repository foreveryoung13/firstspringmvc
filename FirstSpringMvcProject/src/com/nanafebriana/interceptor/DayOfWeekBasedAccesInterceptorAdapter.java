package com.nanafebriana.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccesInterceptorAdapter extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);

		if (dayOfWeek == 1) { // 1. Means Sunday, 2. Means Monday ...7 Means Saturday
			response.getWriter()
					.write("The Website is closed on Sunday; please Try accessing it " + "On any other week day !");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println(
				"HandlerInterceptorAdapter: Spring MVC called postHandle method for " + request.getRequestURI());
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println(
				"HandlerInterceptorAdapter : Spring MVC afterCompletion method for " + request.getRequestURI());
	}

}
