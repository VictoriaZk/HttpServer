import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class GetRequest {
    static String returnPage(String request) throws Throwable{
        String path = "C:/Users/Artur/eclipse-workspace/HttpServer/src/pages/";
        String requstSplit[] = request.split(" ");
        String filename = requstSplit[1].substring(1);
        System.err.println(filename);
        String answer = "404";
        File file = new File(path + filename);
        FileReader fileReader = new FileReader(path + filename);
        if (file.exists()){
            answer = "200";
        }
        String response = "HTTP/1.1 "+ answer +" OK\r\n" +
                "Server: YarServer/2009-09-09\r\n" +
                "Content-Type: text/html\r\n" +
                "Content-Length: " + 1024 + "\r\n" +
                "Connection: close\r\n\r\n";
        String result = response;
        if(answer.equals("200")) {
            BufferedReader br = new BufferedReader(fileReader);
            while (true) {
                String s = br.readLine();
                if (s == null || s.trim().length() == 0) {
                    break;
                }
                result += s;
            }
        }
        return result;
    }
}
