import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterData {
    public static void main(String[] args) {
        String date = "241 Янв, 1978";
        String regex = "^(([1-9])|([1-2][0-9])|([3][0-1]))\\s(Янв|Фев|Мар|Апр|Май|Июн|Июл|Авг|Сен|Окт|Ноя|Дек),\\s[1-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        if(matcher.find()) {
            System.out.println("Ok!");
        }
        else{
            System.out.println("Not ok!");
        }
    }
}
