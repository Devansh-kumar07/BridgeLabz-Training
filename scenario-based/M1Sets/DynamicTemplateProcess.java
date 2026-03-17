package M1Sets;

import java.util.*;

class TemplateProcessor {

    public String processLine(String line) {

        while(line.contains("${")) {

            int start = line.indexOf("${");
            int end = line.indexOf("}");

            String content = line.substring(start + 2, end); // TYPE:VALUE
            String[] parts = content.split(":");

            String type = parts[0];
            String value = parts[1];
            String result = "INVALID";

            if(type.equals("UPPER")) {
                result = value.toUpperCase();
            }

            else if(type.equals("LOWER")) {
                result = value.toLowerCase();
            }

            else if(type.equals("REPEAT")) {

                String[] r = value.split(",");
                String word = r[0];
                int count = Integer.parseInt(r[1]);

                String temp = "";

                for(int i = 0; i < count; i++) {
                    temp += word;
                }

                result = temp;
            }

            else if(type.equals("DATE")) {

                String[] d = value.split("-");
                int day = Integer.parseInt(d[0]);
                int month = Integer.parseInt(d[1]);
                int year = Integer.parseInt(d[2]);

                if(day>=1 && day<=31 && month>=1 && month<=12) {
                    result = year + "/" +
                            String.format("%02d",month) + "/" +
                            String.format("%02d",day);
                }
            }
            

            line = line.substring(0,start) + result + line.substring(end+1);
        }

        return line;
    }
}

public class DynamicTemplateProcess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
       

        TemplateProcessor tp = new TemplateProcessor();

        for(int i = 0; i < n; i++) {
-
            String line = sc.nextLine();
            System.out.println(tp.processLine(line));
        }
    }
}