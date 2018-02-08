package dk.alice.alice.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.net.*;
import java.io.*;

@Service("urlReader")
public class URLReader {

        @Autowired
        TextAnalysis textAnalysis;

        public String reader(String s) {
            try {
                URL oracle = new URL(s);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(oracle.openStream()));
                String inputLine = "";
                while (in.readLine() != null) {
                    inputLine += in.readLine();
                }
                in.close();
                return inputLine;
            }catch(Exception e){
                e.printStackTrace();
            }
            return null;
        }

}
