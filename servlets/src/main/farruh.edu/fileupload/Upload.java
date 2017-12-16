package fileupload;

import com.oreilly.servlet.MultipartRequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Upload extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Initialization");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Uploading");
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        MultipartRequest multipartRequest = new MultipartRequest(req,"/Volumes/Hard Drive/mum_courses/JavaEE-stack");
        printWriter.print("Successfully uploaded");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
