package com.example.firstSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Calendar;

@Controller
public class YoilTeller {
    @RequestMapping("/yoilTeller") // http://localhost/yoilTeller?year=2024&month=02&day=27
    public void main(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String year = request.getParameter("year"); // year=2024
        String month = request.getParameter("month"); // month=02
        String day = request.getParameter("day"); // day=27
        
        int yyyy = Integer.parseInt(year);
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);

        Calendar cal = Calendar.getInstance();
        cal.set(yyyy,mm-1,dd);
        
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        char yoil = " 일월화수목금토".charAt(dayOfWeek);

        // 출력
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter(); // response 객체에서 브라우저로의 출력 스트림을 얻는다
        out.println(year+"년 "+month+"월 "+day+"일 "); // 브라우저에 결과를 주려면 이렇게 작성해야한다
        out.println(yoil+"요일입니다");
    }
}
