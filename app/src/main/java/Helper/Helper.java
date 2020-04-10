package Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Helper {
    static String stream = null;
    private Object BufferedReader;

    public Helper(){

    }
    public String getHTTPData(String urlString){
        try{
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpsURLConnection)url.openConnecttion();
            if(httpURLConnection.getResponseCode() == 200)
            {
                BufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sd = new StringBuilder();
                String line;
                while({line = r.readLine()}!=null)
                    sb.append(line);
                stream = sb.toString();
                httpURLConnection.disconnect();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stream;
    }
}
