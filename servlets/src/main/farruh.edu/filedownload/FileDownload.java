package filedownload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileDownload extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        String filename = "Receipt.pdf";
        String filePath = "/Volumes/Hard Drive/mum_courses/JavaEE-stack";

        resp.setContentType("APPLICATION/OCTET-STREAM");
        resp.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
        FileInputStream fileInputStream = new FileInputStream(filePath + filename);
        int i;

        while ((i = fileInputStream.read()) != -1) {
            printWriter.write(i);
        }

        fileInputStream.close();
        printWriter.close();

    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }
}
