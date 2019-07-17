package jp.co.sole;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CommeD")
public class CsvDownload extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/csv;charset=UTF8");
		String fileName = new String("member.csv".getBytes("Shift_JIS"), "ISO-8859-1");

		response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
		PrintWriter writer = response.getWriter();
		writer.write("abc,def,123\r\n");
		writer.write("あいう,感じ,0.123\r\n");
//		writer.flush();
		writer.close();
	}
}
