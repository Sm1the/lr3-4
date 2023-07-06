
/* Класс обрабатывает данные и отдает их в класс Ranner */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyScanner {

     void start() {
        Scanner userString = new Scanner(System.in);
        while (userString.hasNext()) {
            String collect = userString.next();
            System.out.println("Что ввел пользователь - " + collect + "");
            ArrayList<String> listString = new ArrayList<>();
            listString.add(collect);
            System.out.println("Что было занесено в Коллекцию - " + listString + "");
            System.out.print("Что было найдено в строке(только цифры)");

            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(collect);
            int start = 0;
            while (matcher.find(start)) {
                String value = collect.substring(matcher.start(), matcher.end());
                int result = Integer.parseInt(value);
                System.out.print(result);
                start = matcher.end();
        }
    }



}}
